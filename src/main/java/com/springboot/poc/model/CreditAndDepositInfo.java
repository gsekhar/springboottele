package com.springboot.poc.model;

import java.util.Set;

import com.springboot.poc.res.ExternalCreditCheckInfo;

public class CreditAndDepositInfo {
	
	
	private String siteid;

	private Set<ServiceDeposit> servicedep;

	private int servicedepositmaxamount;

	private Set<EquipmentDeposits> equimentlist;

	private String creditchecktype;

	private String creditclass;

	private String customerstatus;
	

	private Set<ExternalCreditCheckInfo> externalcreditcheckinfo;

	public String getSiteid() {
		return siteid;
	}

	public void setSiteid(String siteid) {
		this.siteid = siteid;
	}

	public Set<ServiceDeposit> getServicedep() {
		return servicedep;
	}

	public void setServicedep(Set<ServiceDeposit> servicedep) {
		this.servicedep = servicedep;
	}

	public int getServicedepositmaxamount() {
		return servicedepositmaxamount;
	}

	public void setServicedepositmaxamount(int servicedepositmaxamount) {
		this.servicedepositmaxamount = servicedepositmaxamount;
	}

	public Set<EquipmentDeposits> getEquimentlist() {
		return equimentlist;
	}

	public void setEquimentlist(Set<EquipmentDeposits> equimentlist) {
		this.equimentlist = equimentlist;
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

}
