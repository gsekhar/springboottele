/**
 * 
 */
package com.springboot.poc.model;

/**
 * @author gsekhar
 *
 */
public class ServiceAddress {

	
	private String serviceaddressLine1;
	
	private String serviceaddressLine2;
	
	private String city;
	
	private String state;
	
	private String zip5;
	
	private String zip4;

	/**
	 * @return the serviceaddressLine1
	 */
	public String getServiceaddressLine1() {
		return serviceaddressLine1;
	}

	/**
	 * @param serviceaddressLine1 the serviceaddressLine1 to set
	 */
	public void setServiceaddressLine1(String serviceaddressLine1) {
		this.serviceaddressLine1 = serviceaddressLine1;
	}

	/**
	 * @return the serviceaddressLine2
	 */
	public String getServiceaddressLine2() {
		return serviceaddressLine2;
	}

	/**
	 * @param serviceaddressLine2 the serviceaddressLine2 to set
	 */
	public void setServiceaddressLine2(String serviceaddressLine2) {
		this.serviceaddressLine2 = serviceaddressLine2;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the zip5
	 */
	public String getZip5() {
		return zip5;
	}

	/**
	 * @param zip5 the zip5 to set
	 */
	public void setZip5(String zip5) {
		this.zip5 = zip5;
	}

	/**
	 * @return the zip4
	 */
	public String getZip4() {
		return zip4;
	}

	/**
	 * @param zip4 the zip4 to set
	 */
	public void setZip4(String zip4) {
		this.zip4 = zip4;
	}
	
	
}
