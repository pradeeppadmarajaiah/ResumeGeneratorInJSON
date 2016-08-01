package com.bit_i_know.json.util;

import java.io.File;
import java.math.BigInteger;

import com.bit_i_know.json.model.Candidate;
import com.bit_i_know.json.model.CanditateExperience;
import com.bit_i_know.json.model.Company;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Generating JSON file for Candidate POJO.
 * 
 * @author pradeep
 *
 */
public class JsonGenerator {

	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			Candidate candidate = pradeepResumeGenerator();

			// Showing output in the console.
			String print = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(candidate);
			System.out.println(print);

			// Saving output to the JSON file.
			mapper.writerWithDefaultPrettyPrinter().writeValue(new File("C:\\Pradeep.json"), candidate);
			System.out.println("File created sucessfully.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * @return
	 */
	private static Candidate pradeepResumeGenerator() {
		Candidate candidate = new Candidate();

		BigInteger phoneNumber = new BigInteger("8197922363");
		candidate.setName("Pradeep P");
		candidate.setEmailId("pradeep_p_13@hotmail.com");
		candidate.setPhoneNumber(phoneNumber);
		candidate.setWorkLocation("Bangalore");

		CanditateExperience experience = new CanditateExperience();
		experience.setTotalExperince("6 years");

		Company company1 = new Company("IBM ISL", "4 years", "https://www.ibm.com/in-en/");
		Company company2 = new Company("Span Systems", "2 years 1 month", "http://www.spansystems.com/");
		experience.getCompanies().add(company1);
		experience.getCompanies().add(company2);

		candidate.setExperience(experience);
		String[] roles = { "Architect", "Developer", "FreeLancer", "Senior Consultant", "Research & Development",
				"Product development", "DevOps", "Trainer", "CAAS Customization", "CAAS Lead", "B2B Support",
				"CAAS Support", "Tester", "Analyst", "Subject Matter Expert", "Automation" };
		candidate.setRole(roles);

		String[] product = { "COC (Commerce On Cloud) ", "IBM WebSphereCommerce", "IBM OMS", "IBM CoreMetrics",
				"Tibco Business Works", "Collibra" };
		candidate.setProduct(product);

		String[] platform = { "SAAS (Software As A Service) ", "PAAS (Platform As A Service)",
				"CAAS (Commerce As A Service)", "BAAS(BlockChain As A Service)(EXPLORING)" };
		candidate.setPlatform(platform);

		String[] domain = { "E-Commerce", "Retail", "EDI(Exploring)", "Telecom", "Education" };
		candidate.setDomain(domain);

		String[] technology = { "Java", "IBM 10XIBM BlueMix", "IBM Watson API", "WebService", "JavaScript", "Junit",
				"Linux", "SQL", "MongoDB", "DB2", "Apache POI", "Apache Tomcat", "GIT", "Log4j", "HTML" };
		candidate.setTechnology(technology);

		String[] interested = { "Research & Development", "Block Chain", "Product development", "DevOps",
				"FLEXIBLE TO WORK ON ANY PLATFORM" };
		candidate.setInterested(interested);
		return candidate;
	}

}
