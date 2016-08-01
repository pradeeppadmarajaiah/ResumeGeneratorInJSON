package com.bit_i_know.json.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * @author pradeep
 *
 */
public class Company {
	@JsonProperty("COMPANY")
	private String companyName;
	@JsonProperty("EXPERIENCE")
	private String experience;
	@JsonProperty("WEBSITE")
	private String website;

	public Company() {
		// TODO Auto-generated constructor stub
	}

	public Company(String companyName, String experience, String website) {
		this.companyName = companyName;
		this.experience = experience;
		this.website = website;
	}

	/**
	 * @return the companyName
	 */
	public final String getCompanyName() {
		return companyName;
	}

	/**
	 * @param companyName
	 *            the companyName to set
	 */
	public final void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	/**
	 * @return the experience
	 */
	public final String getExperience() {
		return experience;
	}

	/**
	 * @param experience
	 *            the experience to set
	 */
	public final void setExperience(String experience) {
		this.experience = experience;
	}

	/**
	 * @return the website
	 */
	public final String getWebsite() {
		return website;
	}

	/**
	 * @param website
	 *            the website to set
	 */
	public final void setWebsite(String website) {
		this.website = website;
	}

}
