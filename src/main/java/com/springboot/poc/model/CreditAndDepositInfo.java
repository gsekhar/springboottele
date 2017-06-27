package com.springboot.poc.model;

import java.util.Set;

import com.springboot.poc.res.ExternalCreditCheckInfo;

public class CreditAndDepositInfo {
	
	
	private String siteid;

	private Set<ServiceDeposit> servicedeposits;

	private int servicedepositmaxamount;

	private Set<EquipmentDeposits> equimentdeposit;

	private String creditchecktype;

	private String creditclass;

	private String customerstatus;
	
	private String sitecode;
	
	private String accountnumber9;
	
	private boolean servicedepositspreadrequired;
	
	private boolean duenow;
	
	private Set<ExternalCreditCheckInfo> externalcreditcheckinfo;
	

	public String getSiteid() {
		return siteid;
	}

	public void setSiteid(String siteid) {
		this.siteid = siteid;
	}


	/**
	 * @return the servicedeposits
	 */
	public Set<ServiceDeposit> getServicedeposits() {
		return servicedeposits;
	}

	/**
	 * @param servicedeposits the servicedeposits to set
	 */
	public void setServicedeposits(Set<ServiceDeposit> servicedeposits) {
		this.servicedeposits = servicedeposits;
	}

	public int getServicedepositmaxamount() {
		return servicedepositmaxamount;
	}

	public void setServicedepositmaxamount(int servicedepositmaxamount) {
		this.servicedepositmaxamount = servicedepositmaxamount;
	}

	

	/**
	 * @return the equimentdeposit
	 */
	public Set<EquipmentDeposits> getEquimentdeposit() {
		return equimentdeposit;
	}

	/**
	 * @param equimentdeposit the equimentdeposit to set
	 */
	public void setEquimentdeposit(Set<EquipmentDeposits> equimentdeposit) {
		this.equimentdeposit = equimentdeposit;
	}

	public String getCreditchecktype() {
		return creditchecktype;
	}

	public void setCreditchecktype(String creditchecktype) {
		this.creditchecktype = creditchecktype;
	}

	public String getCreditclass() {
		return creditclass;
	}

	public void setCreditclass(String creditclass) {
		this.creditclass = creditclass;
	}

	public String getCustomerstatus() {
		return customerstatus;
	}

	public void setCustomerstatus(String customerstatus) {
		this.customerstatus = customerstatus;
	}

	public Set<ExternalCreditCheckInfo> getExternalcreditcheckinfo() {
		return externalcreditcheckinfo;
	}

	public void setExternalcreditcheckinfo(Set<ExternalCreditCheckInfo> externalcreditcheckinfo) {
		this.externalcreditcheckinfo = externalcreditcheckinfo;
	}

	/**
	 * @return the sitecode
	 */
	public String getSitecode() {
		return sitecode;
	}

	/**
	 * @param sitecode the sitecode to set
	 */
	public void setSitecode(String sitecode) {
		this.sitecode = sitecode;
	}

	/**
	 * @return the accountnumber9
	 */
	public String getAccountnumber9() {
		return accountnumber9;
	}

	/**
	 * @param accountnumber9 the accountnumber9 to set
	 */
	public void setAccountnumber9(String accountnumber9) {
		this.accountnumber9 = accountnumber9;
	}

	/**
	 * @return the servicedepositspreadrequired
	 */
	public boolean isServicedepositspreadrequired() {
		return servicedepositspreadrequired;
	}

	/**
	 * @param servicedepositspreadrequired the servicedepositspreadrequired to set
	 */
	public void setServicedepositspreadrequired(boolean servicedepositspreadrequired) {
		this.servicedepositspreadrequired = servicedepositspreadrequired;
	}

	/**
	 * @return the duenow
	 */
	public boolean isDuenow() {
		return duenow;
	}

	/**
	 * @param duenow the duenow to set
	 */
	public void setDuenow(boolean duenow) {
		this.duenow = duenow;
	}

}
