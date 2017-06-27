package com.springboot.poc;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.poc.model.Depositinfo;
import com.springboot.poc.res.CreditAndDepositRes;

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
		return creditanddepositres;
	}

}
