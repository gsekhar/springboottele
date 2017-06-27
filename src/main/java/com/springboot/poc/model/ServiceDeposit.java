package com.springboot.poc.model;

public class ServiceDeposit {
	
	private String servicecategory;
	
	private double depositamount;
	
	private int numberofspreadinstallments;

	/**
	 * @return the servicecategory
	 */
	public String getServicecategory() {
		return servicecategory;
	}

	/**
	 * @param servicecategory the servicecategory to set
	 */
	public void setServicecategory(String servicecategory) {
		this.servicecategory = servicecategory;
	}

	/**
	 * @return the depositamount
	 */
	public double getDepositamount() {
		return depositamount;
	}

	/**
	 * @param depositamount the depositamount to set
	 */
	public void setDepositamount(double depositamount) {
		this.depositamount = depositamount;
	}

	/**
	 * @return the numberofspreadinstallments
	 */
	public int getNumberofspreadinstallments() {
		return numberofspreadinstallments;
	}

	/**
	 * @param numberofspreadinstallments the numberofspreadinstallments to set
	 */
	public void setNumberofspreadinstallments(int numberofspreadinstallments) {
		this.numberofspreadinstallments = numberofspreadinstallments;
	}
	
	

}
