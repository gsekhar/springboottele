/**
 * 
 */
package com.springboot.poc.res;

import java.io.Serializable;
import java.util.Set;

import com.springboot.poc.model.EquipmentDeposits;
import com.springboot.poc.model.ServiceDeposit;

/**
 * @author gsekhar
 *
 */
public class CreditAndDepositRes implements Serializable{

	private String errormessage;
	
	private String siteid;
	
	private Set<ServiceDeposit> servicedep;
	
	private int servicedepositmaxamount;
	
	private Set<EquipmentDeposits> equimentlist;
}
