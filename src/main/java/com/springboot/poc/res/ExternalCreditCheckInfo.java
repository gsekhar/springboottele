package com.springboot.poc.res;

import java.util.Date;
import java.util.Set;

public class ExternalCreditCheckInfo {
	
	private Date creditinquirydatetime;
	
	private String creditinquirystatus;
	
	private String matchindicator;
	
	private String matchindicatorDesc;
	
	private int hitflag;
	
	private String hitflagdesc;
	
	private String safescancode;
	
	private String safescandesc;
	
	private String addressdiscrepancyindicator;
	
	private String fraudvictimactivedutyindicator;
	
	private String fraudvictimactivedutydesc;
	
	private String rejectedmessagecode;
	
	private Set<ReasonCodes> reasoncodes;
	

	public Date getCreditinquirydatetime() {
		return creditinquirydatetime;
	}

	public void setCreditinquirydatetime(Date creditinquirydatetime) {
		this.creditinquirydatetime = creditinquirydatetime;
	}

	public String getCreditinquirystatus() {
		return creditinquirystatus;
	}

	public void setCreditinquirystatus(String creditinquirystatus) {
		this.creditinquirystatus = creditinquirystatus;
	}

	public String getMatchindicator() {
		return matchindicator;
	}

	public void setMatchindicator(String matchindicator) {
		this.matchindicator = matchindicator;
	}

	public String getMatchindicatorDesc() {
		return matchindicatorDesc;
	}

	public void setMatchindicatorDesc(String matchindicatorDesc) {
		this.matchindicatorDesc = matchindicatorDesc;
	}

	public int getHitflag() {
		return hitflag;
	}

	public void setHitflag(int hitflag) {
		this.hitflag = hitflag;
	}

	public String getHitflagdesc() {
		return hitflagdesc;
	}

	public void setHitflagdesc(String hitflagdesc) {
		this.hitflagdesc = hitflagdesc;
	}

	public String getSafescancode() {
		return safescancode;
	}

	public void setSafescancode(String safescancode) {
		this.safescancode = safescancode;
	}

	public String getSafescandesc() {
		return safescandesc;
	}

	public void setSafescandesc(String safescandesc) {
		this.safescandesc = safescandesc;
	}

	public String getAddressdiscrepancyindicator() {
		return addressdiscrepancyindicator;
	}

	public void setAddressdiscrepancyindicator(String addressdiscrepancyindicator) {
		this.addressdiscrepancyindicator = addressdiscrepancyindicator;
	}

	public String getFraudvictimactivedutyindicator() {
		return fraudvictimactivedutyindicator;
	}

	public void setFraudvictimactivedutyindicator(String fraudvictimactivedutyindicator) {
		this.fraudvictimactivedutyindicator = fraudvictimactivedutyindicator;
	}

	public String getFraudvictimactivedutydesc() {
		return fraudvictimactivedutydesc;
	}

	public void setFraudvictimactivedutydesc(String fraudvictimactivedutydesc) {
		this.fraudvictimactivedutydesc = fraudvictimactivedutydesc;
	}

	public String getRejectedmessagecode() {
		return rejectedmessagecode;
	}

	public void setRejectedmessagecode(String rejectedmessagecode) {
		this.rejectedmessagecode = rejectedmessagecode;
	}

	public Set<ReasonCodes> getReasoncodes() {
		return reasoncodes;
	}

	public void setReasoncodes(Set<ReasonCodes> reasoncodes) {
		this.reasoncodes = reasoncodes;
	}
	
	
}
