/**
 * 
 */
package com.bit_i_know.json.model;

import java.math.BigInteger;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author pradeep
 *
 */
public class Candidate {
	@JsonProperty("NAME")
	private String name;
	@JsonProperty("EMAIL")
	private String emailId;
	@JsonProperty("MOBILE")
	private BigInteger phoneNumber;
	@JsonProperty("WORK LOCATION")
	private String workLocation;
	@JsonProperty("EXPERIENCE")
	private CanditateExperience experience;
	@JsonProperty("ROLE")
	private String[] role;
	@JsonProperty("PRODUCT")
	private String[] product;
	@JsonProperty("PLATFORM")
	private String[] platform;
	@JsonProperty("DOMAIN")
	private String[] domain;
	@JsonProperty("TECHNOLOGY")
	private String[] technology;
	@JsonProperty("INTERESTED")
	private String[] interested;

	/**
	 * @return the name
	 */
	public final String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public final void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the emailId
	 */
	public final String getEmailId() {
		return emailId;
	}

	/**
	 * @param emailId
	 *            the emailId to set
	 */
	public final void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	/**
	 * @return the phoneNumber
	 */
	public final BigInteger getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber
	 *            the phoneNumber to set
	 */
	public final void setPhoneNumber(BigInteger phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the workLocation
	 */
	public final String getWorkLocation() {
		return workLocation;
	}

	/**
	 * @param workLocation
	 *            the workLocation to set
	 */
	public final void setWorkLocation(String workLocation) {
		this.workLocation = workLocation;
	}

	/**
	 * @return the experience
	 */
	public final CanditateExperience getExperience() {
		return experience;
	}

	/**
	 * @param experience
	 *            the experience to set
	 */
	public final void setExperience(CanditateExperience experience) {
		this.experience = experience;
	}

	/**
	 * @return the role
	 */
	public final String[] getRole() {
		return role;
	}

	/**
	 * @param role
	 *            the role to set
	 */
	public final void setRole(String[] role) {
		this.role = role;
	}

	/**
	 * @return the product
	 */
	public final String[] getProduct() {
		return product;
	}

	/**
	 * @param product
	 *            the product to set
	 */
	public final void setProduct(String[] product) {
		this.product = product;
	}

	/**
	 * @return the platform
	 */
	public final String[] getPlatform() {
		return platform;
	}

	/**
	 * @param platform
	 *            the platform to set
	 */
	public final void setPlatform(String[] platform) {
		this.platform = platform;
	}

	/**
	 * @return the domain
	 */
	public final String[] getDomain() {
		return domain;
	}

	/**
	 * @param domain
	 *            the domain to set
	 */
	public final void setDomain(String[] domain) {
		this.domain = domain;
	}

	/**
	 * @return the technology
	 */
	public final String[] getTechnology() {
		return technology;
	}

	/**
	 * @param technology
	 *            the technology to set
	 */
	public final void setTechnology(String[] technology) {
		this.technology = technology;
	}

	/**
	 * @return the interested
	 */
	public final String[] getInterested() {
		return interested;
	}

	/**
	 * @param interested
	 *            the interested to set
	 */
	public final void setInterested(String[] interested) {
		this.interested = interested;
	}

}
