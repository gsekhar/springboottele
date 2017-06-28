/**
 * 
 */
package com.springboot.poc.res;

import java.io.Serializable;

import com.springboot.poc.model.CreditAndDepositInfo;

/**
 * @author gsekhar
 *
 */
public class CreditAndDepositRes implements Serializable {

	private static final long serialVersionUID = 1L;

	
	private String errormessage;

	private CreditAndDepositInfo creditanddepositinfo;

	private String errorcode;
	
	

	public String getErrormessage() {
		return errormessage;
	}

	public void setErrormessage(String errormessage) {
		this.errormessage = errormessage;
	}

	public CreditAndDepositInfo getCreditanddepositinfo() {
		return creditanddepositinfo;
	}

	public void setCreditanddepositinfo(CreditAndDepositInfo creditanddepositinfo) {
		this.creditanddepositinfo = creditanddepositinfo;
	}

	public String getErrorcode() {
		return errorcode;
	}

	public void setErrorcode(String errorcode) {
		this.errorcode = errorcode;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
