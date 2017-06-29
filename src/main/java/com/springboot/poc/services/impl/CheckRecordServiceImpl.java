package com.springboot.poc.services.impl;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.stream.Collectors;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.springboot.poc.model.CreditAndDepositInfoReq;
import com.springboot.poc.res.CreditAndDepositRes;
import com.springboot.poc.services.CheckRecordService;

@Service
public class CheckRecordServiceImpl implements CheckRecordService {

	private static String jsonFile = "/mock.json";

	@Override
	public CreditAndDepositRes getRecord(CreditAndDepositInfoReq creditanddepositinforeq) throws Exception {

		CreditAndDepositRes creditanddepositresponse = null;
		ObjectMapper mapper = new ObjectMapper();
		InputStream is = this.getClass().getResourceAsStream(jsonFile);
		String result = new BufferedReader(new InputStreamReader(is))
				  .lines().collect(Collectors.joining("\n"));

		//FileReader reader = new FileReader(jsonFile);
		JSONObject jsonObject = (JSONObject) new JSONParser().parse(result);
		Set keys = jsonObject.keySet();
		for (Object key : keys) {
			if (key.toString().contains("request")) {
				JSONObject req = (JSONObject) jsonObject.get(key);
				if ((req.get("socialsecuritynumber").equals(creditanddepositinforeq.getSocialsecuritynumber()))
						&& (req.get("housenumber").equals(creditanddepositinforeq.getHousenumber())
								&& (req.get("lastname").equals(creditanddepositinforeq.getLastname())
										&& (req.get("firstname").equals(creditanddepositinforeq.getFirstname()))))) {
					String s = key.toString();
					String s1[] = s.split("request");
					JSONObject res = (JSONObject) jsonObject.get("response"+s1[1]);
					String response = res.toString();
					creditanddepositresponse = mapper.readValue(response, CreditAndDepositRes.class);
					break;
				}

				
			}
		}
		return creditanddepositresponse;
		
	}

}
