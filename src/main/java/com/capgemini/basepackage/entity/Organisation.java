package com.capgemini.basepackage.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Organisation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orgID;

	private String orgName;
	private String orgHeadquarters;
	private long orgRevenue;
	private long orgEmployees;
	private boolean orgVideokyc;
	private boolean creditCard;

	public Organisation(int orgID, String orgName, String orgHeadquarters, long orgRevenue, long orgEmployees,
			boolean orgVideokyc, boolean creditCard) {
		super();
		this.orgID = orgID;
		this.orgName = orgName;
		this.orgHeadquarters = orgHeadquarters;
		this.orgRevenue = orgRevenue;
		this.orgEmployees = orgEmployees;
		this.orgVideokyc = orgVideokyc;
		this.creditCard = creditCard;
	}

	public boolean isOrgVideokyc() {
		return orgVideokyc;
	}

	public void setOrgVideokyc(boolean orgVideokyc) {
		this.orgVideokyc = orgVideokyc;
	}

	public boolean isCreditCard() {
		return creditCard;
	}

	public void setCreditCard(boolean creditCard) {
		this.creditCard = creditCard;
	}

	public long getOrgRevenue() {
		return orgRevenue;
	}

	public void setOrgRevenue(long orgRevenue) {
		this.orgRevenue = orgRevenue;
	}

	public long getOrgEmployees() {
		return orgEmployees;
	}

	public void setOrgEmployees(long orgEmployees) {
		this.orgEmployees = orgEmployees;
	}

	// private String orgRevenue;
	public int getOrgID() {
		return orgID;
	}

	public void setOrgID(int orgID) {
		this.orgID = orgID;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getOrgHeadquarters() {
		return orgHeadquarters;
	}

	public void setOrgHeadquarters(String orgHeadquarters) {
		this.orgHeadquarters = orgHeadquarters;
	}

	public Organisation() {
	}

}
