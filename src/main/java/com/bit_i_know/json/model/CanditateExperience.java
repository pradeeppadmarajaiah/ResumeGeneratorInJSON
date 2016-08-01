package com.bit_i_know.json.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * @author pradeep
 *
 */
public class CanditateExperience {
	@JsonProperty("TOTAL YEARS")
	private String totalExperince;

	private List<Company> companies = new ArrayList<Company>();

	/**
	 * @return the totalExperince
	 */
	public final String getTotalExperince() {
		return totalExperince;
	}

	/**
	 * @param totalExperince
	 *            the totalExperince to set
	 */
	public final void setTotalExperince(String totalExperince) {
		this.totalExperince = totalExperince;
	}

	/**
	 * @return the companies
	 */
	@JsonProperty("COMPANIES")
	public final List<Company> getCompanies() {
		return companies;
	}

	/**
	 * @param companies
	 *            the companies to set
	 */
	public final void setCompanies(List<Company> companies) {
		this.companies = companies;
	}

}
