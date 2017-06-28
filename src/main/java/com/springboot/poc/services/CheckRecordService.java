package com.springboot.poc.services;

import com.springboot.poc.model.CreditAndDepositInfoReq;
import com.springboot.poc.res.CreditAndDepositRes;

public interface CheckRecordService {
	
	CreditAndDepositRes getRecord(CreditAndDepositInfoReq creditanddepositinforeq) throws Exception;
	
	
}
