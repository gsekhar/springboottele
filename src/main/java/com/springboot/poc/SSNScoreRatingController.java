package com.springboot.poc;

import java.util.HashSet;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.poc.model.CreditAndDepositInfo;
import com.springboot.poc.model.Depositinfo;
import com.springboot.poc.model.EquipmentDeposits;
import com.springboot.poc.model.ServiceDeposit;
import com.springboot.poc.res.CreditAndDepositRes;
import com.springboot.poc.res.ExternalCreditCheckInfo;
import com.springboot.poc.res.ReasonCodes;

@RestController
@RequestMapping("/api/creditservice")
public class SSNScoreRatingController {

	@RequestMapping("/")
	public String index() {
		return "Welcome to SSN score calculation!";
	}

	@RequestMapping(value = "/getcreditanddeposit", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public CreditAndDepositRes getCreditAndDepositResponse(@RequestBody Depositinfo creditreq) {
		CreditAndDepositRes creditanddepositres = new CreditAndDepositRes();
		CreditAndDepositInfo  creditanddepositinfo = new CreditAndDepositInfo();
		
		HashSet<EquipmentDeposits> eqset = new HashSet<EquipmentDeposits>();
		EquipmentDeposits eq = new EquipmentDeposits();
		HashSet<Depositinfo> depinfoset = new HashSet<Depositinfo>();
		depinfoset.add(new Depositinfo());
		eq.setDepositinfo(depinfoset);
		eqset.add(eq);
		HashSet<ExternalCreditCheckInfo> excreditcheckset = new HashSet<ExternalCreditCheckInfo>();
		ExternalCreditCheckInfo exccheck = new ExternalCreditCheckInfo();
		
		HashSet<ReasonCodes> reasset = new HashSet<ReasonCodes>();
		ReasonCodes reas = new ReasonCodes();
		reasset.add(reas);
		exccheck.setReasoncodes(reasset);
		excreditcheckset.add(exccheck);
		
		
		creditanddepositinfo.setEquimentdeposit(eqset);
		HashSet<ServiceDeposit> serviceset = new HashSet<ServiceDeposit>();
		serviceset.add(new ServiceDeposit());
		creditanddepositinfo.setServicedeposits(serviceset);
		creditanddepositinfo.setExternalcreditcheckinfo(excreditcheckset);
		creditanddepositres.setCreditanddepositinfo(creditanddepositinfo);
		
		return creditanddepositres;
	}

}
