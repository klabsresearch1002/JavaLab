package com.testpackage;

import java.util.ArrayList;
import java.util.List;

public class IdentifyingDifferent {

	public static void main(String[] args) {
		boolean isTriggerNN = false;
      List<String> newsources = new ArrayList<>();
      newsources.add("BS-SAVS-DBEN-Y1TR-GMDR--EDGAAE");
      newsources.add("BS-SAVS-DBEN-Y1TR-GMDR--EDGAAE");
      newsources.add("BS-SAVS-HSEN-BGTR-GADR--ADGAAE");
      newsources.add("BS-SAVS-D5EN-BGTR-GADR--EDGAAE");
      
      List<String> oldsources = new ArrayList<>();
      oldsources.add("BS-SAVS-DBEN-Y1TR-GMDR--EDGAAE");
      oldsources.add("BS-SAVS-DBEN-Y1TR-GMDR--EDGAAE");
      oldsources.add("BS-SAVS-EVEN-R9TR-GMDR--EDGAAE");
      oldsources.add("BS-SAVS-EVEN-Y1TR-E7DR--ADGAAE");
      oldsources.add("BS-SAVS-EVEN-Y1TR-E7DR--ADGAAE");
      
      for(String newsourceString : newsources) {
    	  if(!oldsources.contains(newsourceString)) {
    		  isTriggerNN = true;
    	  }
      }
      
      if(newsources.size() != oldsources.size() ) {
    	  isTriggerNN = true;
      }
      
      if(isTriggerNN) {
    	  System.out.println("trigger NN");
      }
      
      
      
      
	}

}
