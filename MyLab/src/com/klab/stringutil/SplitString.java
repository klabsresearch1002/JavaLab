package com.klab.stringutil;

import java.util.ArrayList;
import java.util.List;

public class SplitString {
	public static void main(String args[]) {
		/*String sourceString = "FORECAST-RETAIL-CMY";
		String [] result;
		result = sourceString.split("-");
		System.out.println(result[0]);*/
		
		/*List<String> myList = new ArrayList<String>();
        myList.add("adsds");
        myList.add("bdsds");
        myList.add("cdsds");
        String result = myList.toString().replaceAll("[\\[\\]]", "").replaceAll(",", "").replaceAll("\\s","");
        System.out.println(result);*/
		
		String mmbkey = "4883";
        
        String featruekeyString ="3126044,"+
        		"3126045,";
        String[] featurekeys = featruekeyString.split(",");
        
        String mix ="0.115,0.179,";
        String[] mixes = mix.split(",");
        
        for(int i=0;i<mixes.length;i++) {
        	System.out.println("--"+(i+1));
        	String query ="INSERT INTO [dbo].[MOGM089_MARKET_OVERRIDE]([OGM030_MARKET_MODEL_YEAR_BUSINESS_K],[OGM022_FEATURE_K],[OGM089_MARKET_OVERRIDE_RATE_R] ,"+
        			"[OGM089_CREATE_USER_C],[OGM089_CREATE_S],[OGM089_LAST_UPDT_USER_C],[OGM089_LAST_UPDT_S])"+
        			"VALUES("+mmbkey+","+featurekeys[i]+","+mixes[i]+",'MANUAL',getdate(),'MANUAL',getdate())";
        	System.out.println(query);
        }
		
	}

}
