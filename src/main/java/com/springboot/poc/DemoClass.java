package com.springboot.poc;

import java.io.FileReader;
import java.util.Set;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.springboot.poc.model.CreditAndDepositInfoReq;
import com.springboot.poc.res.CreditAndDepositRes;

public class DemoClass {

	
	public static void main(String[] args) throws Exception {
		
	CreditAndDepositInfoReq creditanddepositinforeq = new CreditAndDepositInfoReq();
	creditanddepositinforeq.setSiteid("333");
	creditanddepositinforeq.setFirstname("Captain");
	creditanddepositinforeq.setLastname("America");
	creditanddepositinforeq.setHousenumber("278566");
	creditanddepositinforeq.setSocialsecuritynumber("222348677");
	getRecord(creditanddepositinforeq);
		}
	
	
	public static CreditAndDepositRes getRecord(CreditAndDepositInfoReq creditanddepositinforeq) throws Exception {
		
		String jsonFile = "C:\\Users\\deepsoni\\Documents\\springboottele\\src\\main\\java\\mock.json";
		JSONObject res =null;
		ObjectMapper mapper = new ObjectMapper();
		FileReader reader = new FileReader(jsonFile);
		CreditAndDepositRes creditanddepositres = new CreditAndDepositRes(); 
		JSONObject jsonObject = (JSONObject) new JSONParser().parse(reader);
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
					//key=key.toString().contains("response"+s1[1]);
					res = (JSONObject) jsonObject.get("response"+s1[1]);
					String response = res.toString();
//					CreditAndDepositRes creditanddepositresponse =gson.fromJson(res,CreditAndDepositRes.class);
					
					CreditAndDepositRes creditanddepositresponse = mapper.readValue(response, CreditAndDepositRes.class);
					return creditanddepositresponse;
//					break;
				}

				
			}
		}
		return null;
		
	}
}
