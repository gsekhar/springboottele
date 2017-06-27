package com.springboot.poc.model;

import java.util.Set;

public class EquipmentDeposits {

	private String equipmentSPK;
	private String existingquantity;
	private Set<Depositinfo> depositinfo;

	public String getEquipmentSPK() {
		return equipmentSPK;
	}

	public void setEquipmentSPK(String equipmentSPK) {
		this.equipmentSPK = equipmentSPK;
	}

	public String getExistingquantity() {
		return existingquantity;
	}

	public void setExistingquantity(String existingquantity) {
		this.existingquantity = existingquantity;
	}

	public Set<Depositinfo> getDepositinfo() {
		return depositinfo;
	}

	public void setDepositinfo(Set<Depositinfo> depositinfo) {
		this.depositinfo = depositinfo;
	}

}
