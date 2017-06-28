/**
 * 
 */
package com.springboot.poc.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * @author gsekhar
 *
 */
public class CreditAndDepositInfoReq implements Serializable{

	
	private static final long serialVersionUID = 1L;

	private String siteid; 
	
	private String housenumber; 
	
	private String accountnumber9; 
	
	private String firstname; 
	
	private String lastname;
	
	private String middleinitial; 
	
	private String suffix; 
	
	private Date dateofbirth;
	
	private String gender; 
	
	private String socialsecuritynumber; 
	
	private String driverlicensenumber; 
	
	private String driverlicensestate; 
	
	private String hometelephone; 
	
	private String businesstelephone; 
	
	private Set<ServiceAddress> serviceadress;
	
	private Set<OrderInfo> orderinfo;

	/**
	 * @return the siteid
	 */
	public String getSiteid() {
		return siteid;
	}

	/**
	 * @param siteid the siteid to set
	 */
	public void setSiteid(String siteid) {
		this.siteid = siteid;
	}

	/**
	 * @return the housenumber
	 */
	public String getHousenumber() {
		return housenumber;
	}

	/**
	 * @param housenumber the housenumber to set
	 */
	public void setHousenumber(String housenumber) {
		this.housenumber = housenumber;
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
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * @return the middleinitial
	 */
	public String getMiddleinitial() {
		return middleinitial;
	}

	/**
	 * @param middleinitial the middleinitial to set
	 */
	public void setMiddleinitial(String middleinitial) {
		this.middleinitial = middleinitial;
	}

	/**
	 * @return the suffix
	 */
	public String getSuffix() {
		return suffix;
	}

	/**
	 * @param suffix the suffix to set
	 */
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	/**
	 * @return the dateofbirth
	 */
	public Date getDateofbirth() {
		return dateofbirth;
	}

	/**
	 * @param dateofbirth the dateofbirth to set
	 */
	public void setDateofbirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the socialsecuritynumber
	 */
	public String getSocialsecuritynumber() {
		return socialsecuritynumber;
	}

	/**
	 * @param socialsecuritynumber the socialsecuritynumber to set
	 */
	public void setSocialsecuritynumber(String socialsecuritynumber) {
		this.socialsecuritynumber = socialsecuritynumber;
	}

	/**
	 * @return the driverlicensenumber
	 */
	public String getDriverlicensenumber() {
		return driverlicensenumber;
	}

	/**
	 * @param driverlicensenumber the driverlicensenumber to set
	 */
	public void setDriverlicensenumber(String driverlicensenumber) {
		this.driverlicensenumber = driverlicensenumber;
	}

	/**
	 * @return the driverlicensestate
	 */
	public String getDriverlicensestate() {
		return driverlicensestate;
	}

	/**
	 * @param driverlicensestate the driverlicensestate to set
	 */
	public void setDriverlicensestate(String driverlicensestate) {
		this.driverlicensestate = driverlicensestate;
	}

	/**
	 * @return the hometelephone
	 */
	public String getHometelephone() {
		return hometelephone;
	}

	/**
	 * @param hometelephone the hometelephone to set
	 */
	public void setHometelephone(String hometelephone) {
		this.hometelephone = hometelephone;
	}

	/**
	 * @return the businesstelephone
	 */
	public String getBusinesstelephone() {
		return businesstelephone;
	}

	/**
	 * @param businesstelephone the businesstelephone to set
	 */
	public void setBusinesstelephone(String businesstelephone) {
		this.businesstelephone = businesstelephone;
	}

	/**
	 * @return the serviceadress
	 */
	public Set<ServiceAddress> getServiceadress() {
		return serviceadress;
	}

	/**
	 * @param serviceadress the serviceadress to set
	 */
	public void setServiceadress(Set<ServiceAddress> serviceadress) {
		this.serviceadress = serviceadress;
	}

	/**
	 * @return the orderinfo
	 */
	public Set<OrderInfo> getOrderinfo() {
		return orderinfo;
	}

	/**
	 * @param orderinfo the orderinfo to set
	 */
	public void setOrderinfo(Set<OrderInfo> orderinfo) {
		this.orderinfo = orderinfo;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result + ((housenumber == null) ? 0 : housenumber.hashCode());
		result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
		result = prime * result + ((socialsecuritynumber == null) ? 0 : socialsecuritynumber.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CreditAndDepositInfoReq other = (CreditAndDepositInfoReq) obj;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		if (housenumber == null) {
			if (other.housenumber != null)
				return false;
		} else if (!housenumber.equals(other.housenumber))
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		if (socialsecuritynumber == null) {
			if (other.socialsecuritynumber != null)
				return false;
		} else if (!socialsecuritynumber.equals(other.socialsecuritynumber))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Depositinfo [siteid=" + siteid + ", housenumber=" + housenumber + ", accountnumber9=" + accountnumber9
				+ ", firstname=" + firstname + ", lastname=" + lastname + ", middleinitial=" + middleinitial
				+ ", suffix=" + suffix + ", dateofbirth=" + dateofbirth + ", gender=" + gender
				+ ", socialsecuritynumber=" + socialsecuritynumber + ", driverlicensenumber=" + driverlicensenumber
				+ ", driverlicensestate=" + driverlicensestate + ", hometelephone=" + hometelephone
				+ ", businesstelephone=" + businesstelephone + ", serviceadress=" + serviceadress + ", orderinfo="
				+ orderinfo + "]";
	}
	
	
	
}
