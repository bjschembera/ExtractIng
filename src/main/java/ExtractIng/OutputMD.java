/*
 *  ExtractIng. An automated metadata extraction program 
 *  for simulation codes.
 *    
 *  Copyright (C) 2018,2019,2020  Bjoern Schembera, HLRS
 *  
 *  This file is part of ExtractIng (was: Harvester).
 *
 *  ExtractIng is free software: you can redistribute it 
 *  and/or modify it under the terms of the GNU General Public License 
 *  as published by the Free Software Foundation, either version 3 of 
 *  the License, or (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *
 */

package ExtractIng;

import java.io.File;
import java.io.FileWriter;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.SimpleDateFormat;

import java.util.Date;

import java.util.GregorianCalendar;
import java.util.HashMap;

import java.util.Map;
import java.util.Map.Entry;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;

import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.purl.dc.elements._1.SimpleLiteral;

import premis.ContentLocationComplexType;
import premis.FormatDesignationComplexType;
import premis.FormatRegistryComplexType;
import premis.StringPlusAuthority;

/**
 * 
 * This class implements the output methods for generating a valid XML of the
 * parsed metadata. The EngMetafXML method creates XML according to the EngMeta
 * metadata schema. DCtermsXML creates XML according to the Dublin Core metadata
 * model. FlatTxt creates a plain text listing of the parsed metadata.
 * 
 * @author Bjoern Schembera
 * 
 *
 */

public class OutputMD {

	/**
	 * Helper method that checks if a string "value" is part of the enumeration
	 * class "enumClass".
	 * 
	 * @param value
	 *            String that should be checked if it's part of the enumeration
	 * @param enumClass
	 *            Enumeration class that is checked against
	 * @return Boolean. True if "enumClass" contains "value", False otherwise
	 */

	private <E extends Enum<E>> boolean isInEnum(String value, Class<E> enumClass) {
		for (E e : enumClass.getEnumConstants()) {
			if (e.name().equals(value)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 
	 * This method outputs plain key,value-pairs to a text file. This is done by
	 * looking through the HashMap and writing out each entry as a line in the file.
	 * 
	 * @param parsedMD
	 *            HashMap structure containing the metadata as key, value-pairs
	 * @throws Exception
	 */
	public void FlatTxt(Map<String, HashMap<Integer, String>> parsedMD, String directoryToParse) throws Exception {

		System.out.println("============================================");
		System.out.println("The complete output as plain key,value pairs");

		// Open a file handle
		File file = new File(directoryToParse + "/.metadata/metadata.txt");
		file.getParentFile().mkdirs();

		FileWriter fr = new FileWriter(file);

		// Determine the line separator (is OS dependent)
		String newLine = System.getProperty("line.separator");

		// now loop through the results nested HashMap and write for each key all the
		// values in one row, separated by
		// a comma
		for (Entry<String, HashMap<Integer, String>> e : parsedMD.entrySet()) {
			Map<Integer, String> values = e.getValue();
			System.out.print(e.getKey() + ": ");
			fr.write(e.getKey() + ": ");
			// WARNING: for (int i = 0; i < values.size; i++) does not give the full
			// results.
			// This is why "null" values do not count as real values and are ommitted
			for (int i = 0; i < ExtractIng.NUMBER_OF_MD; i++) {

				System.out.print(values.get(i) + ",");
				if (values.get(i) == null) {
					fr.write(", ");
				} else {

					if (values.get(i).contains(",")) { // if the values include commas,
						// escape them in order to distinguish them from
						// the commas to separate them from the delimiting commas.

						fr.write(values.get(i).replace(",", "\\,") + ", ");

					} else {
						fr.write(values.get(i) + ", ");
					}
				}
			}
			fr.write(newLine);
			System.out.println();
		}

		// now close the file writer
		fr.close();

	}

	/**
	 * This method creates a Dublin Core terms compliant output form the passed
	 * HashMap structure that contain the metadata entries. This method is needed to
	 * comply with the SWORD API from Dataverse. By now only the mandatory fields
	 * are implemented.
	 * 
	 * @param parsedMD
	 *            HashMap structure containing the metadata as key, value-pairs
	 * @throws Exception
	 * 
	 * 
	 */
	public void DCTermsXML(Map<String, HashMap<Integer, String>> parsedMD, String directoryToParse) throws Exception {

		// Create a new root entry
		org.purl.dc.terms.entry atomEntry = new org.purl.dc.terms.entry();

		// Create an ObjectFactory do derive all the objects from
		org.purl.dc.terms.ObjectFactory objFacDCTerms = new org.purl.dc.terms.ObjectFactory();

		// Dummy literal is needed
		org.purl.dc.elements._1.SimpleLiteral dummyLiteral = new org.purl.dc.elements._1.SimpleLiteral();
		dummyLiteral.getContent().add("");

		/*
		 * Build all the dcterms variables with some dummy content For example, variable
		 * dcCreator includes the information for the line <dcterms:creator>...
		 */

		// Mandatory fields
		JAXBElement<SimpleLiteral> dcTitle = objFacDCTerms.createTitle(dummyLiteral);
		JAXBElement<SimpleLiteral> dcCreator = objFacDCTerms.createCreator(dummyLiteral);
		JAXBElement<SimpleLiteral> dcSubject = objFacDCTerms.createSubject(dummyLiteral);
		JAXBElement<SimpleLiteral> dcDescription = objFacDCTerms.createDescription(dummyLiteral);
		JAXBElement<SimpleLiteral> dcContributor = objFacDCTerms.createContributor(dummyLiteral);

		// Optional fields
		JAXBElement<SimpleLiteral> dcPublisher = objFacDCTerms.createPublisher(dummyLiteral);
		JAXBElement<SimpleLiteral> dcDate = objFacDCTerms.createDate(dummyLiteral);
		JAXBElement<SimpleLiteral> dcType = objFacDCTerms.createType(dummyLiteral);

		// TODO: implement all

		// Preload all the results for the mandatory fields
		HashMap<Integer, String> MD_creatorName = parsedMD.get("creator.name");
		HashMap<Integer, String> MD_contributorName = parsedMD.get("contributor.name");
		HashMap<Integer, String> MD_title = parsedMD.get("title");
		HashMap<Integer, String> MD_subjects = parsedMD.get("subjects.subject");
		HashMap<Integer, String> MD_description = parsedMD.get("description");

		/*
		 * Fill all the variables here with the parsed content
		 */
		// Set dc:title
		if (MD_title != null && MD_title.containsKey(0)) {
			org.purl.dc.elements._1.SimpleLiteral literal = new org.purl.dc.elements._1.SimpleLiteral();
			literal.getContent().add(MD_title.get(0));
			dcTitle.setValue(literal);
			atomEntry.getAny().add(dcTitle);
		}

		// Set dc:creator
		if (MD_creatorName != null && MD_creatorName.containsKey(0)) {
			org.purl.dc.elements._1.SimpleLiteral literal = new org.purl.dc.elements._1.SimpleLiteral();
			literal.getContent().add(MD_creatorName.get(0));
			dcCreator.setValue(literal);
			atomEntry.getAny().add(dcCreator);
		}

		// Set dc:contributor
		if (MD_contributorName != null && MD_contributorName.containsKey(0)) {
			org.purl.dc.elements._1.SimpleLiteral literal = new org.purl.dc.elements._1.SimpleLiteral();
			literal.getContent().add(MD_contributorName.get(0));
			dcContributor.setValue(literal);
			atomEntry.getAny().add(dcContributor);
		}

		// Set dc:subject
		if (MD_subjects != null && MD_subjects.containsKey(0)) {
			org.purl.dc.elements._1.SimpleLiteral literal = new org.purl.dc.elements._1.SimpleLiteral();
			literal.getContent().add(MD_subjects.get(0));
			dcSubject.setValue(literal);
			atomEntry.getAny().add(dcSubject);
		}

		// Set dc:description
		if (MD_description != null && MD_description.containsKey(0)) {
			org.purl.dc.elements._1.SimpleLiteral literal = new org.purl.dc.elements._1.SimpleLiteral();
			literal.getContent().add(MD_description.get(0));
			dcDescription.setValue(literal);
			atomEntry.getAny().add(dcDescription);
		}

		// set dc:type in any case since it is simulation data
		org.purl.dc.elements._1.SimpleLiteral literalType = new org.purl.dc.elements._1.SimpleLiteral();
		literalType.getContent().add("Simulation Data");
		dcType.setValue(literalType);
		atomEntry.getAny().add(dcType);

		// TODO: Implement all

		// Create marshaller object to alter the xml header output

		// Create it for the specific class
		JAXBContext jContext = JAXBContext.newInstance(org.purl.dc.terms.entry.class);

		Marshaller marshallObj = jContext.createMarshaller();

		// Setting the property to show xml format output
		marshallObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		// Now set the header
		marshallObj.setProperty("com.sun.xml.internal.bind.xmlHeaders", "<?xml version=\"1.0\"?>");
		marshallObj.setProperty(Marshaller.JAXB_FRAGMENT, true);

		System.out.println("============================================");
		System.out.println("The complete XML dcterms object by JAXB:");

		// Now marshall the instance to system out
		marshallObj.marshal(atomEntry, System.out);

		// Also write it out to a file
		File file = new File(directoryToParse + "/.metadata/atom.xml");
		file.getParentFile().mkdirs();
		marshallObj.marshal(atomEntry, file);

	}

	/**
	 * This method builds the XML according to the EngMeta specification.
	 * <p>
	 * This is done by filling a Java JAXB object that represents the EngMeta
	 * metadata model/XSD. The XSD was therefor automatically transfered to Java
	 * classes with the help of the xjc tool. With this tool, the packages
	 * dtc.dateType, exptml, org.purl.dc.terms, org.purl.dc.elements_1, premis and
	 * unitsml were created and are used here.
	 * 
	 * 
	 * @param parsedMD
	 *            Contains the data structure with the extracted metadata
	 * @param directoryToParse
	 *            The directory to parse which will also include the xml file
	 * @throws Exception
	 */

	public void EngMetaXML(Map<String, HashMap<Integer, String>> parsedMD, String directoryToParse) throws Exception {

		// Create an Object Factory of EngMeta where needed Objects can be derived
		EngMeta.ObjectFactory objFacEngMeta = new EngMeta.ObjectFactory();

		// Create an object factory for ExptML
		exptml.ObjectFactory objFacExptml = new exptml.ObjectFactory();

		// Create a PREMIS object factory
		premis.ObjectFactory objFacPremis = new premis.ObjectFactory();

		// Create the main dataset object with the object factory
		EngMeta.Dataset md = objFacEngMeta.createDataset();

		// Create the provenance object
		EngMeta.Dataset.Provenance prov = objFacEngMeta.createDatasetProvenance();

		/*
		 * General description of the implementation of the metadata entities, e.g. how
		 * to fill them.
		 * 
		 * Since we use a nested data structure, in the first step we have to stage the
		 * information we want to fill the metadata object with. In a second step, we
		 * loop through all the the values and actually fill the object.
		 */

		/*
		 * # Contact # # Name and contact information of a person or # organization that
		 * can handle requiries about the data over a long # time period. Role can be
		 * one of the following values: ContactPerson, DataCollector, # DataCurator,
		 * DataManager, Distributor, Editor, HostingInstitution", Other, Producer, #
		 * ProjectLeader, ProjectManager. ProjectMember, RegistrationAgency,
		 * RegistrationAuthority, # RelatedPerson, ResearchGroup, RightsHolder,
		 * Researcher, Sponsor, Supervisor, WorkPackageLeader contact.name
		 * contact.givenName contact.familyName contact.address contact.affiliation.name
		 * contact.affiliation.givenName contact.affiliation.familyName
		 * contact.affiliation.address contact.affiliation.email
		 * contact.affiliation.role contact.email contact.id contact.id.scheme
		 * contact.id.type contact.role
		 */

		/*
		 * First step: Staging of the relevant fields for a semantically linked unit (In
		 * this case, the CONTACT entity
		 */
		HashMap<Integer, String> MD_contactName = parsedMD.get("contact.name");
		HashMap<Integer, String> MD_contactGivenName = parsedMD.get("contact.givenName");
		HashMap<Integer, String> MD_contactFamilyName = parsedMD.get("contact.familyName");
		HashMap<Integer, String> MD_contactAddress = parsedMD.get("contact.address");

		HashMap<Integer, String> MD_contactAffiliationName = parsedMD.get("contact.affiliation.name");
		HashMap<Integer, String> MD_contactAffiliationGivenName = parsedMD.get("contact.affiliation.givenName");
		HashMap<Integer, String> MD_contactAffiliationFamilyName = parsedMD.get("contact.affiliation.familyName");
		HashMap<Integer, String> MD_contactAffiliationAddress = parsedMD.get("contact.affiliation.address");
		HashMap<Integer, String> MD_contactAffiliationEmail = parsedMD.get("contact.affiliation.email");
		HashMap<Integer, String> MD_contactAffiliationRole = parsedMD.get("contact.affiliation.role");

		HashMap<Integer, String> MD_contactEmail = parsedMD.get("contact.email");
		HashMap<Integer, String> MD_contactId = parsedMD.get("contact.id");
		HashMap<Integer, String> MD_contactIdScheme = parsedMD.get("contact.id.scheme");
		HashMap<Integer, String> MD_contactIdType = parsedMD.get("contact.id.type");
		HashMap<Integer, String> MD_contactRole = parsedMD.get("contact.role");

		/*
		 * Second step: Loop through all the values and fill the object.
		 * 
		 */

		for (int i = 0; i < ExtractIng.NUMBER_OF_MD; i++) {

			// Now loop through values here

			// Variable is needed to check if we should really set the a metadata entry
			// This is needed to prevent empty XML-tags in the complete XML object
			Boolean set = false;

			// Create the contact entity
			EngMeta.PersonOrOrganization contact = new EngMeta.PersonOrOrganization();

			// Create the contact affiliation entity
			EngMeta.PersonOrOrganization contactAffiliation = objFacEngMeta.createPersonOrOrganization();

			// Create an PID entity
			EngMeta.Pid contactId = objFacEngMeta.createPid();

			// Fill the name of the contact.
			if (MD_contactName != null && MD_contactName.containsKey(i)) {
				// fill it only if it exists and contains an entry
				contact.setName(MD_contactName.get(i));
				set = true;
			}

			// Fill the given name of the contact
			if (MD_contactGivenName != null && MD_contactGivenName.containsKey(i)) {
				contact.setGivenName(MD_contactGivenName.get(i));
				set = true;
			}

			// Fill the family name of the contact
			if (MD_contactFamilyName != null && MD_contactFamilyName.containsKey(i)) {
				contact.setFamilyName(MD_contactFamilyName.get(i));
				set = true;
			}

			// Fill the address of the contact
			if (MD_contactAddress != null && MD_contactAddress.containsKey(i)) {
				contact.setAddress(MD_contactAddress.get(i));
				set = true;
			}

			// Fill the name of the affiliation
			if (MD_contactAffiliationName != null && MD_contactAffiliationName.containsKey(i)) {
				contactAffiliation.setName(MD_contactAffiliationName.get(i));
				set = true;
			}

			// Fill the given name of the affiliation
			if (MD_contactAffiliationGivenName != null && MD_contactAffiliationGivenName.containsKey(i)) {
				contactAffiliation.setGivenName(MD_contactAffiliationGivenName.get(i));
				set = true;
			}
			// Fill the family name of the affiliation
			if (MD_contactAffiliationFamilyName != null && MD_contactAffiliationFamilyName.containsKey(i)) {
				contactAffiliation.setFamilyName(MD_contactAffiliationFamilyName.get(i));
				set = true;
			}
			// Fill the address of the affiliation
			if (MD_contactAffiliationAddress != null && MD_contactAffiliationAddress.containsKey(i)) {
				contactAffiliation.setAddress(MD_contactAffiliationAddress.get(i));
				set = true;
			}

			// Fill the email of the affiliation
			if (MD_contactAffiliationEmail != null && MD_contactAffiliationEmail.containsKey(i)) {
				contactAffiliation.setEmail(MD_contactAffiliationEmail.get(i));
				set = true;
			}

			// Fill the role of the affiliation
			if (MD_contactAffiliationRole != null && MD_contactAffiliationRole.containsKey(i)) {

				try { // TODO: find better solution than try/catch here
						// System.out.println(MD_contactRole.get(i) + "Role will now be set.");
					contactAffiliation
							.setRole(dtc.dateType.ContributorType.fromValue(MD_contactAffiliationRole.get(i)));
					set = true;
				} catch (IllegalArgumentException ex) {

				}

			}
			// Contacts Affiliation done, now set it.
			// Fill the contact affiliation with the recently filled affiliation object
			contact.setAffiliation(contactAffiliation);

			// Fill the role of the contact
			if (MD_contactRole != null && MD_contactRole.containsKey(i)) {
				// System.out.println("Role is existent. It is: " + MD_contactRole.get(i));

				try { // TODO: find better solution here
						// System.out.println(MD_contactRole.get(i) + "Role will now be set.");
					contact.setRole(dtc.dateType.ContributorType.fromValue(MD_contactRole.get(i)));
					set = true;
				} catch (IllegalArgumentException ex) {

				}

			}

			// Fill the ID
			if (MD_contactId != null && MD_contactId.containsKey(i)) {
				contactId.setValue(MD_contactId.get(i));
				set = true;
			}

			if (MD_contactIdScheme != null && MD_contactIdScheme.containsKey(i)) {
				contactId.setScheme(MD_contactIdScheme.get(i));
				set = true;
			}

			if (MD_contactIdType != null && MD_contactIdType.containsKey(i)) {
				contactId.setType(MD_contactIdType.get(i));
				set = true;
			}
			// Set the Contacts ID
			contact.getId().add(contactId);

			// Fill the email of the contact
			if (MD_contactEmail != null && MD_contactEmail.containsKey(i)) {

				contact.setEmail(MD_contactEmail.get(i));
				set = true;
			}

			// Only set the object if there was at least one entry, so no empty tags will
			// occur
			if (set)
				md.getContact().add(contact);

		}

		/*
		 * Creator
		 * 
		 * Name and affiliation of the author(s) of the data. These are the persons who
		 * created the data. Can be the same as the contact creator.name
		 * creator.givenName creator.familyName creator.address creator.affiliation.name
		 * creator.affiliation.givenName creator.affiliation.familyName
		 * creator.affiliation.address creator.affiliation.email creator.affiliation.id
		 * creator.affiliation.role creator.email creator.id creator.role
		 */

		HashMap<Integer, String> MD_creatorName = parsedMD.get("creator.name");
		HashMap<Integer, String> MD_creatorGivenName = parsedMD.get("creator.givenName");
		HashMap<Integer, String> MD_creatorFamilyName = parsedMD.get("creator.familyName");
		HashMap<Integer, String> MD_creatorAddress = parsedMD.get("creator.address");

		HashMap<Integer, String> MD_creatorAffiliationName = parsedMD.get("creator.affiliation.name");
		HashMap<Integer, String> MD_creatorAffiliationGivenName = parsedMD.get("creator.affiliation.givenName");
		HashMap<Integer, String> MD_creatorAffiliationFamilyName = parsedMD.get("creator.affiliation.familyName");
		HashMap<Integer, String> MD_creatorAffiliationAddress = parsedMD.get("creator.affiliation.address");
		HashMap<Integer, String> MD_creatorAffiliationEmail = parsedMD.get("creator.affiliation.email");
		HashMap<Integer, String> MD_creatorAffiliationRole = parsedMD.get("creator.affiliation.role");

		HashMap<Integer, String> MD_creatorEmail = parsedMD.get("creator.email");
		HashMap<Integer, String> MD_creatorId = parsedMD.get("creator.id");
		HashMap<Integer, String> MD_creatorIdScheme = parsedMD.get("creator.id.scheme");
		HashMap<Integer, String> MD_creatorIdType = parsedMD.get("creator.id.type");
		HashMap<Integer, String> MD_creatorRole = parsedMD.get("creator.role");

		// for value in number of entries:
		for (int i = 0; i < ExtractIng.NUMBER_OF_MD; i++) {

			// Now loop through values here

			// Variable is needed to check if we should really set the a metadata entry
			// This is needed to prevent empty XML-tags in the complete XML object
			Boolean set = false;

			EngMeta.PersonOrOrganization creator = new EngMeta.PersonOrOrganization();

			EngMeta.PersonOrOrganization creatorAffiliation = objFacEngMeta.createPersonOrOrganization();

			EngMeta.Pid creatorId = objFacEngMeta.createPid();

			if (MD_creatorName != null && MD_creatorName.containsKey(i)) {
				creator.setName(MD_creatorName.get(i));
				set = true;
			}

			if (MD_creatorGivenName != null && MD_creatorGivenName.containsKey(i)) {
				creator.setGivenName(MD_creatorGivenName.get(i));
				set = true;
			}

			if (MD_creatorFamilyName != null && MD_creatorFamilyName.containsKey(i)) {
				creator.setFamilyName(MD_creatorFamilyName.get(i));
				set = true;
			}

			if (MD_creatorAddress != null && MD_creatorAddress.containsKey(i)) {
				creator.setAddress(MD_creatorAddress.get(i));
				set = true;
			}

			// The creators affiliation
			if (MD_creatorAffiliationName != null && MD_creatorAffiliationName.containsKey(i)) {
				creatorAffiliation.setName(MD_creatorAffiliationName.get(i));
				set = true;
			}

			if (MD_creatorAffiliationGivenName != null && MD_creatorAffiliationGivenName.containsKey(i)) {
				creatorAffiliation.setGivenName(MD_creatorAffiliationGivenName.get(i));
				set = true;
			}

			if (MD_creatorAffiliationFamilyName != null && MD_creatorAffiliationFamilyName.containsKey(i)) {
				creatorAffiliation.setFamilyName(MD_creatorAffiliationFamilyName.get(i));
				set = true;
			}

			if (MD_creatorAffiliationAddress != null && MD_creatorAffiliationAddress.containsKey(i)) {
				creatorAffiliation.setAddress(MD_creatorAffiliationAddress.get(i));
				set = true;
			}

			if (MD_creatorAffiliationEmail != null && MD_creatorAffiliationEmail.containsKey(i)) {
				creatorAffiliation.setEmail(MD_creatorAffiliationEmail.get(i));
				set = true;
			}

			if (MD_creatorAffiliationRole != null && MD_creatorAffiliationRole.containsKey(i)) {

				try { // TODO: find better solution than try/catch here
						// System.out.println(MD_creatorRole.get(i) + "Role will now be set.");
					creatorAffiliation
							.setRole(dtc.dateType.ContributorType.fromValue(MD_creatorAffiliationRole.get(i)));
					set = true;
				} catch (IllegalArgumentException ex) {

				}

			}
			// creators Affiliation done, now set it:
			creator.setAffiliation(creatorAffiliation);

			if (MD_creatorRole != null && MD_creatorRole.containsKey(i)) {
				// System.out.println("Role is existent. It is: " + MD_creatorRole.get(i));

				try { // TODO: find better solution here
						// System.out.println(MD_creatorRole.get(i) + "Role will now be set.");
					creator.setRole(dtc.dateType.ContributorType.fromValue(MD_creatorRole.get(i)));
					set = true;
				} catch (IllegalArgumentException ex) {

				}

			}

			// The creators ID
			if (MD_creatorId != null && MD_creatorId.containsKey(i)) {
				creatorId.setValue(MD_creatorId.get(i));
				set = true;
			}

			// The creators ID
			if (MD_creatorId != null && MD_creatorId.containsKey(i)) {
				creatorId.setValue(MD_creatorId.get(i));
				set = true;
			}

			if (MD_creatorIdScheme != null && MD_creatorIdScheme.containsKey(i)) {
				creatorId.setScheme(MD_creatorIdScheme.get(i));
				set = true;
			}

			if (MD_creatorIdType != null && MD_creatorIdType.containsKey(i)) {
				creatorId.setType(MD_creatorIdType.get(i));
				set = true;
			}
			// Set the creators ID
			creator.getId().add(creatorId);

			if (MD_creatorEmail != null && MD_creatorEmail.containsKey(i)) {

				creator.setEmail(MD_creatorEmail.get(i));
				set = true;
			}

			// Only set the object if there was at least one entry, so no empty tags will
			// occur
			if (set)
				md.getCreator().add(creator);

		}

		/*
		 * Contributor Name and affiliation of all persons who contributed to the data.
		 * Role can be one of the following values: ContactPerson, DataCollector, #
		 * DataCurator, DataManager, Distributor, Editor, HostingInstitution", Other,
		 * Producer, # ProjectLeader, ProjectManager. ProjectMember, RegistrationAgency,
		 * RegistrationAuthority, # RelatedPerson, ResearchGroup, RightsHolder,
		 * Researcher, Sponsor, Supervisor, WorkPackageLeader contributor.name
		 * contributor.givenName contributor.familyName contributor.address
		 * contributor.affiliation.name contributor.affiliation.givenName
		 * contributor.affiliation.familyName contributor.affiliation.address
		 * contributor.affiliation.email contributor.affiliation.role contributor.email
		 * contributor.id contributor.id.scheme contributor.id.type contributor.role
		 */

		HashMap<Integer, String> MD_contributorName = parsedMD.get("contributor.name");
		HashMap<Integer, String> MD_contributorGivenName = parsedMD.get("contributor.givenName");
		HashMap<Integer, String> MD_contributorFamilyName = parsedMD.get("contributor.familyName");
		HashMap<Integer, String> MD_contributorAddress = parsedMD.get("contributor.address");

		HashMap<Integer, String> MD_contributorAffiliationName = parsedMD.get("contributor.affiliation.name");
		HashMap<Integer, String> MD_contributorAffiliationGivenName = parsedMD.get("contributor.affiliation.givenName");
		HashMap<Integer, String> MD_contributorAffiliationFamilyName = parsedMD
				.get("contributor.affiliation.familyName");
		HashMap<Integer, String> MD_contributorAffiliationAddress = parsedMD.get("contributor.affiliation.address");
		HashMap<Integer, String> MD_contributorAffiliationEmail = parsedMD.get("contributor.affiliation.email");
		HashMap<Integer, String> MD_contributorAffiliationRole = parsedMD.get("contributor.affiliation.role");

		HashMap<Integer, String> MD_contributorEmail = parsedMD.get("contributor.email");
		HashMap<Integer, String> MD_contributorId = parsedMD.get("contributor.id");
		HashMap<Integer, String> MD_contributorIdScheme = parsedMD.get("contributor.id.scheme");
		HashMap<Integer, String> MD_contributorIdType = parsedMD.get("contributor.id.type");
		HashMap<Integer, String> MD_contributorRole = parsedMD.get("contributor.role");

		// for value in number of entries:
		for (int i = 0; i < ExtractIng.NUMBER_OF_MD; i++) {

			// Now loop through values here

			// Variable is needed to check if we should really set the a metadata entry
			// This is needed to prevent empty XML-tags in the complete XML object
			Boolean set = false;

			EngMeta.PersonOrOrganization contributor = new EngMeta.PersonOrOrganization();

			EngMeta.PersonOrOrganization contributorAffiliation = objFacEngMeta.createPersonOrOrganization();

			EngMeta.Pid contributorId = objFacEngMeta.createPid();

			if (MD_contributorName != null && MD_contributorName.containsKey(i)) {
				contributor.setName(MD_contributorName.get(i));
				set = true;
			}

			if (MD_contributorGivenName != null && MD_contributorGivenName.containsKey(i)) {
				contributor.setGivenName(MD_contributorGivenName.get(i));
				set = true;
			}

			if (MD_contributorFamilyName != null && MD_contributorFamilyName.containsKey(i)) {
				contributor.setFamilyName(MD_contributorFamilyName.get(i));
				set = true;
			}

			if (MD_contributorAddress != null && MD_contributorAddress.containsKey(i)) {
				contributor.setAddress(MD_contributorAddress.get(i));
				set = true;
			}

			// The contributors affiliation
			if (MD_contributorAffiliationName != null && MD_contributorAffiliationName.containsKey(i)) {
				contributorAffiliation.setName(MD_contributorAffiliationName.get(i));
				set = true;
			}

			if (MD_contributorAffiliationGivenName != null && MD_contributorAffiliationGivenName.containsKey(i)) {
				contributorAffiliation.setGivenName(MD_contributorAffiliationGivenName.get(i));
				set = true;
			}

			if (MD_contributorAffiliationFamilyName != null && MD_contributorAffiliationFamilyName.containsKey(i)) {
				contributorAffiliation.setFamilyName(MD_contributorAffiliationFamilyName.get(i));
				set = true;
			}

			if (MD_contributorAffiliationAddress != null && MD_contributorAffiliationAddress.containsKey(i)) {
				contributorAffiliation.setAddress(MD_contributorAffiliationAddress.get(i));
				set = true;
			}

			if (MD_contributorAffiliationEmail != null && MD_contributorAffiliationEmail.containsKey(i)) {
				contributorAffiliation.setEmail(MD_contributorAffiliationEmail.get(i));
				set = true;
			}

			if (MD_contributorAffiliationRole != null && MD_contributorAffiliationRole.containsKey(i)) {

				try { // TODO: find better solution than try/catch here
						// System.out.println(MD_contributorRole.get(i) + "Role will now be set.");
					contributorAffiliation
							.setRole(dtc.dateType.ContributorType.fromValue(MD_contributorAffiliationRole.get(i)));
					set = true;
				} catch (IllegalArgumentException ex) {

				}

			}
			// contributors Affiliation done, now set it:
			contributor.setAffiliation(contributorAffiliation);

			if (MD_contributorRole != null && MD_contributorRole.containsKey(i)) {
				// System.out.println("Role is existent. It is: " + MD_contributorRole.get(i));

				try { // TODO: find better solution here
						// System.out.println(MD_contributorRole.get(i) + "Role will now be set.");
					contributor.setRole(dtc.dateType.ContributorType.fromValue(MD_contributorRole.get(i)));
					set = true;
				} catch (IllegalArgumentException ex) {

				}

			}

			// The contributors ID
			if (MD_contributorId != null && MD_contributorId.containsKey(i)) {
				contributorId.setValue(MD_contributorId.get(i));
				set = true;
			}

			// The contributors ID
			if (MD_contributorId != null && MD_contributorId.containsKey(i)) {
				contributorId.setValue(MD_contributorId.get(i));
				set = true;
			}

			if (MD_contributorIdScheme != null && MD_contributorIdScheme.containsKey(i)) {
				contributorId.setScheme(MD_contributorIdScheme.get(i));
				set = true;
			}

			if (MD_contributorIdType != null && MD_contributorIdType.containsKey(i)) {
				contributorId.setType(MD_contributorIdType.get(i));
				set = true;
			}
			// Set the contributors ID
			contributor.getId().add(contributorId);

			if (MD_contributorEmail != null && MD_contributorEmail.containsKey(i)) {

				contributor.setEmail(MD_contributorEmail.get(i));
				set = true;
			}

			// Only set the object if there was at least one entry, so no empty tags will
			// occur
			if (set)
				md.getContributor().add(contributor);

		}

		/*
		 * Project
		 * 
		 * Name of the (sub)-project as context of the data project.value project.level
		 */

		HashMap<Integer, String> MD_projectValue = parsedMD.get("project.value");
		HashMap<Integer, String> MD_projectLevel = parsedMD.get("project.level");

		// EngMeta.Dataset.Project project = new EngMeta.Dataset.Project();

		for (int i = 0; i < ExtractIng.NUMBER_OF_MD; i++) {

			Boolean set = false;

			EngMeta.Dataset.Project project = new EngMeta.Dataset.Project();

			if (MD_projectValue != null && MD_projectValue.containsKey(i)) {
				project.setValue(MD_projectValue.get(i));
				set = true;
			}

			if (MD_projectLevel != null && MD_projectLevel.containsKey(i)) {

				try {

					BigInteger bigIntProjectLevel = new BigInteger(MD_projectLevel.get(i).trim());
					project.setLevel(bigIntProjectLevel);
				} catch (NumberFormatException e) {
					// System.out.println("Exception caught!");
					// e.printStackTrace();
					BigInteger bigIntProjectLevel = new BigInteger("0");
					project.setLevel(bigIntProjectLevel);
				}

				set = true;

			}

			if (set)
				md.getProject().add(project);

		}

		/*
		 * Funding Information
		 * 
		 * Uniquely identifies a funding entity, according to various types.
		 * funderIdentifier can be one of: ISNI, GRID, Crossref Funder ID, Other
		 * fundingReference.funderName fundingReference.funderIdentifier
		 * fundingReference.awardNumber fundingReference.awardNumber.URI
		 * fundingReference.awardTitle
		 */

		HashMap<Integer, String> MD_funderName = parsedMD.get("fundingReference.funderName");
		HashMap<Integer, String> MD_funderIdentifier = parsedMD.get("fundingReference.funderIdentifier");
		HashMap<Integer, String> MD_awardNumber = parsedMD.get("fundingReference.awardNumber");
		HashMap<Integer, String> MD_awardNumberURI = parsedMD.get("fundingReference.awardNumber.URI");
		HashMap<Integer, String> MD_awardTitle = parsedMD.get("fundingReference.awardTitle");

		for (int i = 0; i < ExtractIng.NUMBER_OF_MD; i++) {

			Boolean set = false;

			EngMeta.Dataset.FundingReference fundingReference = new EngMeta.Dataset.FundingReference();
			EngMeta.Dataset.FundingReference.AwardNumber awardNumber = new EngMeta.Dataset.FundingReference.AwardNumber();
			EngMeta.Dataset.FundingReference.FunderIdentifier funderIdentifier = new EngMeta.Dataset.FundingReference.FunderIdentifier();

			if (MD_funderName != null && MD_funderName.containsKey(i)) {
				fundingReference.setFunderName(MD_funderName.get(i));
				set = true;
			}

			if (MD_funderIdentifier != null && MD_funderIdentifier.containsKey(i)) {

				funderIdentifier.setValue(MD_funderIdentifier.get(i));
				fundingReference.setFunderIdentifier(funderIdentifier);

				set = true;

			}

			if (MD_awardNumber != null && MD_awardNumber.containsKey(i)) {
				awardNumber.setValue(MD_awardNumber.get(i));
				fundingReference.setAwardNumber(awardNumber);
				set = true;

			}

			if (MD_awardNumberURI != null && MD_awardNumberURI.containsKey(i)) {
				awardNumber.setAwardURI(MD_awardNumberURI.get(i));

				set = true;

			}

			if (MD_awardTitle != null && MD_awardTitle.containsKey(i)) {
				fundingReference.setAwardTitle(MD_awardTitle.get(i));
				set = true;
			}

			if (set)
				md.getFundingReference().add(fundingReference);

		}

		/*
		 * Worked
		 * 
		 * Flag, if the data belongs to a successful or unsuccessful. Can have the
		 * values: true, false research worked
		 */

		HashMap<Integer, String> MD_worked = parsedMD.get("worked");
		HashMap<Integer, String> MD_workedNote = parsedMD.get("workedNote");

		if (MD_worked != null && MD_worked.containsKey(0)) {
			md.setWorked(Boolean.parseBoolean(MD_worked.get(0)));
		}

		/*
		 * Worked Note
		 * 
		 * Description, why the research was (un-)successful workedNote
		 */

		if (MD_workedNote != null && MD_workedNote.containsKey(0)) {
			md.setWorkedNote(MD_workedNote.get(0));
		}

		/*
		 * # Title # # A name or title by which a resource is known.
		 * 
		 * title title.titleType AlternativeTitle, Subtitle, TranslatedTitle, Other
		 * title.lang
		 */

		HashMap<Integer, String> MD_title = parsedMD.get("title");
		HashMap<Integer, String> MD_titleType = parsedMD.get("title.titleType");
		HashMap<Integer, String> MD_titleLang = parsedMD.get("title.lang");

		for (int i = 0; i < ExtractIng.NUMBER_OF_MD; i++) {

			Boolean set = false;

			EngMeta.Dataset.Title title = new EngMeta.Dataset.Title();

			if (MD_title != null && MD_title.containsKey(i)) {
				title.setValue(MD_title.get(i));
				set = true;

			}

			if (MD_titleType != null && MD_titleType.containsKey(i)) {

				// Since TitleType is an enumeration class, we have to use it this way
				if (isInEnum(MD_titleType.get(i), dtc.dateType.TitleType.class)) {
					dtc.dateType.TitleType titleType = dtc.dateType.TitleType.fromValue(MD_titleType.get(i));
					title.setTitleType(titleType);
				}

				set = true;

			}

			if (MD_titleLang != null && MD_titleLang.containsKey(i)) {

				title.setLang(MD_titleLang.get(i));
				set = true;
			}

			if (set)
				md.getTitle().add(title);

		}

		/*
		 * Description All additional information that does not fit in any of the other
		 * categories. # May be used for technical information. It is a best practice to
		 * supply a description.
		 * 
		 * description description.descriptionType description.lang
		 */

		HashMap<Integer, String> MD_description = parsedMD.get("description");
		HashMap<Integer, String> MD_descriptionType = parsedMD.get("description.descriptionType");
		HashMap<Integer, String> MD_descriptionLang = parsedMD.get("description.lang");

		for (int i = 0; i < ExtractIng.NUMBER_OF_MD; i++) {

			Boolean set = false;

			EngMeta.Dataset.Description description = new EngMeta.Dataset.Description();

			if (MD_description != null && MD_description.containsKey(i)) {
				description.getContent().add(MD_description.get(i));
				set = true;

			}

			if (MD_descriptionType != null && MD_descriptionType.containsKey(i)) {
				// This is how we work with enum types
				if (isInEnum(MD_descriptionType.get(i), dtc.dateType.DescriptionType.class)) {
					// TODO: does not work correctly, dont know why yet
					dtc.dateType.DescriptionType descriptionType = dtc.dateType.DescriptionType
							.fromValue(MD_descriptionType.get(i));
					description.setDescriptionType(descriptionType);

					set = true;
				}

			}

			if (MD_descriptionLang != null && MD_descriptionLang.containsKey(i)) {
				description.setLang(MD_descriptionLang.get(i));
				set = true;
			}
			if (set)
				md.getDescription().add(description);
		}

		/*
		 * Resource Type
		 *
		 * The type of a resource. You may enter an additional free text description.
		 * The format is open, but the preferred format is a single term of some detail
		 * so that a pair can be formed with the sub-property. ResourceType can be one
		 * of: Audiovisual, Collection, Dataset, Event, Image, InteractiveResource,
		 * Model, PhysicalObject, Service, Software, Sound, Text, Workflow, Other
		 * 
		 * resourceType resourceType.resourceTypeGeneral
		 */

		HashMap<Integer, String> MD_resourceType = parsedMD.get("resourceType");
		HashMap<Integer, String> MD_resourceTypeGeneral = parsedMD.get("resourceType.resourceTypeGeneral");

		for (int i = 0; i < ExtractIng.NUMBER_OF_MD; i++) {

			Boolean set = false;

			EngMeta.Dataset.ResourceType resourceType = new EngMeta.Dataset.ResourceType();

			if (MD_resourceType != null && MD_resourceType.containsKey(i)) {
				resourceType.setValue(MD_resourceType.get(i));
				set = true;
			}

			if (MD_resourceTypeGeneral != null && MD_resourceTypeGeneral.containsKey(i)) {

				if (isInEnum(MD_resourceTypeGeneral.get(i), dtc.dateType.ResourceType.class)) {
					dtc.dateType.ResourceType resourceTypeGeneral = dtc.dateType.ResourceType
							.fromValue(MD_resourceTypeGeneral.get(i));
					resourceType.setResourceTypeGeneral(resourceTypeGeneral);
					set = true;

				}

			}

			if (set)
				md.setResourceType(resourceType);

		}

		/*
		 * Keywords
		 *
		 * List of describing keywords. keywords.keyword keywords.keyword.vocabulary
		 * keywords.keyword.vocabularyURL
		 */

		EngMeta.Dataset.Keywords keywords = new EngMeta.Dataset.Keywords();
		Boolean setKeywords = false;

		HashMap<Integer, String> MD_keywords = parsedMD.get("keywords.keyword");

		for (int i = 0; i < ExtractIng.NUMBER_OF_MD; i++) {

			if (MD_keywords != null && MD_keywords.containsKey(i)) {
				EngMeta.Dataset.Keywords.Keyword keyword = new EngMeta.Dataset.Keywords.Keyword();

				// System.out.println("Schleife kommt rein... Keyword ist: " +
				// MD_keywords.get(i) );
				keyword.setValue(MD_keywords.get(i));

				// now add the new keyword to list of keywords
				keywords.getKeyword().add(keyword);

				setKeywords = true;

			}

		}

		if (setKeywords)
			md.setKeywords(keywords);

		/*
		 * Subject
		 *
		 * Title of the subject. Can be free text or can belong to a controlled
		 * vocabulary. In this case, the vocabulary is specified by the attributes
		 * subjectScheme and/or schemeURI. The term itself can be identified through the
		 * attribute valueURI. Language can be specified through the xml:lang-attribute
		 * according to BCP47 (http://www.rfc-editor.org/rfc/bcp/bcp47.txt)
		 * subjects.subject subjects.subject.subjectScheme subjects.subject.schemeURI
		 * subjects.subject.valueURI subjects.subject.lang
		 * 
		 */

		EngMeta.Dataset.Subjects subjects = new EngMeta.Dataset.Subjects();

		Boolean setSubjects = false;

		HashMap<Integer, String> MD_subjects = parsedMD.get("subjects.subject");
		HashMap<Integer, String> MD_subjectSubjectScheme = parsedMD.get("subjects.subject.subjectScheme");
		HashMap<Integer, String> MD_subjectSchemeURI = parsedMD.get("subjects.subject.schemeURI");
		HashMap<Integer, String> MD_subjectValueURI = parsedMD.get("subjects.subject.valueURI");
		HashMap<Integer, String> MD_subjectLang = parsedMD.get("subjects.subject.lang");

		for (int i = 0; i < ExtractIng.NUMBER_OF_MD; i++) {

			setSubjects = false;

			EngMeta.Dataset.Subjects.Subject subject = new EngMeta.Dataset.Subjects.Subject();

			if (MD_subjects != null && MD_subjects.containsKey(i)) {
				subject.setValue(MD_subjects.get(i));
				setSubjects = true;
			}

			if (MD_subjectSubjectScheme != null && MD_subjectSubjectScheme.containsKey(i)) {
				subject.setSubjectScheme(MD_subjectSubjectScheme.get(i));
				setSubjects = true;
			}
			if (MD_subjectSchemeURI != null && MD_subjectSchemeURI.containsKey(i)) {
				subject.setSchemeURI(MD_subjectSchemeURI.get(i));
				setSubjects = true;
			}

			if (MD_subjectValueURI != null && MD_subjectValueURI.containsKey(i)) {
				subject.setValueURI(MD_subjectValueURI.get(i));
				setSubjects = true;
			}
			if (MD_subjectLang != null && MD_subjectLang.containsKey(i)) {
				subject.setLang(MD_subjectLang.get(i));
				setSubjects = true;
			}

			if (setSubjects)
				subjects.getSubject().add(subject);

		}

		md.setSubjects(subjects);

		/*
		 * Date
		 * 
		 * Different dates relevant to the work. YYYY,YYYY-MM-DD, YYYY-MM-DDThh:mm:ssTZD
		 * or any other format or level of granularity described in W3CDTF. Use
		 * RKMS-ISO8601 standard for depicting date ranges. Values for dateType:
		 * Accepted, Available, Collected, Copyrighted, Created, Issued, Submitted,
		 * Updated, Valid dates.date dates.date.dateType
		 */

		HashMap<Integer, String> MD_dates = parsedMD.get("dates.date");
		HashMap<Integer, String> MD_datesDateDateType = parsedMD.get("dates.date.dateType");

		EngMeta.Dataset.Dates dates = new EngMeta.Dataset.Dates();

		for (int i = 0; i < ExtractIng.NUMBER_OF_MD; i++) {

			Boolean set = false;

			EngMeta.Dataset.Dates.Date date = new EngMeta.Dataset.Dates.Date();

			if (MD_dates != null && MD_dates.containsKey(i)) {
				date.setValue(MD_dates.get(i));
				set = true;
			}

			if (MD_datesDateDateType != null && MD_datesDateDateType.containsKey(i)) {
				if (isInEnum(MD_datesDateDateType.get(i), dtc.dateType.DateType.class)) {
					dtc.dateType.DateType dateType = dtc.dateType.DateType.fromValue(MD_datesDateDateType.get(i));
					date.setDateType(dateType);
					set = true;
				}
			}

			if (set)
				dates.getDate().add(date);
		}

		md.setDates(dates);

		/*
		 * Version
		 *
		 * Version of the data. Should be specified in the format major.minor, e.g. 1.51
		 *
		 * version
		 */

		HashMap<Integer, String> MD_version = parsedMD.get("version");

		if (MD_version != null && MD_version.containsKey(0)) {
			md.setVersion(MD_version.get(0));
		}

		/*
		 * Creation Mode
		 * 
		 * Creation mode of the data. Specific for engineering. Values can be:
		 * Simulation, Experiment, Analysis mode
		 */
		HashMap<Integer, String> MD_mode = parsedMD.get("mode");

		for (int i = 0; i < ExtractIng.NUMBER_OF_MD; i++) {

			if (MD_mode != null && MD_mode.containsKey(i)) {
				md.getMode().add(MD_mode.get(i));
			}

		}

		/*
		 * # Measured Variables # # Measured or simulated variables.
		 * measuredVariable.name measuredVariable.symbol measuredVariable.value
		 * measuredVariable.encoding measuredVariable.error
		 */
		// Add all the measured variables: this goes in a loop

		HashMap<Integer, String> MD_measuredVariableName = parsedMD.get("measuredVariable.name");
		HashMap<Integer, String> MD_measuredVariableSymbol = parsedMD.get("measuredVariable." + "" + "" + "");
		HashMap<Integer, String> MD_measuredVariableValue = parsedMD.get("measuredVariable.value");
		HashMap<Integer, String> MD_measuredVariableEncoding = parsedMD.get("measuredVariable.encoding");
		HashMap<Integer, String> MD_measuredVariableError = parsedMD.get("measuredVariable.error");

		for (int i = 0; i < ExtractIng.NUMBER_OF_MD; i++) {

			Boolean set = false;

			EngMeta.Variable var = new EngMeta.Variable();

			if (MD_measuredVariableName != null && MD_measuredVariableName.containsKey(i)) {
				var.setName(MD_measuredVariableName.get(i));
				set = true;
			}

			if (MD_measuredVariableSymbol != null && MD_measuredVariableSymbol.containsKey(i)) {
				var.setSymbol(MD_measuredVariableSymbol.get(i));
				set = true;
			}

			if (MD_measuredVariableValue != null && MD_measuredVariableValue.containsKey(i)) {
				var.setValue(MD_measuredVariableValue.get(i));
				set = true;
			}

			if (MD_measuredVariableEncoding != null && MD_measuredVariableEncoding.containsKey(i)) {
				var.setEncoding(MD_measuredVariableEncoding.get(i));
				set = true;
			}

			if (MD_measuredVariableError != null && MD_measuredVariableError.containsKey(i)) {

				try {

					BigDecimal bigDecVarError = new BigDecimal(MD_measuredVariableError.get(i).trim());
					var.setError(bigDecVarError);
				} catch (NumberFormatException e) {
					// System.out.println("Exception caught!");
					// e.printStackTrace();
					BigDecimal bigDecVarError = new BigDecimal("0");
					var.setError(bigDecVarError);
				}

				set = true;
			}

			if (set)
				md.getMeasuredVariable().add(var);

		}

		/*
		 * Controlled Variables
		 * 
		 * Controlled or observed variables
		 * 
		 * controlledVariable.name controlledVariable.symbol controlledVariable.value
		 * controlledVariable.encoding controlledVariable.error
		 */

		HashMap<Integer, String> MD_controlledVariableName = parsedMD.get("controlledVariable.name");
		HashMap<Integer, String> MD_controlledVariableSymbol = parsedMD.get("controlledVariable.symbol");
		HashMap<Integer, String> MD_controlledVariableValue = parsedMD.get("controlledVariable.value");
		HashMap<Integer, String> MD_controlledVariableEncoding = parsedMD.get("controlledVariable.encoding");
		HashMap<Integer, String> MD_controlledVariableError = parsedMD.get("controlledVariable.error");

		for (int i = 0; i < ExtractIng.NUMBER_OF_MD; i++) {

			Boolean set = false;

			EngMeta.Variable var = new EngMeta.Variable();

			if (MD_controlledVariableName != null && MD_controlledVariableName.containsKey(i)) {
				var.setName(MD_controlledVariableName.get(i));
				set = true;
			}

			if (MD_controlledVariableSymbol != null && MD_controlledVariableSymbol.containsKey(i)) {
				var.setSymbol(MD_controlledVariableSymbol.get(i));
				set = true;
			}

			if (MD_controlledVariableValue != null && MD_controlledVariableValue.containsKey(i)) {
				var.setValue(MD_controlledVariableValue.get(i));
				set = true;
			}

			if (MD_controlledVariableEncoding != null && MD_controlledVariableEncoding.containsKey(i)) {
				var.setEncoding(MD_controlledVariableEncoding.get(i));
				set = true;
			}

			if (MD_controlledVariableError != null && MD_controlledVariableError.containsKey(i)) {

				try {

					BigDecimal bigDecVarError = new BigDecimal(MD_controlledVariableError.get(i).trim());
					var.setError(bigDecVarError);
				} catch (NumberFormatException e) {
					// System.out.println("Exception caught!");
					// e.printStackTrace();
					BigDecimal bigDecVarError = new BigDecimal("0");
					var.setError(bigDecVarError);
				}

				set = true;
			}

			if (set)
				md.getControlledVariable().add(var);

		}

		/*
		 * # Provenance # # Information about the data provenance for replication: Who
		 * did what with which method with the data # # ProcessingStep # Provenance
		 * Information can consist of one or multiple processing steps. # Specification
		 * of one processingStep in the data life cycle of the data with # actor (best
		 * way pseudonymized), date, used, method, software and hardware, input and
		 * output (files).
		 * 
		 * provenance.processingStep.type
		 */

		// Create a processingStep first
		EngMeta.ProcessingStep proc = objFacEngMeta.createProcessingStep();

		HashMap<Integer, String> MD_processingStepType = parsedMD.get("provenance.processingStep.type");

		for (int i = 0; i < ExtractIng.NUMBER_OF_MD; i++) {

			Boolean set = false;

			if (MD_processingStepType != null && MD_processingStepType.containsKey(i))
				proc.setType(MD_processingStepType.get(i));

		}

		/*
		 *
		 * The actor that is responsible for the processing step
		 * provenance.processingStep.actor.name
		 * provenance.processingStep.actor.givenName
		 * provenance.processingStep.actor.familyName
		 * provenance.processingStep.actor.address
		 * 
		 * provenance.processingStep.actor.affiliation.name
		 * provenance.processingStep.actor.affiliation.givenName
		 * provenance.processingStep.actor.affiliation.familyName
		 * provenance.processingStep.actor.affiliation.address
		 * provenance.processingStep.actor.affiliation.email
		 * provenance.processingStep.actor.affiliation.id
		 * provenance.processingStep.actor.affiliation.role
		 * 
		 * provenance.processingStep.actor.email provenance.processingStep.actor.id
		 * provenance.processingStep.actor.role
		 * 
		 */

		HashMap<Integer, String> MD_procActorName = parsedMD.get("provenance.processingStep.actor.name");
		HashMap<Integer, String> MD_procActorGivenName = parsedMD.get("provenance.processingStep.actor.givenName");
		HashMap<Integer, String> MD_procActorFamilyName = parsedMD.get("provenance.processingStep.actor.familyName");
		HashMap<Integer, String> MD_procActorAddress = parsedMD.get("provenance.processingStep.actor.address");
		HashMap<Integer, String> MD_procActorAffiliationName = parsedMD
				.get("provenance.processingStep.actor.affiliation.name");
		HashMap<Integer, String> MD_procActorAffiliationGivenName = parsedMD
				.get("provenance.processingStep.actor.affiliation.givenName");
		HashMap<Integer, String> MD_procActorAffiliationFamilyName = parsedMD
				.get("provenance.processingStep.actor.affiliation.familyName");
		HashMap<Integer, String> MD_procActorAffiliationAddress = parsedMD
				.get("provenance.processingStep.actor.affiliation.address");
		HashMap<Integer, String> MD_procActorAffiliationEmail = parsedMD
				.get("provenance.processingStep.actor.affiliation.email");
		HashMap<Integer, String> MD_procActorAffiliationId = parsedMD
				.get("provenance.processingStep.actor.affiliation.id");
		HashMap<Integer, String> MD_procActorAffiliationRole = parsedMD
				.get("provenance.processingStep.actor.affiliation.role");
		HashMap<Integer, String> MD_procActorEmail = parsedMD.get("provenance.processingStep.actor.email");
		HashMap<Integer, String> MD_procActorId = parsedMD.get("provenance.processingStep.actor.id");
		HashMap<Integer, String> MD_procActorRole = parsedMD.get("provenance.processingStep.actor.role");

		for (int i = 0; i < ExtractIng.NUMBER_OF_MD; i++) {

			Boolean set = false;

			EngMeta.PersonOrOrganization procActor = objFacEngMeta.createPersonOrOrganization();

			EngMeta.PersonOrOrganization procActorAffiliation = objFacEngMeta.createPersonOrOrganization();
			EngMeta.Pid procActorId = objFacEngMeta.createPid();

			if (MD_procActorName != null && MD_procActorName.containsKey(i)) {
				procActor.setName(MD_procActorName.get(i));
				set = true;
			}

			if (MD_procActorGivenName != null && MD_procActorGivenName.containsKey(i)) {
				procActor.setGivenName(MD_procActorGivenName.get(i));
				set = true;
			}

			if (MD_procActorFamilyName != null && MD_procActorFamilyName.containsKey(i)) {
				procActor.setFamilyName(MD_procActorFamilyName.get(i));
				set = true;
			}

			if (MD_procActorAddress != null && MD_procActorAddress.containsKey(i)) {
				procActor.setAddress(MD_procActorAddress.get(i));
				set = true;
			}

			// The procActors affiliation
			if (MD_procActorAffiliationName != null && MD_procActorAffiliationName.containsKey(i)) {
				procActorAffiliation.setName(MD_procActorAffiliationName.get(i));
				set = true;
			}

			if (MD_procActorAffiliationGivenName != null && MD_procActorAffiliationGivenName.containsKey(i)) {
				procActorAffiliation.setGivenName(MD_procActorAffiliationGivenName.get(i));
				set = true;
			}

			if (MD_procActorAffiliationFamilyName != null && MD_procActorAffiliationFamilyName.containsKey(i)) {
				procActorAffiliation.setFamilyName(MD_procActorAffiliationFamilyName.get(i));
				set = true;
			}

			if (MD_procActorAffiliationAddress != null && MD_procActorAffiliationAddress.containsKey(i)) {
				procActorAffiliation.setAddress(MD_procActorAffiliationAddress.get(i));
				set = true;
			}

			if (MD_procActorAffiliationEmail != null && MD_procActorAffiliationEmail.containsKey(i)) {
				procActorAffiliation.setEmail(MD_procActorAffiliationEmail.get(i));
				set = true;
			}

			if (MD_procActorAffiliationRole != null && MD_procActorAffiliationRole.containsKey(i)) {

				try { // TODO: find better solution than try/catch here
						// System.out.println(MD_procActorRole.get(i) + "Role will now be set.");
					procActorAffiliation
							.setRole(dtc.dateType.ContributorType.fromValue(MD_procActorAffiliationRole.get(i)));
					set = true;
				} catch (IllegalArgumentException ex) {

				}

			}
			// procActors Affiliation done, now set it:
			procActor.setAffiliation(procActorAffiliation);

			if (MD_procActorRole != null && MD_procActorRole.containsKey(i)) {
				// System.out.println("Role is existent. It is: " + MD_procActorRole.get(i));

				try { // TODO: find better solution here
						// System.out.println(MD_procActorRole.get(i) + "Role will now be set.");
					procActor.setRole(dtc.dateType.ContributorType.fromValue(MD_procActorRole.get(i)));
					set = true;
				} catch (IllegalArgumentException ex) {

				}

			}

			// The procActors ID
			if (MD_procActorId != null && MD_procActorId.containsKey(i)) {
				procActorId.setValue(MD_procActorId.get(i));
				set = true;
			}

			// The procActors ID
			if (MD_procActorId != null && MD_procActorId.containsKey(i)) {
				procActorId.setValue(MD_procActorId.get(i));
				set = true;
			}

			// if (MD_procActorIdScheme != null && MD_procActorIdScheme.containsKey(i)) {
			// procActorId.setScheme(MD_procActorIdScheme.get(i));
			// set = true;
			// }
			//
			// if (MD_procActorIdType != null && MD_procActorIdType.containsKey(i)) {
			// procActorId.setType(MD_procActorIdType.get(i));
			// set = true;
			// }
			// // Set the procActors ID
			procActor.getId().add(procActorId);

			if (MD_procActorEmail != null && MD_procActorEmail.containsKey(i)) {

				procActor.setEmail(MD_procActorEmail.get(i));
				set = true;
			}
			procActor.setAffiliation(procActorAffiliation);

			// Only set the object if there was at least one entry, so no empty tags will
			// occur
			if (set)
				proc.getActor().add(procActor);

		}

		/*
		 * A date associated with the processingStep
		 * 
		 * provenance.processingStep.date
		 */

		HashMap<Integer, String> MD_processingStepDate = parsedMD.get("provenance.processingStep.date");

		if (MD_processingStepDate != null && MD_processingStepDate.containsKey(0)) {

			try {
				String sDate1 = MD_processingStepDate.get(0);

				Date date1 = new SimpleDateFormat("YYYY-MM-DD").parse(sDate1);

				GregorianCalendar c = new GregorianCalendar();
				c.setTime(date1);

				XMLGregorianCalendar procDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
				proc.setDate(procDate);
			} catch (java.text.ParseException e) {
				String sDate1 = "0000-00-00";

				Date date1 = new SimpleDateFormat("YYYY-MM-DD").parse(sDate1);

				GregorianCalendar c = new GregorianCalendar();
				c.setTime(date1);

				XMLGregorianCalendar procDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
				proc.setDate(procDate);
			}

		}

		/*
		 * Definition of used method with name and parameters.Name of the method can be
		 * free text or can belong to a controlled vocabulary. In this case, the
		 * vocabulary is defined by methodScheme and methodURI, the term by the termURI.
		 * In both cases language can be specified through the xml:lang-attribute
		 * according to BCP47 (http://www.rfc-editor.org/rfc/bcp/bcp47.txt)
		 * provenance.processingStep.method.name.value
		 * provenance.processingStep.method.name.methodScheme
		 * provenance.processingStep.method.name.schemeURI
		 * provenance.processingStep.method.name.valueURI
		 * provenance.processingStep.method.description
		 * provenance.processingStep.method.parameter.name
		 * provenance.processingStep.method.parameter.symbol
		 * provenance.processingStep.method.parameter.value
		 * provenance.processingStep.method.parameter.encoding
		 * provenance.processingStep.method.parameter.error
		 */

		HashMap<Integer, String> MD_procMethodNameValue = parsedMD.get("provenance.processingStep.method.name.value");
		HashMap<Integer, String> MD_procMethodNameMethodScheme = parsedMD
				.get("provenance.processingStep.method.name.methodScheme");
		HashMap<Integer, String> MD_procMethodNameSchemeURI = parsedMD
				.get("provenance.processingStep.method.name.schemeURI");
		HashMap<Integer, String> MD_procMethodNameValueURI = parsedMD
				.get("provenance.processingStep.method.name.valueURI");
		HashMap<Integer, String> MD_procMethodDescription = parsedMD
				.get("provenance.processingStep.method.description");

		HashMap<Integer, String> MD_procMethodParameterName = parsedMD
				.get("provenance.processingStep.method.parameter.name");
		HashMap<Integer, String> MD_procMethodParameterSymbol = parsedMD
				.get("provenance.processingStep.method.parameter.symbol");
		HashMap<Integer, String> MD_procMethodParameterValue = parsedMD
				.get("provenance.processingStep.method.parameter.value");
		HashMap<Integer, String> MD_procMethodParameterEncoding = parsedMD
				.get("provenance.processingStep.method.parameter.encoding");
		HashMap<Integer, String> MD_procMethodParameterError = parsedMD
				.get("provenance.processingStep.method.parameter.error");

		for (int i = 0; i < ExtractIng.NUMBER_OF_MD; i++) {

			Boolean set = false;

			EngMeta.Method method = objFacEngMeta.createMethod();

			EngMeta.Method.Name methodName = objFacEngMeta.createMethodName();

			if (MD_procMethodNameValue != null && MD_procMethodNameValue.containsKey(i)) {
				methodName.setValue(MD_procMethodNameValue.get(i));
				set = true;
			}

			if (MD_procMethodNameMethodScheme != null && MD_procMethodNameMethodScheme.containsKey(i)) {
				methodName.setMethodScheme(MD_procMethodNameMethodScheme.get(i));
				set = true;
			}

			if (MD_procMethodNameSchemeURI != null && MD_procMethodNameSchemeURI.containsKey(i)) {
				methodName.setSchemeURI(MD_procMethodNameSchemeURI.get(i));
				set = true;
			}

			if (MD_procMethodNameValueURI != null && MD_procMethodNameValueURI.containsKey(i)) {
				methodName.setValueURI(MD_procMethodNameValueURI.get(i));
				set = true;
			}

			if (set)
				method.setName(methodName);

			if (MD_procMethodDescription != null && MD_procMethodDescription.containsKey(i)) {
				method.setDescription(MD_procMethodDescription.get(i));
				set = true;
			}

			EngMeta.Variable parameter = objFacEngMeta.createVariable();

			if (MD_procMethodParameterName != null && MD_procMethodParameterName.containsKey(i)) {
				parameter.setName(MD_procMethodParameterName.get(i));
				set = true;
			}

			if (MD_procMethodParameterSymbol != null && MD_procMethodParameterSymbol.containsKey(i)) {
				parameter.setSymbol(MD_procMethodParameterSymbol.get(i));
				set = true;
			}

			if (MD_procMethodParameterValue != null && MD_procMethodParameterValue.containsKey(i)) {
				parameter.setValue(MD_procMethodParameterValue.get(i));
				set = true;
			}

			if (MD_procMethodParameterEncoding != null && MD_procMethodParameterEncoding.containsKey(i)) {
				parameter.setEncoding(MD_procMethodParameterEncoding.get(i));
				set = true;
			}

			if (MD_procMethodParameterError != null && MD_procMethodParameterError.containsKey(i)) {

				try {

					BigDecimal bigDecVarError = new BigDecimal(MD_procMethodParameterError.get(i).trim());
					parameter.setError(bigDecVarError);
				} catch (NumberFormatException e) {
					// System.out.println("Exception caught!");
					// e.printStackTrace();
					BigDecimal bigDecVarError = new BigDecimal("0");
					parameter.setError(bigDecVarError);
				}

				set = true;
			}

			method.getParameter().add(parameter);

			if (set)
				proc.getMethod().add(method);

		}

		/*
		 * # Error method. Same definition as for the general methods
		 * provenance.processingStep.errormethod.name.value
		 * provenance.processingStep.errormethod.name.methodScheme
		 * provenance.processingStep.errormethod.name.schemeURI
		 * provenance.processingStep.errormethod.name.valueURI
		 * provenance.processingStep.errormethod.description
		 * provenance.processingStep.errormethod.parameter.name
		 * provenance.processingStep.errormethod.parameter.symbol
		 * provenance.processingStep.errormethod.parameter.value
		 * provenance.processingStep.errormethod.parameter.encoding
		 * provenance.processingStep.errormethod.parameter.error
		 */

		HashMap<Integer, String> MD_procErrorMethodNameValue = parsedMD
				.get("provenance.processingStep.errormethod.name.value");
		HashMap<Integer, String> MD_procErrorMethodNameMethodScheme = parsedMD
				.get("provenance.processingStep.errormethod.name.methodScheme");
		HashMap<Integer, String> MD_procErrorMethodNameSchemeURI = parsedMD
				.get("provenance.processingStep.errormethod.name.schemeURI");
		HashMap<Integer, String> MD_procErrorMethodNameValueURI = parsedMD
				.get("provenance.processingStep.errormethod.name.valueURI");
		HashMap<Integer, String> MD_procErrorMethodDescription = parsedMD
				.get("provenance.processingStep.errormethod.description");

		HashMap<Integer, String> MD_procErrorMethodParameterName = parsedMD
				.get("provenance.processingStep.errormethod.parameter.name");
		HashMap<Integer, String> MD_procErrorMethodParameterSymbol = parsedMD
				.get("provenance.processingStep.errormethod.parameter.symbol");
		HashMap<Integer, String> MD_procErrorMethodParameterValue = parsedMD
				.get("provenance.processingStep.errormethod.parameter.value");
		HashMap<Integer, String> MD_procErrorMethodParameterEncoding = parsedMD
				.get("provenance.processingStep.errormethod.parameter.encoding");
		HashMap<Integer, String> MD_procErrorMethodParameterError = parsedMD
				.get("provenance.processingStep.errormethod.parameter.error");

		for (int i = 0; i < ExtractIng.NUMBER_OF_MD; i++) {

			Boolean set = false;

			EngMeta.Method errorMethod = objFacEngMeta.createMethod();

			EngMeta.Method.Name errorMethodName = objFacEngMeta.createMethodName();

			if (MD_procErrorMethodNameValue != null && MD_procErrorMethodNameValue.containsKey(i)) {
				errorMethodName.setValue(MD_procErrorMethodNameValue.get(i));
				set = true;
			}

			if (MD_procErrorMethodNameMethodScheme != null && MD_procErrorMethodNameMethodScheme.containsKey(i)) {
				errorMethodName.setMethodScheme(MD_procErrorMethodNameMethodScheme.get(i));
				set = true;
			}

			if (MD_procErrorMethodNameSchemeURI != null && MD_procErrorMethodNameSchemeURI.containsKey(i)) {
				errorMethodName.setSchemeURI(MD_procErrorMethodNameSchemeURI.get(i));
				set = true;
			}

			if (MD_procErrorMethodNameValueURI != null && MD_procErrorMethodNameValueURI.containsKey(i)) {
				errorMethodName.setValueURI(MD_procErrorMethodNameValueURI.get(i));
				set = true;
			}

			if (set)
				errorMethod.setName(errorMethodName);

			if (MD_procErrorMethodDescription != null && MD_procErrorMethodDescription.containsKey(i)) {
				errorMethod.setDescription(MD_procErrorMethodDescription.get(i));
				set = true;
			}

			EngMeta.Variable parameter = objFacEngMeta.createVariable();

			if (MD_procErrorMethodParameterName != null && MD_procErrorMethodParameterName.containsKey(i)) {
				parameter.setName(MD_procErrorMethodParameterName.get(i));
				set = true;
			}

			if (MD_procErrorMethodParameterSymbol != null && MD_procErrorMethodParameterSymbol.containsKey(i)) {
				parameter.setSymbol(MD_procErrorMethodParameterSymbol.get(i));
				set = true;
			}

			if (MD_procErrorMethodParameterValue != null && MD_procErrorMethodParameterValue.containsKey(i)) {
				parameter.setValue(MD_procErrorMethodParameterValue.get(i));
				set = true;
			}

			if (MD_procErrorMethodParameterEncoding != null && MD_procErrorMethodParameterEncoding.containsKey(i)) {
				parameter.setEncoding(MD_procErrorMethodParameterEncoding.get(i));
				set = true;
			}

			if (MD_procErrorMethodParameterError != null && MD_procErrorMethodParameterError.containsKey(i)) {

				try {

					BigDecimal bigDecVarError = new BigDecimal(MD_procErrorMethodParameterError.get(i).trim());
					parameter.setError(bigDecVarError);
				} catch (NumberFormatException e) {
					// System.out.println("Exception caught!");
					// e.printStackTrace();
					BigDecimal bigDecVarError = new BigDecimal("0");
					parameter.setError(bigDecVarError);
				}

				set = true;
			}

			errorMethod.getParameter().add(parameter);

			if (set)
				proc.getMethod().add(errorMethod);

		}

		/*
		 * provenance.processingStep.input.id provenance.processingStep.input.id.type
		 * provenance.processingStep.input.id.scheme
		 * provenance.processingStep.input.link provenance.processingStep.input.checksum
		 * provenance.processingStep.input.checksum.type
		 */

		HashMap<Integer, String> MD_procInputId = parsedMD.get("provenance.processingStep.input.id");
		HashMap<Integer, String> MD_procInputIdType = parsedMD.get("provenance.processingStep.input.id.type");
		HashMap<Integer, String> MD_procInputIdScheme = parsedMD.get("provenance.processingStep.input.id.scheme");
		HashMap<Integer, String> MD_procInputLink = parsedMD.get("provenance.processingStep.input.link");
		HashMap<Integer, String> MD_procInputChecksum = parsedMD.get("provenance.processingStep.input.checksum");
		HashMap<Integer, String> MD_procInputChecksumType = parsedMD
				.get("provenance.processingStep.input.checksum.type");

		for (int i = 0; i < ExtractIng.NUMBER_OF_MD; i++) {

			Boolean set = false;

			EngMeta.FileOrResource input = objFacEngMeta.createFileOrResource();

			EngMeta.Pid inputId = objFacEngMeta.createPid();

			Boolean setProcInputId = false;

			if (MD_procInputId != null && MD_procInputId.containsKey(i)) {
				inputId.setValue(MD_procInputId.get(i));
				setProcInputId = true;
			}

			if (MD_procInputIdType != null && MD_procInputIdType.containsKey(i)) {
				inputId.setType(MD_procInputIdType.get(i));
				setProcInputId = true;
			}

			if (MD_procInputIdScheme != null && MD_procInputIdScheme.containsKey(i)) {
				inputId.setScheme(MD_procInputIdScheme.get(i));
				setProcInputId = true;
			}
			if (setProcInputId) {
				set = true;
				input.setId(inputId);
			}

			if (MD_procInputLink != null && MD_procInputLink.containsKey(i)) {
				input.getLink().add(MD_procInputLink.get(i));
				setProcInputId = true;
			}

			if (MD_procInputChecksum != null && MD_procInputChecksum.containsKey(i)) {
				EngMeta.ChecksumType checksumInput = objFacEngMeta.createChecksumType();

				checksumInput.setValue(MD_procInputChecksum.get(i));
				if (MD_procInputChecksumType != null && MD_procInputChecksumType.containsKey(i)) {
					checksumInput.setAlgorithm(MD_procInputChecksumType.get(i));
				}
				setProcInputId = true;
			}

			if (set) {

				proc.getInput().add(input);
			}

		}

		/*
		 * # Software or code, that is used for the simulation. Described according to
		 * the # CodeMeta-Schema (https://codemeta.github.io/). The Software must # have
		 * a name and can be described further by version # (softwareVersion),
		 * programmingLanguage, operatingSystem. An # unbounded number of contributors
		 * can be specified. The location of # the software can be specified by an URL,
		 * (an URL to the) # SoftwareSourceCode, (an URL to the) SoftwareApplication
		 * and/or the # codeRepository. The attribution of the software can be given by
		 * # contributor, citation and referencePublication. License specifies # the
		 * license under which the software was used.
		 * provenance.processingStep.tool.name
		 * provenance.processingStep.tool.contributor.name
		 * provenance.processingStep.tool.contributor.givenName
		 * provenance.processingStep.tool.contributor.familyName
		 * provenance.processingStep.tool.contributor.address
		 * provenance.processingStep.tool.contributor.affiliation
		 * provenance.processingStep.tool.contributor.email
		 * provenance.processingStep.tool.contributor.id
		 * provenance.processingStep.tool.contributor.role
		 * provenance.processingStep.tool.softwareVersion
		 * provenance.processingStep.tool.operatingSystem
		 * provenance.processingStep.tool.programmingLanguage
		 * provenance.processingStep.tool.softwareSourceCode.id
		 * provenance.processingStep.tool.softwareSourceCode.id.type
		 * provenance.processingStep.tool.softwareSourceCode.id.scheme
		 * provenance.processingStep.tool.softwareSourceCode.link
		 * provenance.processingStep.tool.softwareSourceCode.checksum
		 * provenance.processingStep.tool.softwareSourceCode.checksum.type
		 * provenance.processingStep.tool.softwareApplication.id
		 * provenance.processingStep.tool.softwareApplication.id.type
		 * provenance.processingStep.tool.softwareApplication.id.scheme
		 * provenance.processingStep.tool.softwareApplication.link
		 * provenance.processingStep.tool.softwareApplication.checksum
		 * provenance.processingStep.tool.softwareApplication.checksum.type
		 * provenance.processingStep.tool.codeRepository
		 * provenance.processingStep.tool.license.note
		 * provenance.processingStep.tool.license.terms
		 * provenance.processingStep.tool.citation
		 * provenance.processingStep.tool.referencedPublication.id
		 * provenance.processingStep.tool.referencedPublication.id.scheme
		 * provenance.processingStep.tool.referencedPublication.id.type
		 * provenance.processingStep.tool.referencedPublication.citation
		 * provenance.processingStep.tool.referencedPublication.url
		 */

		HashMap<Integer, String> MD_procToolName = parsedMD.get("provenance.processingStep.tool.name");
		HashMap<Integer, String> MD_procToolContributorName = parsedMD
				.get("provenance.processingStep.tool.contributor.name");
		HashMap<Integer, String> MD_procToolContributorGivenName = parsedMD
				.get("provenance.processingStep.tool.contributor.givenName");
		HashMap<Integer, String> MD_procToolContributorFamilyName = parsedMD
				.get("provenance.processingStep.tool.contributor.familyName");
		HashMap<Integer, String> MD_procToolContributorAddress = parsedMD
				.get("provenance.processingStep.tool.contributor.address");
		HashMap<Integer, String> MD_procToolContributorAffiliation = parsedMD
				.get("provenance.processingStep.tool.contributor.affiliation");
		HashMap<Integer, String> MD_procToolContributorEmail = parsedMD
				.get("provenance.processingStep.tool.contributor.email");
		HashMap<Integer, String> MD_procToolContributorId = parsedMD
				.get("provenance.processingStep.tool.softwareSourceCode.id");
		HashMap<Integer, String> MD_procToolContributorRole = parsedMD
				.get("provenance.processingStep.tool.contributor.role");

		HashMap<Integer, String> MD_procToolSoftwareVersion = parsedMD
				.get("provenance.processingStep.tool.softwareVersion");
		HashMap<Integer, String> MD_procToolProgrammingLanguage = parsedMD
				.get("provenance.processingStep.tool.programmingLanguage");
		HashMap<Integer, String> MD_procToolOperatingSystem = parsedMD
				.get("provenance.processingStep.tool.operatingSystem");

		HashMap<Integer, String> MD_procToolSoftwareSourceCodeId = parsedMD
				.get("provenance.processingStep.tool.softwareSourceCode.id");
		HashMap<Integer, String> MD_procToolSoftwareSourceCodeIdType = parsedMD
				.get("provenance.processingStep.tool.softwareSourceCode.id.type");
		HashMap<Integer, String> MD_procToolSoftwareSourceCodeIdScheme = parsedMD
				.get("provenance.processingStep.tool.softwareSourceCode.scheme");
		HashMap<Integer, String> MD_procToolSoftwareSourceCodeLink = parsedMD
				.get("provenance.processingStep.tool.softwareSourceCode.link");
		HashMap<Integer, String> MD_procToolSoftwareSourceCodeChecksum = parsedMD
				.get("provenance.processingStep.tool.softwareSourceCode.checksum");
		HashMap<Integer, String> MD_procToolSoftwareSourceCodeChecksumType = parsedMD
				.get("provenance.processingStep.tool.softwareSourceCode.checksum.type");

		HashMap<Integer, String> MD_procToolSoftwareApplicationId = parsedMD
				.get("provenance.processingStep.tool.softwareApplication.id");
		HashMap<Integer, String> MD_procToolSoftwareApplicationIdType = parsedMD
				.get("provenance.processingStep.tool.softwareApplication.id.type");
		HashMap<Integer, String> MD_procToolSoftwareApplicationIdScheme = parsedMD
				.get("provenance.processingStep.tool.softwareApplication.scheme");
		HashMap<Integer, String> MD_procToolSoftwareApplicationLink = parsedMD
				.get("provenance.processingStep.tool.softwareApplication.link");
		HashMap<Integer, String> MD_procToolSoftwareApplicationChecksum = parsedMD
				.get("provenance.processingStep.tool.softwareApplication.checksum");
		HashMap<Integer, String> MD_procToolSoftwareApplicationChecksumType = parsedMD
				.get("provenance.processingStep.tool.softwareApplication.checksum.type");

		HashMap<Integer, String> MD_procToolCodeRepository = parsedMD
				.get("provenance.processingStep.tool.codeRepository");
		HashMap<Integer, String> MD_procToolLicenseNote = parsedMD.get("provenance.processingStep.tool.license.note");
		HashMap<Integer, String> MD_procToolLicenseTerms = parsedMD.get("provenance.processingStep.tool.license.terms");

		HashMap<Integer, String> MD_procToolCitation = parsedMD.get("provenance.processingStep.tool.citation");

		HashMap<Integer, String> MD_procToolReferencedPublicationId = parsedMD
				.get("provenance.processingStep.tool.referencedPublication.id");
		HashMap<Integer, String> MD_procToolReferencedPublicationIdScheme = parsedMD
				.get("provenance.processingStep.tool.referencedPublication.id.scheme");
		HashMap<Integer, String> MD_procToolReferencedPublicationIdType = parsedMD
				.get("provenance.processingStep.tool.referencedPublication.id.type");
		HashMap<Integer, String> MD_procToolReferencedPublicationCitation = parsedMD
				.get("provenance.processingStep.tool.referencedPublication.citation");
		HashMap<Integer, String> MD_procToolReferencedPublicationURL = parsedMD
				.get("provenance.processingStep.tool.referencedPublication.url");

		EngMeta.Software tool = objFacEngMeta.createSoftware();

		for (int i = 0; i < ExtractIng.NUMBER_OF_MD; i++) {

			Boolean set = false;

			if (MD_procToolName != null && MD_procToolName.containsKey(i)) {
				tool.setName(MD_procToolName.get(i));
				set = true;
			}

			EngMeta.PersonOrOrganization procToolContributor = objFacEngMeta.createPersonOrOrganization();
			EngMeta.PersonOrOrganization procToolContributorAffiliation = objFacEngMeta.createPersonOrOrganization();
			EngMeta.Pid procToolContributorId = objFacEngMeta.createPid();

			if (MD_procToolContributorName != null && MD_procToolContributorName.containsKey(i)) {
				procToolContributor.setName(MD_procToolContributorName.get(i));
				set = true;
			}

			if (MD_procToolContributorGivenName != null && MD_procToolContributorGivenName.containsKey(i)) {
				procToolContributor.setGivenName(MD_procToolContributorGivenName.get(i));
				set = true;
			}

			if (MD_procToolContributorFamilyName != null && MD_procToolContributorFamilyName.containsKey(i)) {
				procToolContributor.setFamilyName(MD_procToolContributorFamilyName.get(i));
				set = true;
			}

			if (MD_procToolContributorAddress != null && MD_procToolContributorAddress.containsKey(i)) {
				procToolContributor.setAddress(MD_procToolContributorAddress.get(i));
				set = true;
			}

			// TODO: Really needed the affiliation details here?
			// if (MD_procToolContributorAffiliationName != null &&
			// MD_procToolContributorAffiliationName.containsKey(i)) {
			// procToolContributorAffiliation.setName(MD_procToolContributorAffiliationName.get(i));
			// set = true;
			// }
			//
			// if (MD_procToolContributorAffiliationGivenName != null &&
			// MD_procToolContributorAffiliationGivenName.containsKey(i)) {
			// procToolContributorAffiliation.setGivenName(MD_procToolContributorAffiliationGivenName.get(i));
			// set = true;
			// }
			//
			// if (MD_procToolContributorAffiliationFamilyName != null &&
			// MD_procToolContributorAffiliationFamilyName.containsKey(i)) {
			// procToolContributorAffiliation.setFamilyName(MD_procToolContributorAffiliationFamilyName.get(i));
			// set = true;
			// }
			//
			// if (MD_procToolContributorAffiliationAddress != null &&
			// MD_procToolContributorAffiliationAddress.containsKey(i)) {
			// procToolContributorAffiliation.setAddress(MD_procToolContributorAffiliationAddress.get(i));
			// set = true;
			// }
			//
			// if (MD_procToolContributorAffiliationEmail != null &&
			// MD_procToolContributorAffiliationEmail.containsKey(i)) {
			// procToolContributorAffiliation.setEmail(MD_procToolContributorAffiliationEmail.get(i));
			// set = true;
			// }
			//
			// if (MD_procToolContributorAffiliationRole != null &&
			// MD_procToolContributorAffiliationRole.containsKey(i)) {
			//
			// try { // TODO: find better solution than try/catch here
			// // System.out.println(MD_procToolContributorRole.get(i) + "Role will now be
			// set.");
			// procToolContributorAffiliation
			// .setRole(dtc.dateType.ContributorType.fromValue(MD_procToolContributorAffiliationRole.get(i)));
			// set = true;
			// } catch (IllegalArgumentException ex) {
			//
			// }
			//
			// }
			// procToolContributors Affiliation done, now set it:
			procToolContributor.setAffiliation(procToolContributorAffiliation);

			if (MD_procToolContributorRole != null && MD_procToolContributorRole.containsKey(i)) {
				// System.out.println("Role is existent. It is: " +
				// MD_procToolContributorRole.get(i));

				try { // TODO: find better solution here
						// System.out.println(MD_procToolContributorRole.get(i) + "Role will now be
						// set.");
					procToolContributor
							.setRole(dtc.dateType.ContributorType.fromValue(MD_procToolContributorRole.get(i)));
					set = true;
				} catch (IllegalArgumentException ex) {

				}

			}

			// The procToolContributors ID
			if (MD_procToolContributorId != null && MD_procToolContributorId.containsKey(i)) {
				procToolContributorId.setValue(MD_procToolContributorId.get(i));
				set = true;
			}

			// The procToolContributors ID
			if (MD_procToolContributorId != null && MD_procToolContributorId.containsKey(i)) {
				procToolContributorId.setValue(MD_procToolContributorId.get(i));
				set = true;
			}

			// TODO: really needed herE?
			// if (MD_procToolContributorIdScheme != null &&
			// MD_procToolContributorIdScheme.containsKey(i)) {
			// procToolContributorId.setScheme(MD_procToolContributorIdScheme.get(i));
			// set = true;
			// }
			//
			// if (MD_procToolContributorIdType != null &&
			// MD_procToolContributorIdType.containsKey(i)) {
			// procToolContributorId.setType(MD_procToolContributorIdType.get(i));
			// set = true;
			// }
			// Set the procToolContributors ID
			procToolContributor.getId().add(procToolContributorId);

			if (MD_procToolContributorEmail != null && MD_procToolContributorEmail.containsKey(i)) {

				procToolContributor.setEmail(MD_procToolContributorEmail.get(i));
				set = true;
			}

			// Only set the object if there was at least one entry, so no empty tags will
			// occur
			if (set)
				md.getContributor().add(procToolContributor);

			//////////////////////////////////
			if (MD_procToolSoftwareVersion != null && MD_procToolSoftwareVersion.containsKey(i)) {
				tool.setSoftwareVersion(MD_procToolSoftwareVersion.get(i));
				set = true;
			}

			/////////////////////////////// 7
			if (MD_procToolOperatingSystem != null && MD_procToolOperatingSystem.containsKey(i)) {
				tool.getOperatingSystem().add(MD_procToolOperatingSystem.get(i));
				set = true;
			}

			///////////////////////

			if (MD_procToolProgrammingLanguage != null && MD_procToolProgrammingLanguage.containsKey(i)) {
				tool.getProgrammingLanguage().add(MD_procToolProgrammingLanguage.get(i));
				set = true;
			}

			///////////////////// procToolSoftwareSourceCode

			EngMeta.FileOrResource softwareSourceCode = objFacEngMeta.createFileOrResource();

			EngMeta.Pid softwareSourceCodeId = objFacEngMeta.createPid();

			Boolean setSoftwareSourceCode = false;

			if (MD_procToolSoftwareSourceCodeId != null && MD_procToolSoftwareSourceCodeId.containsKey(i)) {
				softwareSourceCodeId.setValue(MD_procToolSoftwareSourceCodeId.get(i));
				set = true;
				setSoftwareSourceCode = true;
			}

			if (MD_procToolSoftwareSourceCodeIdType != null && MD_procToolSoftwareSourceCodeIdType.containsKey(i)) {
				softwareSourceCodeId.setType(MD_procToolSoftwareSourceCodeIdType.get(i));
				set = true;
				setSoftwareSourceCode = true;
			}

			if (MD_procToolSoftwareSourceCodeIdScheme != null && MD_procToolSoftwareSourceCodeIdScheme.containsKey(i)) {
				softwareSourceCodeId.setScheme(MD_procToolSoftwareSourceCodeIdScheme.get(i));
				set = true;
				setSoftwareSourceCode = true;
			}

			if (setSoftwareSourceCode)
				softwareSourceCode.setId(softwareSourceCodeId);

			if (MD_procToolSoftwareSourceCodeLink != null && MD_procToolSoftwareSourceCodeLink.containsKey(i)) {
				softwareSourceCode.getLink().add(MD_procToolSoftwareSourceCodeLink.get(i));
				set = true;
				setSoftwareSourceCode = true;
			}

			EngMeta.ChecksumType softwareSourceCodeChecksum = objFacEngMeta.createChecksumType();

			if (MD_procToolSoftwareSourceCodeChecksum != null && MD_procToolSoftwareSourceCodeChecksum.containsKey(i)) {
				softwareSourceCodeChecksum.setValue(MD_procToolSoftwareSourceCodeChecksum.get(i));
				set = true;
				setSoftwareSourceCode = true;
			}

			if (MD_procToolSoftwareSourceCodeChecksumType != null
					&& MD_procToolSoftwareSourceCodeChecksumType.containsKey(i)) {
				softwareSourceCodeChecksum.setAlgorithm(MD_procToolSoftwareSourceCodeChecksumType.get(i));
				softwareSourceCode.getChecksum().add(softwareSourceCodeChecksum);
				set = true;
				setSoftwareSourceCode = true;
			}

			if (setSoftwareSourceCode)
				tool.setSoftwareSourceCode(softwareSourceCode);

			/////////////// procToolSoftwareApplication

			EngMeta.FileOrResource softwareApplication = objFacEngMeta.createFileOrResource();

			EngMeta.Pid softwareApplicationId = objFacEngMeta.createPid();

			Boolean setSoftwareApplication = false;

			if (MD_procToolSoftwareApplicationId != null && MD_procToolSoftwareApplicationId.containsKey(i)) {
				softwareApplicationId.setValue(MD_procToolSoftwareApplicationId.get(i));
				set = true;
				setSoftwareApplication = true;
			}

			if (MD_procToolSoftwareApplicationIdType != null && MD_procToolSoftwareApplicationIdType.containsKey(i)) {
				softwareApplicationId.setType(MD_procToolSoftwareApplicationIdType.get(i));
				set = true;
				setSoftwareApplication = true;
			}

			if (MD_procToolSoftwareApplicationIdScheme != null
					&& MD_procToolSoftwareApplicationIdScheme.containsKey(i)) {
				softwareApplicationId.setScheme(MD_procToolSoftwareApplicationIdScheme.get(i));
				set = true;
				setSoftwareApplication = true;
			}

			softwareApplication.setId(softwareApplicationId);

			if (MD_procToolSoftwareApplicationLink != null && MD_procToolSoftwareApplicationLink.containsKey(i)) {
				softwareApplication.getLink().add(MD_procToolSoftwareApplicationLink.get(i));
				set = true;
				setSoftwareApplication = true;
			}

			EngMeta.ChecksumType softwareApplicationChecksum = objFacEngMeta.createChecksumType();

			if (MD_procToolSoftwareApplicationChecksum != null
					&& MD_procToolSoftwareApplicationChecksum.containsKey(i)) {
				softwareApplicationChecksum.setValue(MD_procToolSoftwareApplicationChecksum.get(i));
				set = true;
				setSoftwareApplication = true;
			}

			if (MD_procToolSoftwareApplicationChecksumType != null
					&& MD_procToolSoftwareApplicationChecksumType.containsKey(i)) {
				softwareApplicationChecksum.setAlgorithm(MD_procToolSoftwareApplicationChecksumType.get(i));
				softwareApplication.getChecksum().add(softwareApplicationChecksum);
				set = true;
				setSoftwareApplication = true;
			}

			if (setSoftwareApplication)
				tool.setSoftwareApplication(softwareApplication);

			///////////////// codeRepository
			if (MD_procToolCodeRepository != null && MD_procToolCodeRepository.containsKey(i)) {
				tool.setCodeRepository(MD_procToolCodeRepository.get(i));
				set = true;

			}

			///// license

			// premis.ObjectFactory objFacPremis = new premis.ObjectFactory();
			premis.LicenseInformationComplexType license = objFacPremis.createLicenseInformationComplexType();
			if (MD_procToolLicenseNote != null && MD_procToolLicenseNote.containsKey(i)) {

				JAXBElement<String> licenseTerms = objFacPremis.createLicenseTerms(MD_procToolLicenseNote.get(i));
				license.getContent().add(licenseTerms);
			}

			if (MD_procToolLicenseTerms != null && MD_procToolLicenseTerms.containsKey(i)) {

				JAXBElement<String> licenseNote = objFacPremis.createLicenseNote(MD_procToolLicenseTerms.get(i));
				license.getContent().add(licenseNote);
			}

			///////////// citation
			if (MD_procToolCitation != null && MD_procToolCitation.containsKey(i)) {
				tool.setCitation(MD_procToolCitation.get(i));
				set = true;
			}

			///////////// referencePublication

			// HashMap<Integer, String> MD_procToolReferencedPublicationId =
			// parsedMD.get("provenance.processingStep.tool.referencedPublication.id");
			// HashMap<Integer, String> MD_procToolReferencedPublicationIdScheme =
			// parsedMD.get("provenance.processingStep.tool.referencedPublication.id.scheme");
			// HashMap<Integer, String> MD_procToolReferencedPublicationIdType =
			// parsedMD.get("provenance.processingStep.tool.referencedPublication.id.type");
			// HashMap<Integer, String> MD_procToolReferencedPublicationCitation =
			// parsedMD.get("provenance.processingStep.tool.referencedPublication.citation");
			// HashMap<Integer, String> MD_procToolReferencedPublicationURL =
			// parsedMD.get("provenance.processingStep.tool.referencedPublication.url");
			//

			EngMeta.Publication toolPublication = objFacEngMeta.createPublication();
			EngMeta.Pid toolPublicationId = objFacEngMeta.createPid();

			Boolean setReferencePublication = false;

			if (MD_procToolReferencedPublicationId != null && MD_procToolReferencedPublicationId.containsKey(i)) {
				toolPublicationId.setValue(MD_procToolReferencedPublicationId.get(i));
				setReferencePublication = true;
			}

			if (MD_procToolReferencedPublicationIdScheme != null
					&& MD_procToolReferencedPublicationIdScheme.containsKey(i)) {
				toolPublicationId.setScheme(MD_procToolReferencedPublicationIdScheme.get(i));
				setReferencePublication = true;
			}

			if (MD_procToolReferencedPublicationIdType != null
					&& MD_procToolReferencedPublicationIdType.containsKey(i)) {
				toolPublicationId.setType(MD_procToolReferencedPublicationIdType.get(i));
				setReferencePublication = true;
			}
			if (set)
				toolPublication.setId(toolPublicationId);

			if (MD_procToolReferencedPublicationCitation != null
					&& MD_procToolReferencedPublicationCitation.containsKey(i)) {
				toolPublication.setCitation(MD_procToolReferencedPublicationCitation.get(i));
				setReferencePublication = true;
			}

			if (MD_procToolReferencedPublicationURL != null && MD_procToolReferencedPublicationURL.containsKey(i)) {
				toolPublication.setUrl(MD_procToolReferencedPublicationURL.get(i));
				setReferencePublication = true;
			}

			if (setReferencePublication) {
				tool.setReferencePublication(toolPublication);
				set = true;
			}
			if (set)
				proc.getTool().add(tool);

			// provenance.processingStep.executionCommand
			HashMap<Integer, String> MD_procToolExecutionCommand = parsedMD
					.get("provenance.processingStep.executionCommand");

			if (MD_procToolExecutionCommand != null && MD_procToolExecutionCommand.containsKey(i)) {
				proc.getExecutionCommand().add(MD_procToolExecutionCommand.get(i));
				set = true;
			}
		}

		/*
		 * instrument:
		 * 
		 * provenance.processingStep.instrument.name
		 * provenance.processingStep.instrument.description
		 * provenance.processingStep.instrument.type
		 * provenance.processingStep.instrument.partnum.value
		 * provenance.processingStep.instrument.partnum.vendor
		 * provenance.processingStep.instrument.serialnum.value
		 * provenance.processingStep.instrument.serialnum.vendor
		 * provenance.processingStep.instrument.software
		 * provenance.processingStep.instrument.software.os
		 * provenance.processingStep.instrument.date
		 * 
		 */

		HashMap<Integer, String> MD_procInstrumentName = parsedMD.get("provenance.processingStep.instrument.name");
		HashMap<Integer, String> MD_procInstrumentDescription = parsedMD
				.get("provenance.processingStep.instrument.description");
		HashMap<Integer, String> MD_procInstrumentType = parsedMD.get("provenance.processingStep.instrument.type");
		HashMap<Integer, String> MD_procInstrumentPartnumValue = parsedMD
				.get("provenance.processingStep.instrument.partnum.value");
		HashMap<Integer, String> MD_procInstrumentPartnumVendor = parsedMD
				.get("provenance.processingStep.instrument.partnum.vendor");
		HashMap<Integer, String> MD_procInstrumentSerialnumValue = parsedMD
				.get("provenance.processingStep.instrument.serialnum.value");
		HashMap<Integer, String> MD_procInstrumentSerialnumVendor = parsedMD
				.get("provenance.processingStep.instrument.serialnum.vendor");
		HashMap<Integer, String> MD_procInstrumentSoftware = parsedMD
				.get("provenance.processingStep.instrument.software");
		HashMap<Integer, String> MD_procInstrumentSoftwareOs = parsedMD
				.get("provenance.processingStep.instrument.software.os");
		HashMap<Integer, String> MD_procInstrumentDate = parsedMD.get("provenance.processingStep.instrument.date");

		for (int i = 0; i < ExtractIng.NUMBER_OF_MD; i++) {

			Boolean set = false;

			exptml.InstrumentType instrument = objFacExptml.createInstrumentType();

			if (MD_procInstrumentName != null && MD_procInstrumentName.containsKey(i)) {
				exptml.SmallTextType instrumentName = objFacExptml.createSmallTextType();
				instrumentName.setValue(MD_procInstrumentName.get(i));
				instrument.setName(instrumentName);
				set = true;
			}

			if (MD_procInstrumentDescription != null && MD_procInstrumentDescription.containsKey(i)) {
				exptml.LargeTextType instrumentDescription = objFacExptml.createLargeTextType();
				instrumentDescription.setValue(MD_procInstrumentDescription.get(i));
				instrument.setDescription(instrumentDescription);
				set = true;
			}

			if (MD_procInstrumentType != null && MD_procInstrumentType.containsKey(i)) {
				exptml.SmallTextType instrumentType = objFacExptml.createSmallTextType();
				instrumentType.setValue(MD_procInstrumentType.get(i));
				instrument.setName(instrumentType);
				set = true;
			}

			if (MD_procInstrumentPartnumValue != null && MD_procInstrumentPartnumValue.containsKey(i)) {
				exptml.VendorIdType instrumentPartnum = objFacExptml.createVendorIdType();
				instrumentPartnum.setValue(MD_procInstrumentPartnumValue.get(i));
				// instrumentPartnum.setVendor(parsedMD.get("provenance.processingStep.instrument.partnum.vendor"));
				instrument.getPartnum().add(instrumentPartnum);
				set = true;
			}

			if (MD_procInstrumentPartnumVendor != null && MD_procInstrumentPartnumVendor.containsKey(i)) {
				exptml.VendorIdType instrumentPartnumVendor = objFacExptml.createVendorIdType();
				// instrumentSerialnum.setValue(parsedMD.get("provenance.processingStep.instrument.serialnum.value"));
				instrumentPartnumVendor.setVendor(MD_procInstrumentPartnumVendor.get(i));
				instrument.getPartnum().add(instrumentPartnumVendor);
				set = true;
			}

			if (MD_procInstrumentSerialnumValue != null && MD_procInstrumentSerialnumValue.containsKey(i)) {
				exptml.VendorIdType instrumentSerialnum = objFacExptml.createVendorIdType();
				instrumentSerialnum.setValue(MD_procInstrumentSerialnumValue.get(i));
				// instrumentPartnum.setVendor(parsedMD.get("provenance.processingStep.instrument.partnum.vendor"));
				instrument.getSerialnum().add(instrumentSerialnum);
				set = true;
			}

			if (MD_procInstrumentSerialnumVendor != null && MD_procInstrumentSerialnumVendor.containsKey(i)) {
				exptml.VendorIdType instrumentPartnumVendor = objFacExptml.createVendorIdType();
				// instrumentSerialnum.setValue(parsedMD.get("provenance.processingStep.instrument.serialnum.value"));
				instrumentPartnumVendor.setVendor(MD_procInstrumentSerialnumVendor.get(i));
				instrument.getSerialnum().add(instrumentPartnumVendor);
				set = true;
			}

			exptml.SoftwareType instrumentSoftware = objFacExptml.createSoftwareType();
			Boolean setInstrumentSoftware = false;

			if (MD_procInstrumentSoftware != null && MD_procInstrumentSoftware.containsKey(i)) {
				instrumentSoftware.setContent(MD_procInstrumentSoftware.get(i));
				set = true;
				setInstrumentSoftware = true;
			}

			if (MD_procInstrumentSoftwareOs != null && MD_procInstrumentSoftwareOs.containsKey(i)) {
				instrumentSoftware.setOs(MD_procInstrumentSoftwareOs.get(i));
				set = true;
				setInstrumentSoftware = true;
			}

			if (setInstrumentSoftware)
				instrument.setSoftware(instrumentSoftware);

			if (MD_procInstrumentDate != null && MD_procInstrumentDate.containsKey(i)) {

				exptml.ExptmlDateType instrumentDate = objFacExptml.createExptmlDateType();

				try {
					String sDate1 = MD_procInstrumentDate.get(i);

					Date date1 = new SimpleDateFormat("YYYY-MM-DD").parse(sDate1);

					GregorianCalendar c = new GregorianCalendar();
					c.setTime(date1);

					XMLGregorianCalendar instrumentDateXML = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);

					instrumentDate.setValue(instrumentDateXML);

					instrument.getDate().add(instrumentDate);
				} catch (java.text.ParseException e) {
					String sDate1 = "0000-00-00";

					Date date1 = new SimpleDateFormat("YYYY-MM-DD").parse(sDate1);

					GregorianCalendar c = new GregorianCalendar();
					c.setTime(date1);

					XMLGregorianCalendar instrumentDateXML = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
					instrumentDate.setValue(instrumentDateXML);

					instrument.getDate().add(instrumentDate);
				}

			}

			if (set)
				proc.getInstrument().add(instrument);

		}

		/*
		 * provenance.processingStep.output.id provenance.processingStep.output.id.type
		 * provenance.processingStep.output.id.scheme
		 * provenance.processingStep.output.link
		 * provenance.processingStep.output.checksum
		 * provenance.processingStep.output.checksum.type
		 */

		HashMap<Integer, String> MD_procOutputId = parsedMD.get("provenance.processingStep.output.id");
		HashMap<Integer, String> MD_procOutputIdType = parsedMD.get("provenance.processingStep.output.id.type");
		HashMap<Integer, String> MD_procOutputIdScheme = parsedMD.get("provenance.processingStep.output.id.scheme");
		HashMap<Integer, String> MD_procOutputLink = parsedMD.get("provenance.processingStep.output.link");
		HashMap<Integer, String> MD_procOutputChecksum = parsedMD.get("provenance.processingStep.output.checksum");
		HashMap<Integer, String> MD_procOutputChecksumType = parsedMD
				.get("provenance.processingStep.output.checksum.type");

		for (int i = 0; i < ExtractIng.NUMBER_OF_MD; i++) {

			Boolean set = false;

			EngMeta.FileOrResource output = objFacEngMeta.createFileOrResource();

			EngMeta.Pid outputId = objFacEngMeta.createPid();

			if (MD_procOutputId != null && MD_procOutputId.containsKey(i)) {
				outputId.setValue(MD_procOutputId.get(i));
				set = true;
			}

			if (MD_procOutputIdType != null && MD_procOutputIdType.containsKey(i)) {
				outputId.setType(MD_procOutputIdType.get(i));
				set = true;
			}

			if (MD_procOutputIdScheme != null && MD_procOutputIdScheme.containsKey(i)) {
				outputId.setScheme(MD_procOutputIdScheme.get(i));
				set = true;
			}
			if (set)
				output.setId(outputId);

			if (MD_procOutputLink != null && MD_procOutputLink.containsKey(i)) {
				output.getLink().add(MD_procOutputLink.get(i));
				set = true;
			}

			if (MD_procOutputChecksum != null && MD_procOutputChecksum.containsKey(i)) {
				EngMeta.ChecksumType checksumOutput = objFacEngMeta.createChecksumType();

				checksumOutput.setValue(MD_procOutputChecksum.get(i));
				if (MD_procOutputChecksumType != null && MD_procOutputChecksumType.containsKey(i)) {
					checksumOutput.setAlgorithm(MD_procOutputChecksumType.get(i));
				}
				set = true;
			}

		}

		/*
		 * provenance.processingStep.environment.name
		 * provenance.processingStep.environment.compiler.name
		 * provenance.processingStep.environment.compiler.flags
		 * provenance.processingStep.environment.nodes
		 * provenance.processingStep.environment.ppn
		 * provenance.processingStep.environment.cpu
		 */

		HashMap<Integer, String> MD_procEnvironmentName = parsedMD.get("provenance.processingStep.environment.name");
		HashMap<Integer, String> MD_procEnvironmentCompilerName = parsedMD
				.get("provenance.processingStep.environment.compiler.name");
		HashMap<Integer, String> MD_procEnvironmentCompilerFlags = parsedMD
				.get("provenance.processingStep.environment.compiler.flags");
		HashMap<Integer, String> MD_procEnvironmentNodes = parsedMD.get("provenance.processingStep.environment.nodes");
		HashMap<Integer, String> MD_procEnvironmentPpn = parsedMD.get("provenance.processingStep.environment.ppn");
		HashMap<Integer, String> MD_procEnvironmentCpu = parsedMD.get("provenance.processingStep.environment.cpu");

		for (int i = 0; i < ExtractIng.NUMBER_OF_MD; i++) {

			Boolean set = false;
			EngMeta.Environment environment = objFacEngMeta.createEnvironment();
			EngMeta.Environment.Compiler compiler = new EngMeta.Environment.Compiler();

			if (MD_procEnvironmentName != null && MD_procEnvironmentName.containsKey(i)) {
				environment.setName(MD_procEnvironmentName.get(i));
				set = true;
			}

			if (MD_procEnvironmentNodes != null && MD_procEnvironmentNodes.containsKey(i)) {
				environment.setNodes(MD_procEnvironmentNodes.get(i));
				set = true;
			}

			if (MD_procEnvironmentPpn != null && MD_procEnvironmentPpn.containsKey(i)) {
				environment.setPpn(MD_procEnvironmentPpn.get(i));
				set = true;
			}

			if (MD_procEnvironmentCpu != null && MD_procEnvironmentCpu.containsKey(i)) {
				environment.getCpu().add(MD_procEnvironmentCpu.get(i));
				set = true;
			}

			Boolean setCompiler = false;

			if (MD_procEnvironmentCompilerName != null && MD_procEnvironmentCompilerName.containsKey(i)) {
				compiler.setName(MD_procEnvironmentCompilerName.get(i));
				set = true;
				setCompiler = true;
			}

			if (MD_procEnvironmentCompilerFlags != null && MD_procEnvironmentCompilerFlags.containsKey(i)) {
				compiler.setFlags(MD_procEnvironmentCompilerFlags.get(i));

				set = true;
				setCompiler = true;

			}

			if (setCompiler)
				environment.getCompiler().add(compiler);

			if (set)
				proc.setEnvironment(environment);

		}

		/*
		 * provenance.processingStep.order
		 */

		HashMap<Integer, String> MD_procOrder = parsedMD.get("provenance.processingStep.order");

		for (int i = 0; i < ExtractIng.NUMBER_OF_MD; i++) {

			if (MD_procOrder != null && MD_procOrder.containsKey(i)) {
				try {

					BigInteger bigIntegerOrder = new BigInteger(MD_procOrder.get(i).trim());
					proc.setOrder(bigIntegerOrder);
				} catch (NumberFormatException e) {
					// System.out.println("Exception caught!");
					// e.printStackTrace();
					// temp.setNumberOfTimesteps(0);
					// TODO
				}
			}

		}

		// Now put all the processingStep Information into the provenance
		prov.getStep().add(proc);

		/*
		 * Size
		 */

		HashMap<Integer, String> MD_size = parsedMD.get("size");

		for (int i = 0; i < ExtractIng.NUMBER_OF_MD; i++) {

			if (MD_size != null && MD_size.containsKey(i)) {
				try {
					md.setSize(Long.valueOf(MD_size.get(i)));
				} catch (NumberFormatException e) {
					// TODO
				}
			}

		}

		/*
		 * # System # # Observed System system.phase system.phase.component.name
		 * system.phase.component.smilesCode system.phase.component.IUPAC
		 * system.phase.component.quantity system.phase.component.unit
		 * system.phase.component.forcefield.name
		 * system.phase.component.forcefield.parameter.name
		 * system.phase.component.forcefield.parameter.symbol
		 * system.phase.component.forcefield.parameter.value
		 * system.phase.component.forcefield.parameter.encoding
		 * system.phase.component.forcefield.parameter.error system.component.name
		 * system.component.smilesCode system.component.IUPAC system.component.quantity
		 * system.component.unit system.component.forcefield.name
		 * system.component.forcefield.parameter.name
		 * system.component.forcefield.parameter.symbol
		 * system.component.forcefield.parameter.value
		 * system.component.forcefield.parameter.encoding
		 * system.component.forcefield.parameter.error system.grid.file.id
		 * system.grid.file.id.type system.grid.file.id.scheme system.grid.file.link
		 * system.grid.file.checksum system.grid.file.checksum.type
		 * system.grid.countCells system.grid.countBlocks system.grid.targetCores
		 * system.grid.countX system.grid.countY system.grid.countZ system.grid.unit
		 * system.grid.distance system.grid.scalingFormula system.grid.point.positionX
		 * system.grid.point.positionY system.grid.point.positionZ
		 * system.temporalResolution.numberOfTimesteps
		 * system.temporalResolution.interval system.temporalResolution.unit
		 * system.temporalResolution.timestep
		 * 
		 * system.boundaryCondition.shape system.boundaryCondition.size
		 * system.boundaryCondition.position
		 * 
		 * system.boundaryCondition.component.name
		 * system.boundaryCondition.component.smilesCode
		 * system.boundaryCondition.component.IUPAC
		 * system.boundaryCondition.component.quantity
		 * system.boundaryCondition.component.unit
		 * system.boundaryCondition.component.forcefield.name
		 * system.boundaryCondition.component.forcefield.parameter.name
		 * system.boundaryCondition.component.forcefield.parameter.symbol
		 * system.boundaryCondition.component.forcefield.parameter.value
		 * system.boundaryCondition.component.forcefield.parameter.encoding
		 * system.boundaryCondition.component.forcefield.parameter.error
		 * system.boundaryCondition.parameter.name
		 * system.boundaryCondition.parameter.symbol
		 * system.boundaryCondition.parameter.value
		 * system.boundaryCondition.parameter.encoding
		 * system.boundaryCondition.parameter.error
		 */

		HashMap<Integer, String> MD_systemBoundaryConditionShape = parsedMD.get("system.boundaryCondition.shape");
		HashMap<Integer, String> MD_systemBoundaryConditionSize = parsedMD.get("system.boundaryCondition.size");
		HashMap<Integer, String> MD_systemBoundaryConditionPosition = parsedMD.get("system.boundaryCondition.position");
		HashMap<Integer, String> MD_systemBoundaryConditionComponentName = parsedMD
				.get("system.boundaryCondition.component.name");
		HashMap<Integer, String> MD_systemBoundaryConditionComponentSmilesCode = parsedMD
				.get("system.boundaryCondition.component.smilesCode");
		HashMap<Integer, String> MD_systemBoundaryConditionComponentIUPAC = parsedMD
				.get("system.boundaryCondition.component.IUPAC");
		HashMap<Integer, String> MD_systemBoundaryConditionComponentQuantity = parsedMD
				.get("system.boundaryCondition.component.quantity");
		HashMap<Integer, String> MD_systemBoundaryConditionComponentForceFieldName = parsedMD
				.get("system.boundaryCondition.component.forcefield.name");
		HashMap<Integer, String> MD_systemBoundaryConditionComponentForceFieldParameterName = parsedMD
				.get("system.boundaryCondition.component.forcefield.parameter.name");
		HashMap<Integer, String> MD_systemBoundaryConditionComponentForceFieldParameterSymbol = parsedMD
				.get("system.boundaryCondition.component.forcefield.parameter.symbol");
		HashMap<Integer, String> MD_systemBoundaryConditionComponentForceFieldParameterValue = parsedMD
				.get("system.boundaryCondition.component.forcefield.parameter.value");
		HashMap<Integer, String> MD_systemBoundaryConditionComponentForceFieldParameterEncoding = parsedMD
				.get("system.boundaryCondition.component.forcefield.parameter.encoding");
		HashMap<Integer, String> MD_systemBoundaryConditionComponentForceFieldParameterError = parsedMD
				.get("system.boundaryCondition.component.forcefield.parameter.error");

		HashMap<Integer, String> MD_systemBoundaryConditionParameterName = parsedMD
				.get("system.boundaryCondition.parameter.name");
		HashMap<Integer, String> MD_systemBoundaryConditionParameterSymbol = parsedMD
				.get("system.boundaryCondition.parameter.symbol");
		HashMap<Integer, String> MD_systemBoundaryConditionParameterValue = parsedMD
				.get("system.boundaryCondition.parameter.value");
		HashMap<Integer, String> MD_systemBoundaryConditionParameterEncoding = parsedMD
				.get("system.boundaryCondition.parameter.encoding");
		HashMap<Integer, String> MD_systemBoundaryConditionParameterError = parsedMD
				.get("system.boundaryCondition.parameter.error");
		// TODO: Maybe work over component and component phase

		EngMeta.Dataset.System observedSystem = objFacEngMeta.createDatasetSystem();

		HashMap<Integer, String> MD_systemPhaseComponentName = parsedMD.get("system.phase.component.name");
		HashMap<Integer, String> MD_systemPhaseComponentSmilesCode = parsedMD.get("system.phase.component.smilesCode");
		HashMap<Integer, String> MD_systemPhaseComponentIupac = parsedMD.get("system.phase.component.IUPAC");
		HashMap<Integer, String> MD_systemPhaseComponentQuantity = parsedMD.get("system.phase.component.quantity");
		HashMap<Integer, String> MD_systemPhaseComponentUnit = parsedMD.get("system.phase.component.unit");

		HashMap<Integer, String> MD_systemPhaseComponentForceFieldName = parsedMD
				.get("system.phase.component.forcefield.name");
		HashMap<Integer, String> MD_systemPhaseComponentForceFieldParameterName = parsedMD
				.get("system.phase.component.forcefield.parameter.name");
		HashMap<Integer, String> MD_systemPhaseComponentForceFieldParameterSymbol = parsedMD
				.get("system.phase.component.forcefield.parameter.symbol");
		HashMap<Integer, String> MD_systemPhaseComponentForceFieldParameterValue = parsedMD
				.get("system.phase.component.forcefield.parameter.value");
		HashMap<Integer, String> MD_systemPhaseComponentForceFieldParameterEncoding = parsedMD
				.get("system.phase.component.forcefield.parameter.encoding");
		HashMap<Integer, String> MD_systemPhaseComponentForceFieldParameterError = parsedMD
				.get("system.phase.component.forcefield.parameter.error");

		HashMap<Integer, String> MD_systemGridFileId = parsedMD.get("system.grid.file.id");
		HashMap<Integer, String> MD_systemGridFileIdType = parsedMD.get("system.grid.file.id.type");
		HashMap<Integer, String> MD_systemGridFileIdScheme = parsedMD.get("system.grid.file.id.scheme");
		HashMap<Integer, String> MD_systemGridFileLink = parsedMD.get("system.grid.file.link");
		HashMap<Integer, String> MD_systemGridFileChecksum = parsedMD.get("system.grid.file.checksum");
		HashMap<Integer, String> MD_systemGridFileChecksumType = parsedMD.get("system.grid.file.checksum.type");

		HashMap<Integer, String> MD_systemGridCountCells = parsedMD.get("system.grid.countCells");
		HashMap<Integer, String> MD_systemGridCountBlocks = parsedMD.get("system.grid.countBlocks");
		HashMap<Integer, String> MD_systemGridTargetCores = parsedMD.get("system.grid.targetCores");
		HashMap<Integer, String> MD_systemGridCountX = parsedMD.get("system.grid.countX");
		HashMap<Integer, String> MD_systemGridCountY = parsedMD.get("system.grid.countY");
		HashMap<Integer, String> MD_systemGridCountZ = parsedMD.get("system.grid.countZ");
		HashMap<Integer, String> MD_systemGridUnit = parsedMD.get("system.grid.unit");
		HashMap<Integer, String> MD_systemGridDistance = parsedMD.get("system.grid.distance");
		HashMap<Integer, String> MD_systemGridScalingFormula = parsedMD.get("system.grid.scalingFormula");
		HashMap<Integer, String> MD_systemGridPointPositionX = parsedMD.get("system.grid.point.positionX");
		HashMap<Integer, String> MD_systemGridPointPositionY = parsedMD.get("system.grid.point.positionY");
		HashMap<Integer, String> MD_systemGridPointPositionZ = parsedMD.get("system.grid.point.positionZ");
		HashMap<Integer, String> MD_systemTemporalResolutionNumberOfTimeSteps = parsedMD
				.get("system.temporalResolution.numberOfTimesteps");
		HashMap<Integer, String> MD_systemTemporalResolutionInterval = parsedMD
				.get("system.temporalResolution.interval");
		HashMap<Integer, String> MD_systemTemporalResolutionUnit = parsedMD.get("system.temporalResolution.unit");
		HashMap<Integer, String> MD_systemTemporalResolutionTimestep = parsedMD
				.get("system.temporalResolution.timestep");

		for (int i = 0; i < ExtractIng.NUMBER_OF_MD; i++) {

			Boolean set = false;
			Boolean setComponent = false;

			EngMeta.Component componentPhase = objFacEngMeta.createComponent();

			if (MD_systemPhaseComponentName != null && MD_systemPhaseComponentName.containsKey(i)) {
				componentPhase.setName(MD_systemPhaseComponentName.get(i));
				set = true;
				setComponent = true;
			}

			if (MD_systemPhaseComponentSmilesCode != null && MD_systemPhaseComponentSmilesCode.containsKey(i)) {
				componentPhase.setSmilesCode(MD_systemPhaseComponentSmilesCode.get(i));
				set = true;
				setComponent = true;
			}

			if (MD_systemPhaseComponentIupac != null && MD_systemPhaseComponentIupac.containsKey(i)) {
				componentPhase.setIUPAC(MD_systemPhaseComponentIupac.get(i));
				set = true;
				setComponent = true;
			}

			if (MD_systemPhaseComponentQuantity != null && MD_systemPhaseComponentQuantity.containsKey(i)) {
				try {

					BigInteger bigIntQuantity = new BigInteger(MD_systemPhaseComponentQuantity.get(i).trim());
					componentPhase.setQuantity(bigIntQuantity);
					set = true;
					setComponent = true;
				} catch (NumberFormatException e) {
					// System.out.println("Exception caught!");
					// e.printStackTrace(); TODO
					// temp.setNumberOfTimesteps(0);
				}
			}

			if (MD_systemPhaseComponentUnit != null && MD_systemPhaseComponentUnit.containsKey(i)) {
				componentPhase.setUnit(MD_systemPhaseComponentUnit.get(i));
				set = true;
				setComponent = true;
			}

			Boolean setComponentForceFieldPhase = false;

			EngMeta.Component.Forcefield forcefieldPhase = objFacEngMeta.createComponentForcefield();
			EngMeta.Variable forceFieldParameterPhase = objFacEngMeta.createVariable();

			if (MD_systemPhaseComponentForceFieldName != null && MD_systemPhaseComponentForceFieldName.containsKey(i)) {
				forcefieldPhase.setName(MD_systemPhaseComponentForceFieldName.get(i));
				set = true;
				setComponentForceFieldPhase = true;

			}

			if (MD_systemPhaseComponentForceFieldParameterName != null
					&& MD_systemPhaseComponentForceFieldParameterName.containsKey(i)) {
				forceFieldParameterPhase.setName(MD_systemPhaseComponentForceFieldParameterName.get(i));
				set = true;
				setComponentForceFieldPhase = true;

			}

			if (MD_systemPhaseComponentForceFieldParameterValue != null
					&& MD_systemPhaseComponentForceFieldParameterValue.containsKey(i)) {
				forceFieldParameterPhase.setValue(MD_systemPhaseComponentForceFieldParameterValue.get(i));
				set = true;
				setComponentForceFieldPhase = true;
			}

			if (MD_systemPhaseComponentForceFieldParameterEncoding != null
					&& MD_systemPhaseComponentForceFieldParameterEncoding.containsKey(i)) {
				forceFieldParameterPhase.setEncoding(MD_systemPhaseComponentForceFieldParameterEncoding.get(i));
				set = true;
				setComponentForceFieldPhase = true;
			}

			if (MD_systemPhaseComponentForceFieldParameterError != null
					&& MD_systemPhaseComponentForceFieldParameterError.containsKey(i)) {
				try {

					BigDecimal bigIntError = new BigDecimal(
							MD_systemPhaseComponentForceFieldParameterError.get(i).trim());
					forceFieldParameterPhase.setError(bigIntError);
				} catch (NumberFormatException e) {
					// System.out.println("Exception caught!");
					// e.printStackTrace(); TODO
					// temp.setNumberOfTimesteps(0);
				}
			}

			if (MD_systemPhaseComponentForceFieldParameterSymbol != null
					&& MD_systemPhaseComponentForceFieldParameterSymbol.containsKey(i)) {
				forceFieldParameterPhase.setSymbol(MD_systemPhaseComponentForceFieldParameterEncoding.get(i));
				set = true;
				setComponentForceFieldPhase = true;
			}

			if (setComponentForceFieldPhase)
				componentPhase.setForcefield(forcefieldPhase);

			if (set)
				observedSystem.getComponent().add(componentPhase);

			// TODO: needed?
			// observedSystem.getPhase().add(observedSystemPhase);

			EngMeta.Component component = objFacEngMeta.createComponent();

			if (MD_systemPhaseComponentName != null && MD_systemPhaseComponentName.containsKey(i)) {
				component.setName(MD_systemPhaseComponentName.get(i));
				set = true;
				setComponent = true;
			}

			if (MD_systemPhaseComponentSmilesCode != null && MD_systemPhaseComponentSmilesCode.containsKey(i)) {
				component.setSmilesCode(MD_systemPhaseComponentSmilesCode.get(i));
				set = true;
				setComponent = true;
			}

			if (MD_systemPhaseComponentIupac != null && MD_systemPhaseComponentIupac.containsKey(i)) {
				component.setIUPAC(MD_systemPhaseComponentIupac.get(i));
				set = true;
				setComponent = true;
			}

			if (MD_systemPhaseComponentQuantity != null && MD_systemPhaseComponentQuantity.containsKey(i)) {
				try {

					BigInteger bigIntQuantity = new BigInteger(MD_systemPhaseComponentQuantity.get(i).trim());
					component.setQuantity(bigIntQuantity);
					set = true;
					setComponent = true;
				} catch (NumberFormatException e) {
					// System.out.println("Exception caught!");
					// e.printStackTrace(); TODO
					// temp.setNumberOfTimesteps(0);
				}
			}

			if (MD_systemPhaseComponentUnit != null && MD_systemPhaseComponentUnit.containsKey(i)) {
				component.setUnit(MD_systemPhaseComponentUnit.get(i));
				set = true;
				setComponent = true;
			}

			Boolean setComponentForceField = false;

			EngMeta.Component.Forcefield forcefield = objFacEngMeta.createComponentForcefield();
			EngMeta.Variable forcefieldParameter = objFacEngMeta.createVariable();

			if (MD_systemPhaseComponentForceFieldName != null && MD_systemPhaseComponentForceFieldName.containsKey(i)) {
				forcefield.setName(MD_systemPhaseComponentForceFieldName.get(i));
				set = true;
				setComponentForceField = true;

			}

			if (MD_systemPhaseComponentForceFieldParameterName != null
					&& MD_systemPhaseComponentForceFieldParameterName.containsKey(i)) {
				forcefieldParameter.setName(MD_systemPhaseComponentForceFieldParameterName.get(i));
				set = true;
				setComponentForceField = true;

			}

			if (MD_systemPhaseComponentForceFieldParameterValue != null
					&& MD_systemPhaseComponentForceFieldParameterValue.containsKey(i)) {
				forcefieldParameter.setValue(MD_systemPhaseComponentForceFieldParameterValue.get(i));
				set = true;
				setComponentForceField = true;
			}

			if (MD_systemPhaseComponentForceFieldParameterEncoding != null
					&& MD_systemPhaseComponentForceFieldParameterEncoding.containsKey(i)) {
				forcefieldParameter.setEncoding(MD_systemPhaseComponentForceFieldParameterEncoding.get(i));
				set = true;
				setComponentForceField = true;
			}

			if (MD_systemPhaseComponentForceFieldParameterError != null
					&& MD_systemPhaseComponentForceFieldParameterError.containsKey(i)) {
				try {

					BigDecimal bigIntError = new BigDecimal(
							MD_systemPhaseComponentForceFieldParameterError.get(i).trim());
					forcefieldParameter.setError(bigIntError);
				} catch (NumberFormatException e) {
					// System.out.println("Exception caught!");
					// e.printStackTrace(); TODO
					// temp.setNumberOfTimesteps(0);
				}
			}

			if (MD_systemPhaseComponentForceFieldParameterSymbol != null
					&& MD_systemPhaseComponentForceFieldParameterSymbol.containsKey(i)) {
				forcefieldParameter.setSymbol(MD_systemPhaseComponentForceFieldParameterEncoding.get(i));
				set = true;
				setComponentForceField = true;
			}

			if (setComponentForceField)
				component.setForcefield(forcefieldPhase);

			if (set)
				observedSystem.getComponent().add(component);

			// TODO: needed?
			// observedSystem.getPhase().add(observedSystemPhase);

			// system.grid.file.id
			// system.grid.file.id.type
			// system.grid.file.id.scheme
			// system.grid.file.link
			// system.grid.file.checksum
			// system.grid.file.checksum.type

			EngMeta.SpacialResolution grid = objFacEngMeta.createSpacialResolution();
			EngMeta.FileOrResource systemGridFile = objFacEngMeta.createFileOrResource();
			EngMeta.Pid systemGridFileId = objFacEngMeta.createPid();

			Boolean setSystemGridFile = false;
			Boolean setGrid = false;

			if (MD_systemGridFileId != null && MD_systemGridFileId.containsKey(i)) {
				systemGridFileId.setValue(MD_systemGridFileId.get(i));
				set = true;
				setSystemGridFile = true;
			}

			if (MD_systemGridFileIdType != null && MD_systemGridFileIdType.containsKey(i)) {
				systemGridFileId.setType(MD_systemGridFileIdType.get(i));
				set = true;
				setSystemGridFile = true;
			}

			if (MD_systemGridFileIdScheme != null && MD_systemGridFileIdScheme.containsKey(i)) {
				systemGridFileId.setScheme(MD_systemGridFileIdScheme.get(i));
				set = true;
				setSystemGridFile = true;
			}
			if (setSystemGridFile)
				systemGridFile.setId(systemGridFileId);

			if (MD_systemGridFileLink != null && MD_systemGridFileLink.containsKey(i)) {
				systemGridFile.getLink().add(MD_systemGridFileLink.get(i));
				set = true;
				setSystemGridFile = true;
			}

			if (MD_systemGridFileChecksum != null && MD_systemGridFileChecksum.containsKey(i)) {
				EngMeta.ChecksumType checksumSystemGridFile = objFacEngMeta.createChecksumType();

				checksumSystemGridFile.setValue(MD_systemGridFileChecksum.get(i));
				if (MD_systemGridFileChecksumType != null && MD_systemGridFileChecksumType.containsKey(i)) {
					checksumSystemGridFile.setAlgorithm(MD_systemGridFileChecksumType.get(i));
				}
				set = true;
				systemGridFile.getChecksum().add(checksumSystemGridFile);
				setSystemGridFile = true;
			}

			if (setSystemGridFile) {
				grid.getFile().add(systemGridFile);
				setGrid = true;
			}

			if (MD_systemGridCountCells != null && MD_systemGridCountCells.containsKey(i)) {
				try {

					BigInteger bigIntCountCells = new BigInteger(MD_systemGridCountCells.get(i).trim());
					grid.setCountCells(bigIntCountCells);
					setGrid = true;
				} catch (NumberFormatException e) {
					// System.out.println("Exception caught!");
					// e.printStackTrace(); TODO
					// temp.setNumberOfTimesteps(0);
				}
			}

			if (MD_systemGridCountBlocks != null && MD_systemGridCountBlocks.containsKey(i)) {
				try {

					BigInteger bigIntCountBlocks = new BigInteger(MD_systemGridCountBlocks.get(i).trim());
					grid.setCountBlocks(bigIntCountBlocks);
					setGrid = true;
				} catch (NumberFormatException e) {
					// System.out.println("Exception caught!");
					// e.printStackTrace(); TODO
					// temp.setNumberOfTimesteps(0);
				}
			}

			if (MD_systemGridTargetCores != null && MD_systemGridTargetCores.containsKey(i)) {
				try {

					BigInteger bigIntTargetCores = new BigInteger(MD_systemGridTargetCores.get(i).trim());
					grid.setTargetCores(bigIntTargetCores);
					setGrid = true;
				} catch (NumberFormatException e) {
					// System.out.println("Exception caught!");
					// e.printStackTrace(); TODO
					// temp.setNumberOfTimesteps(0);
				}
			}

			if (MD_systemGridCountX != null && MD_systemGridCountX.containsKey(i)) {
				try {

					BigInteger bigIntCountX = new BigInteger(MD_systemGridCountX.get(i).trim());
					grid.setCountX(bigIntCountX);
					setGrid = true;
				} catch (NumberFormatException e) {
					// System.out.println("Exception caught!");
					// e.printStackTrace(); TODO
					// temp.setNumberOfTimesteps(0);
				}
			}

			if (MD_systemGridCountY != null && MD_systemGridCountY.containsKey(i)) {
				try {

					BigInteger bigIntCountY = new BigInteger(MD_systemGridCountY.get(i).trim());
					grid.setCountY(bigIntCountY);
					setGrid = true;
				} catch (NumberFormatException e) {
					// System.out.println("Exception caught!");
					// e.printStackTrace(); TODO
					// temp.setNumberOfTimesteps(0);
				}
			}

			if (MD_systemGridCountZ != null && MD_systemGridCountZ.containsKey(i)) {
				try {

					BigInteger bigIntCountZ = new BigInteger(MD_systemGridCountZ.get(i).trim());
					grid.setCountZ(bigIntCountZ);
					setGrid = true;
				} catch (NumberFormatException e) {
					// System.out.println("Exception caught!");
					// e.printStackTrace(); TODO
					// temp.setNumberOfTimesteps(0);
				}
			}

			if (MD_systemGridUnit != null && MD_systemGridUnit.containsKey(i)) {
				grid.setUnit(MD_systemGridUnit.get(i));
				setGrid = true;
			}

			if (MD_systemGridScalingFormula != null && MD_systemGridScalingFormula.containsKey(i)) {
				grid.setScalingFormula(MD_systemGridScalingFormula.get(i));
				setGrid = true;
			}

			if (MD_systemGridDistance != null && MD_systemGridDistance.containsKey(i)) {
				try {

					BigDecimal bigDecDistance = new BigDecimal(MD_systemGridDistance.get(i).trim());
					grid.setDistance(bigDecDistance);
					setGrid = true;
				} catch (NumberFormatException e) {
					// System.out.println("Exception caught!");
					// e.printStackTrace(); TODO
					// temp.setNumberOfTimesteps(0);
				}
			}

			EngMeta.SpacialResolution.Point point = objFacEngMeta.createSpacialResolutionPoint();

			Boolean setPoint = false;

			if (MD_systemGridPointPositionX != null && MD_systemGridPointPositionX.containsKey(i)) {
				try {

					BigDecimal bigDecPositionX = new BigDecimal(MD_systemGridPointPositionX.get(i).trim());
					point.setPositionX(bigDecPositionX);
					setPoint = true;
				} catch (NumberFormatException e) {
					// System.out.println("Exception caught!");
					// e.printStackTrace(); TODO
					// temp.setNumberOfTimesteps(0);
				}
			}

			if (MD_systemGridPointPositionY != null && MD_systemGridPointPositionY.containsKey(i)) {
				try {

					BigDecimal bigDecPositionY = new BigDecimal(MD_systemGridPointPositionY.get(i).trim());
					point.setPositionY(bigDecPositionY);
					setPoint = true;
				} catch (NumberFormatException e) {
					// System.out.println("Exception caught!");
					// e.printStackTrace(); TODO
					// temp.setNumberOfTimesteps(0);
				}
			}

			if (MD_systemGridPointPositionZ != null && MD_systemGridPointPositionZ.containsKey(i)) {
				try {

					BigDecimal bigDecPositionZ = new BigDecimal(MD_systemGridPointPositionZ.get(i).trim());
					point.setPositionZ(bigDecPositionZ);
					setPoint = true;
				} catch (NumberFormatException e) {
					// System.out.println("Exception caught!");
					// e.printStackTrace(); TODO
					// temp.setNumberOfTimesteps(0);
				}
			}

			if (setPoint) {
				grid.getPoint().add(point);
				setGrid = true;
			}

			if (setGrid)
				observedSystem.setGrid(grid);

			EngMeta.TemporalResolution temporalResolution = objFacEngMeta.createTemporalResolution();

			Boolean setTemporalResolution = false;

			if (MD_systemTemporalResolutionNumberOfTimeSteps != null
					&& MD_systemTemporalResolutionNumberOfTimeSteps.containsKey(i)) {
				try {

					BigInteger bigIntNumberOfTimesteps = new BigInteger(
							MD_systemTemporalResolutionNumberOfTimeSteps.get(i).trim());
					temporalResolution.setNumberOfTimesteps(bigIntNumberOfTimesteps);
					setTemporalResolution = true;
				} catch (NumberFormatException e) {
					// System.out.println("Exception caught!");
					// e.printStackTrace(); TODO
					// temp.setNumberOfTimesteps(0);
				}
			}

			if (MD_systemTemporalResolutionInterval != null && MD_systemTemporalResolutionInterval.containsKey(i)) {
				try {

					BigDecimal bigDecInterval = new BigDecimal(MD_systemTemporalResolutionInterval.get(i).trim());
					temporalResolution.setInterval(bigDecInterval);
					setTemporalResolution = true;
				} catch (NumberFormatException e) {
					System.out.println("Exception caught!");
					e.printStackTrace();
					// temporalResolution.setInterval();
				}
			}

			if (MD_systemTemporalResolutionUnit != null && MD_systemTemporalResolutionUnit.containsKey(i)) {
				temporalResolution.setUnit(MD_systemTemporalResolutionUnit.get(i));
				setTemporalResolution = true;
			}

			if (MD_systemTemporalResolutionTimestep != null && MD_systemTemporalResolutionTimestep.containsKey(i)) {
				try {

					BigDecimal bigDecTimestep = new BigDecimal(MD_systemTemporalResolutionTimestep.get(i).trim());
					temporalResolution.getTimeStep().add(bigDecTimestep);
					setTemporalResolution = true;

				} catch (NumberFormatException e) {
					// System.out.println("Exception caught!");
					// e.printStackTrace(); TODO
					// temp.setNumberOfTimesteps(0);
				}
			}

			if (setTemporalResolution) {
				observedSystem.setTemporalResolution(temporalResolution);
				set = true;
			}

			// HashMap<Integer, String> MD_systemBoundaryConditionShape =
			// parsedMD.get("system.boundaryCondition.shape");
			// HashMap<Integer, String> MD_systemBoundaryConditionSize =
			// parsedMD.get("system.boundaryCondition.size");
			// HashMap<Integer, String> MD_systemBoundaryConditionPosition =
			// parsedMD.get("system.boundaryCondition.position");
			// HashMap<Integer, String> MD_systemBoundaryConditionComponentName =
			// parsedMD.get("system.boundaryCondition.component.name");
			// HashMap<Integer, String> MD_systemBoundaryConditionComponentSmilesCode=
			// parsedMD.get("system.boundaryCondition.component.smilesCode");
			// HashMap<Integer, String> MD_systemBoundaryConditionComponentIUPAC =
			// parsedMD.get("system.boundaryCondition.component.IUPAC");
			// HashMap<Integer, String> MD_systemBoundaryConditionComponentQuantity =
			// parsedMD.get("system.boundaryCondition.component.quantity");
			// HashMap<Integer, String> MD_systemBoundaryConditionComponentForceFieldName =
			// parsedMD.get("system.boundaryCondition.component.forcefield.name");
			// HashMap<Integer, String>
			// MD_systemBoundaryConditionComponentForceFieldParameterName =
			// parsedMD.get("system.boundaryCondition.component.forcefield.parameter.name");
			// HashMap<Integer, String>
			// MD_systemBoundaryConditionComponentForceFieldParameterSymbol =
			// parsedMD.get("system.boundaryCondition.component.forcefield.parameter.symbol");
			// HashMap<Integer, String>
			// MD_systemBoundaryConditionComponentForceFieldParameterValue = parsedMD.get("
			// system.boundaryCondition.component.forcefield.parameter.value");
			// HashMap<Integer, String>
			// MD_systemBoundaryConditionComponentForceFieldParameterEncoding =
			// parsedMD.get("
			// system.boundaryCondition.component.forcefield.parameter.encoding");
			// HashMap<Integer, String>
			// MD_systemBoundaryConditionComponentForceFieldParameterError = parsedMD.get("
			// system.boundaryCondition.component.forcefield.parameter.error");
			//
			// HashMap<Integer, String> MD_systemBoundaryConditionParameterName =
			// parsedMD.get("system.boundaryCondition.parameter.name");
			// HashMap<Integer, String> MD_systemBoundaryConditionParameterSymbol =
			// parsedMD.get("system.boundaryCondition.parameter.symbol");
			// HashMap<Integer, String> MD_systemBoundaryConditionParameterValue =
			// parsedMD.get(" system.boundaryCondition.parameter.value");
			// HashMap<Integer, String> MD_systemBoundaryConditionParameterEncoding =
			// parsedMD.get(" system.boundaryCondition.parameter.encoding");
			// HashMap<Integer, String> MD_systemBoundaryConditionParameterError =
			// parsedMD.get(" system.boundaryCondition.parameter.error");
			//

			EngMeta.BoundaryCondition boundaryCondition = objFacEngMeta.createBoundaryCondition();
			// Boundary condition consits of flow and parameter

			EngMeta.BoundaryCondition.Flow flow = objFacEngMeta.createBoundaryConditionFlow();

			Boolean setBoundaryCondition = false;

			Boolean setFlow = false;

			if (MD_systemBoundaryConditionShape != null && MD_systemBoundaryConditionShape.containsKey(i)) {
				flow.setShape(MD_systemBoundaryConditionShape.get(i));
				set = true;
				setFlow = true;
			}

			if (MD_systemBoundaryConditionSize != null && MD_systemBoundaryConditionSize.containsKey(i)) {
				try {

					Float boundaryConditionSize = new Float(MD_systemBoundaryConditionSize.get(i).trim());
					flow.setSize(boundaryConditionSize);

				} catch (NumberFormatException e) {
					// System.out.println("Exception caught!");
					// e.printStackTrace(); TODO
					// temp.setNumberOfTimesteps(0);
				}
				set = true;
				setFlow = true;
			}

			if (MD_systemBoundaryConditionPosition != null && MD_systemBoundaryConditionPosition.containsKey(i)) {
				flow.setPosition(MD_systemBoundaryConditionPosition.get(i));
				set = true;
				setFlow = true;
			}

			/////////////////////
			// TODO: Implement Component + ForceField for the Boundary Condition here
			//////////////////////

			if (setFlow)
				boundaryCondition.getFlow().add(flow);

			EngMeta.Variable parameter = objFacEngMeta.createVariable();

			Boolean setBoundaryConditionParameter = false;

			if (MD_systemBoundaryConditionParameterName != null
					&& MD_systemBoundaryConditionParameterName.containsKey(i)) {
				parameter.setName(MD_systemBoundaryConditionParameterName.get(i));
				setBoundaryConditionParameter = true;
			}

			if (MD_systemBoundaryConditionParameterSymbol != null
					&& MD_systemBoundaryConditionParameterSymbol.containsKey(i)) {
				parameter.setSymbol(MD_systemBoundaryConditionParameterSymbol.get(i));
				setBoundaryConditionParameter = true;
			}

			if (MD_systemBoundaryConditionParameterValue != null
					&& MD_systemBoundaryConditionParameterValue.containsKey(i)) {
				parameter.setValue(MD_systemBoundaryConditionParameterValue.get(i));
				setBoundaryConditionParameter = true;
			}

			if (MD_systemBoundaryConditionParameterEncoding != null
					&& MD_systemBoundaryConditionParameterEncoding.containsKey(i)) {
				parameter.setEncoding(MD_systemBoundaryConditionParameterEncoding.get(i));
				setBoundaryConditionParameter = true;
			}

			if (MD_systemBoundaryConditionParameterError != null
					&& MD_systemBoundaryConditionParameterError.containsKey(i)) {

				try {

					BigDecimal bigDecVarError = new BigDecimal(MD_systemBoundaryConditionParameterError.get(i).trim());
					parameter.setError(bigDecVarError);
				} catch (NumberFormatException e) {
					// System.out.println("Exception caught!");
					// e.printStackTrace();
					BigDecimal bigDecVarError = new BigDecimal("0");
					parameter.setError(bigDecVarError);
				}

				setBoundaryConditionParameter = true;
			}

			if (setBoundaryConditionParameter) {
				boundaryCondition.getParameter().add(parameter);
				setBoundaryCondition = true;
			}

			if (setBoundaryCondition) {
				observedSystem.setBoundaryCondition(boundaryCondition);
				set = true;
			}

			if (set)
				md.getSystem().add(observedSystem);

		} // End of loop for system (observed system) block

		// Now set all the provenance information
		md.setProvenance(prov);

		// Now the PREMIS-Stuff

		/*
		 * storage.contentLocation.value storage.contentLocation.link
		 * storage.storageMedium storage.storageMedium.URI
		 */

		HashMap<Integer, String> MD_storageContentLoctionValue = parsedMD.get("storage.contentLocation.value");
		HashMap<Integer, String> MD_storageContentLoctionLink = parsedMD.get("storage.contentLocation.link");
		HashMap<Integer, String> MD_storageStorageMedium = parsedMD.get("storage.storageMedium");
		HashMap<Integer, String> MD_storageStorageURI = parsedMD.get("storage.storageMedium.URI");

		premis.StorageComplexType storage = objFacPremis.createStorageComplexType();

		for (int i = 0; i < ExtractIng.NUMBER_OF_MD; i++) {
			Boolean set = false;

			premis.StringPlusAuthority stringPlus = objFacPremis.createStringPlusAuthority();

			premis.ContentLocationComplexType contentLocation = objFacPremis.createContentLocationComplexType();

			if (MD_storageContentLoctionValue != null && MD_storageContentLoctionValue.containsKey(i)) {
				contentLocation.setContentLocationValue(MD_storageContentLoctionValue.get(i));
				set = true;
			}

			if (MD_storageContentLoctionLink != null && MD_storageContentLoctionLink.containsKey(i)) {
				contentLocation.setSimpleLink(MD_storageContentLoctionLink.get(i));
				set = true;
			}

			if (MD_storageStorageMedium != null && MD_storageStorageMedium.containsKey(i)) {
				stringPlus.setValue(MD_storageStorageMedium.get(i));
				set = true;
			}

			if (MD_storageStorageURI != null && MD_storageStorageURI.containsKey(i)) {
				stringPlus.setValueURI(MD_storageStorageURI.get(i));
				set = true;
			}

			JAXBElement<StringPlusAuthority> storageMedium = objFacPremis.createStorageMedium(stringPlus);

			JAXBElement<ContentLocationComplexType> JAXBcontentLocation = objFacPremis
					.createContentLocation(contentLocation);

			if (set) {
				storage.getContent().add(storageMedium);
				storage.getContent().add(JAXBcontentLocation);
				md.setStorage(storage);
			}

		} // End of storage loop

		/*
		 * format.formatDesignation.formatName format.formatDesignation.formatVersion
		 * format.formatRegistry.name format.formatRegistry.key
		 * format.formatRegistry.role
		 * 
		 */

		HashMap<Integer, String> MD_formatDesignationFormatName = parsedMD.get("formatDesignation.formatName");
		HashMap<Integer, String> MD_formatDesignationFormatVersion = parsedMD.get("formatDesignation.formatVersion");
		HashMap<Integer, String> MD_formatRegistryName = parsedMD.get("format.formatRegistry.name");
		HashMap<Integer, String> MD_formatRegistryKey = parsedMD.get("format.formatRegistry.key");
		HashMap<Integer, String> MD_formatRegistryRole = parsedMD.get("format.formatRegistry.role");

		premis.FormatComplexType format = objFacPremis.createFormatComplexType();

		for (int i = 0; i < ExtractIng.NUMBER_OF_MD; i++) {

			Boolean set = false;

			premis.FormatDesignationComplexType formatDesignation = objFacPremis.createFormatDesignationComplexType();
			premis.FormatRegistryComplexType formatRegistry = objFacPremis.createFormatRegistryComplexType();

			premis.StringPlusAuthority formatName = objFacPremis.createStringPlusAuthority();

			if (MD_formatDesignationFormatName != null && MD_formatDesignationFormatName.containsKey(i)) {
				formatName.setValue(MD_formatDesignationFormatName.get(i));
				formatDesignation.setFormatName(formatName);
				set = true;
			}

			if (MD_formatDesignationFormatVersion != null && MD_formatDesignationFormatVersion.containsKey(i)) {
				formatDesignation.setFormatVersion(MD_formatDesignationFormatVersion.get(i));
				set = true;
			}

			JAXBElement<FormatDesignationComplexType> JAXBformatDesignation = objFacPremis
					.createFormatDesignation(formatDesignation);

			if (MD_formatRegistryName != null && MD_formatRegistryName.containsKey(i)) {
				premis.StringPlusAuthority formatRegistryName = objFacPremis.createStringPlusAuthority();
				formatRegistryName.setValue(MD_formatRegistryName.get(i));
				formatRegistry.setFormatRegistryName(formatRegistryName);
				set = true;
			}

			if (MD_formatRegistryKey != null && MD_formatRegistryKey.containsKey(i)) {
				premis.StringPlusAuthority formatRegistryKey = objFacPremis.createStringPlusAuthority();
				formatRegistryKey.setValue(MD_formatRegistryKey.get(i));
				formatRegistry.setFormatRegistryKey(formatRegistryKey);
				set = true;
			}

			if (MD_formatRegistryRole != null && MD_formatRegistryRole.containsKey(i)) {
				premis.StringPlusAuthority formatRegistryRole = objFacPremis.createStringPlusAuthority();
				formatRegistryRole.setValue(MD_formatRegistryRole.get(i));
				formatRegistry.setFormatRegistryRole(formatRegistryRole);
			}

			JAXBElement<FormatRegistryComplexType> JAXBformatRegistry = objFacPremis
					.createFormatRegistry(formatRegistry);

			if (set)

			{
				format.getContent().add(JAXBformatDesignation);
				format.getContent().add(JAXBformatRegistry);
				md.setFormat(format);
			}
		} // End format loop

		/*
		 * pid pid.type pid.scheme
		 */

		HashMap<Integer, String> MD_pid = parsedMD.get("pid");
		HashMap<Integer, String> MD_pidType = parsedMD.get("pid.type");
		HashMap<Integer, String> MD_pidScheme = parsedMD.get("pid.scheme");

		EngMeta.Pid pid = objFacEngMeta.createPid();

		for (int i = 0; i < ExtractIng.NUMBER_OF_MD; i++) {

			Boolean set = false;

			if (MD_pid != null && MD_pid.containsKey(i)) {
				pid.setValue(MD_pid.get(i));
				set = true;
			}

			if (MD_pidType != null && MD_pidType.containsKey(i)) {
				pid.setType(MD_pidType.get(i));
				set = true;
			}

			if (MD_pidScheme != null && MD_pidScheme.containsKey(i)) {
				pid.setScheme(MD_pidScheme.get(i));
				set = true;
			}

			if (set)
				md.getIdentifier().add(pid);
		} // End pid loop

		/*
		 * rightsStatement.copyrightInformation.note
		 * rightsStatement.copyrightInformation.status
		 * rightsStatement.copyrightInformation.countryCode
		 */

		HashMap<Integer, String> MD_copyrightInformationNote = parsedMD
				.get("rightsStatement.copyrightInformation.note");
		HashMap<Integer, String> MD_copyrightInformationStatus = parsedMD
				.get("rightsStatement.copyrightInformation.status");
		HashMap<Integer, String> MD_copyrightInformationCountryCode = parsedMD
				.get("rightsStatement.copyrightInformation.countryCode");

		premis.RightsStatementComplexType rightsStatement = objFacPremis.createRightsStatementComplexType();

		for (int i = 0; i < ExtractIng.NUMBER_OF_MD; i++) {

			Boolean set = false;

			premis.CopyrightInformationComplexType copyrightInformation = objFacPremis
					.createCopyrightInformationComplexType();

			if (MD_copyrightInformationNote != null && MD_copyrightInformationNote.containsKey(i)) {
				copyrightInformation.getCopyrightNote().add(MD_copyrightInformationNote.get(i));
				set = true;
			}

			if (MD_copyrightInformationCountryCode != null && MD_copyrightInformationCountryCode.containsKey(i)) {
				premis.CountryCode countryCode = objFacPremis.createCountryCode();

				countryCode.setValue(MD_copyrightInformationCountryCode.get(i));

				copyrightInformation.setCopyrightJurisdiction(countryCode);
				set = true;
			}

			if (MD_copyrightInformationStatus != null && MD_copyrightInformationStatus.containsKey(i)) {
				premis.StringPlusAuthority copyrightStatus = objFacPremis.createStringPlusAuthority();
				copyrightStatus.setValue(MD_copyrightInformationStatus.get(i));
				copyrightInformation.setCopyrightStatus(copyrightStatus);
				set = true;
			}

			if (set) {
				rightsStatement.setCopyrightInformation(copyrightInformation);
				md.getRightsStatement().add(rightsStatement);
			}
		} // End rightsstatement loop

		/*
		 * // context.referencePublication.id context.referencePublication.id.type
		 * context.referencePublication.id.scheme context.referencePublication.citation
		 * context.referencePublication.url context.relatedResource.id
		 * context.relatedResource.id.type context.relatedResource.id.scheme
		 * context.relatedResource.link context.relatedResource.checksum
		 * context.relatedResource.checksum.scheme context.relatedIdentifier
		 * context.relatedIdentifier.type context.relatedIdentifier.scheme
		 */

		HashMap<Integer, String> MD_contextReferencePublicationId = parsedMD.get("context.referencePublication.id");
		HashMap<Integer, String> MD_contextReferencePublicationIdType = parsedMD
				.get("context.referencePublication.id.type");
		HashMap<Integer, String> MD_contextReferencePublicationIdScheme = parsedMD
				.get("context.referencePublication.scheme");

		HashMap<Integer, String> MD_contextReferencePublicationCitation = parsedMD
				.get("context.referencePublication.citation");
		HashMap<Integer, String> MD_contextReferencePublicationUrl = parsedMD.get("context.referencePublication.url");

		HashMap<Integer, String> MD_contextRelatedResourceId = parsedMD.get("context.relatedResource.id");
		HashMap<Integer, String> MD_contextRelatedResourceIdType = parsedMD.get("context.relatedResource.id.type");
		HashMap<Integer, String> MD_contextRelatedResourceIdScheme = parsedMD.get("context.relatedResource.scheme");

		HashMap<Integer, String> MD_contextRelatedResourceLink = parsedMD.get("context.relatedResource.link");
		HashMap<Integer, String> MD_contextRelatedResourceChecksum = parsedMD.get("context.relatedResource.checksum");
		HashMap<Integer, String> MD_contextRelatedResourceChecksumScheme = parsedMD
				.get("context.relatedResource.checksum.scheme");

		HashMap<Integer, String> MD_contextRelatedIdentifier = parsedMD.get("context.relatedIdentifier");
		HashMap<Integer, String> MD_contextRelatedIdentifierType = parsedMD.get("context.relatedIdentifier.type");
		HashMap<Integer, String> MD_contextRelatedIdentifierScheme = parsedMD.get("context.relatedIdentifier.scheme");

		EngMeta.Dataset.Context context = objFacEngMeta.createDatasetContext();

		for (int i = 0; i < ExtractIng.NUMBER_OF_MD; i++) {

			Boolean set = false;

			EngMeta.Publication referencePublication = objFacEngMeta.createPublication();

			EngMeta.Pid referencePublicationId = objFacEngMeta.createPid();

			if (MD_contextReferencePublicationId != null && MD_contextReferencePublicationId.containsKey(i)) {
				referencePublicationId.setValue(MD_contextReferencePublicationId.get(i));
				set = true;

			}
			if (MD_contextReferencePublicationIdType != null && MD_contextReferencePublicationIdType.containsKey(i)) {
				referencePublicationId.setType(MD_contextReferencePublicationIdType.get(i));
				set = true;

			}

			if (MD_contextReferencePublicationIdScheme != null
					&& MD_contextReferencePublicationIdScheme.containsKey(i)) {
				referencePublicationId.setScheme(MD_contextReferencePublicationIdType.get(i));
				set = true;

			}

			if (MD_contextReferencePublicationCitation != null
					&& MD_contextReferencePublicationCitation.containsKey(i)) {
				referencePublication.setCitation(MD_contextReferencePublicationCitation.get(i));
				set = true;
			}

			if (MD_contextReferencePublicationUrl != null && MD_contextReferencePublicationUrl.containsKey(i)) {
				referencePublication.setUrl(MD_contextReferencePublicationUrl.get(i));
				set = true;
			}

			EngMeta.FileOrResource relatedResource = objFacEngMeta.createFileOrResource();

			EngMeta.Pid relatedresourceId = objFacEngMeta.createPid();

			if (MD_contextRelatedResourceId != null && MD_contextRelatedResourceId.containsKey(i)) {
				relatedresourceId.setValue(MD_contextRelatedResourceId.get(i));
				set = true;
			}

			if (MD_contextRelatedResourceIdType != null && MD_contextRelatedResourceIdType.containsKey(i)) {
				relatedresourceId.setType(MD_contextRelatedResourceId.get(i));
				set = true;
			}

			if (MD_contextRelatedResourceIdScheme != null && MD_contextRelatedResourceIdScheme.containsKey(i)) {
				relatedresourceId.setScheme(MD_contextRelatedResourceIdScheme.get(i));
				set = true;
			}

			if (MD_contextRelatedResourceLink != null && MD_contextRelatedResourceLink.containsKey(i)) {
				relatedResource.getLink().add(MD_contextRelatedResourceLink.get(i));
				set = true;
			}

			EngMeta.ChecksumType relatedResourceChecksum = new EngMeta.ChecksumType();

			if (MD_contextRelatedResourceChecksumScheme != null
					&& MD_contextRelatedResourceChecksumScheme.containsKey(i)) {
				relatedResourceChecksum.setAlgorithm(MD_contextRelatedResourceChecksumScheme.get(i));
				set = true;
			}

			if (MD_contextRelatedResourceChecksum != null && MD_contextRelatedResourceChecksum.containsKey(i)) {
				relatedResourceChecksum.setValue(MD_contextRelatedResourceChecksum.get(i));
				set = true;
			}

			EngMeta.Pid relatedIdentifier = objFacEngMeta.createPid();

			if (MD_contextRelatedIdentifier != null && MD_contextRelatedIdentifier.containsKey(i)) {
				relatedIdentifier.setValue(MD_contextRelatedIdentifier.get(i));
				set = true;
			}

			if (MD_contextRelatedIdentifierType != null && MD_contextRelatedIdentifierType.containsKey(i)) {
				relatedIdentifier.setType(MD_contextRelatedIdentifierType.get(i));
				set = true;
			}

			if (MD_contextRelatedIdentifierScheme != null && MD_contextRelatedIdentifierScheme.containsKey(i)) {
				relatedIdentifier.setScheme(MD_contextRelatedIdentifierScheme.get(i));
				set = true;
			}

			if (set) {
				relatedResource.getChecksum().add(relatedResourceChecksum);
				context.getReferencePublicationOrRelatedResourceOrRelatedIdentifier().add(relatedIdentifier);
				referencePublication.setId(referencePublicationId);
				relatedResource.setId(relatedresourceId);
				context.getReferencePublicationOrRelatedResourceOrRelatedIdentifier().add(relatedResource);
				context.getReferencePublicationOrRelatedResourceOrRelatedIdentifier().add(referencePublication);
				md.setContext(context);
			}

		} // End context loop

		System.out.println("============================================");
		System.out.println("The complete XML object by JAXB:");
		JAXB.marshal(md, System.out);

		// Also write it out to a file
		File file = new File(directoryToParse + "/.metadata/engMeta.xml");
		file.getParentFile().mkdirs();
		JAXB.marshal(md, file);

	}

}
