package com.klab.string.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortListOfStringUsingGivenPattern {
	
	  	
	
	public List<String> getExistingSpcpsEntityPattern(Map<Integer, List<String>> existingPPV) {
		List<String> existingSpcpsEntityPattern = new ArrayList<>();
		for(Map.Entry<Integer,List<String>> entry: existingPPV.entrySet()) {
			existingSpcpsEntityPattern = entry.getValue();
			break;
		}
		return existingSpcpsEntityPattern;
	}
	
	
	public Map<String,Integer> getSpcpsFamilyOrderPattern(List<String> existingSpcpsEntitiesFamilyOrder) {
		int count = 0;
		Map<String,Integer> familyOrderPattern = new HashMap<>(existingSpcpsEntitiesFamilyOrder.size());
		
		for(String  feature : existingSpcpsEntitiesFamilyOrder) {
			familyOrderPattern.put(feature.substring(0, 3),count);
			count++;
		}
		
		return familyOrderPattern;
	}
	
	public Map<Integer, List<String>> orderPdoEntityAsSpcpsEntityPattern(Map<Integer, List<String>> pdoEntities,Map<String,Integer> spcpsFamilyOrderPattern){
			
		int count = 0;
		Map<Integer,List<String>> orderedPDOEntities = new HashMap<>(pdoEntities.size());
		
		for(Map.Entry<Integer, List<String>> entry : pdoEntities.entrySet()) {
			List<String> pdoEntity = entry.getValue();
			String[] orderedPdoEntity  =  new String[pdoEntity.size()];
			for(String feature : pdoEntity) {
				orderedPdoEntity[spcpsFamilyOrderPattern.get(feature.substring(0, 3))] = feature;
			}
			orderedPDOEntities.put(count, Arrays.asList(orderedPdoEntity));
			count++;
		} 
		
		return orderedPDOEntities;
	}
	
	
	public void splitfeatureCode() {
		String entityDes = "BS-SA - VS-DE - EN-R9 - TR-GM - DR--E - DGAAE";
		String replacedDes = entityDes.replace(" - ", ",");
		String[] splitedfeatures = replacedDes.split(",");
		List<String> featurcode = Arrays.asList(splitedfeatures);
		System.out.println(featurcode);
	}
	
	
	public static void main(String[] args) {
		
		/*BS-SA - VS-KX - EN-C1 - TR-WA - DR--B - DGACA
		BS-SA - VS-KX - EN-C2 - TR-WA - DR--F - DGACA
		BS-SA - VS-LE - EN-C1 - TR-WA - DR--B - DGACA
		BS-SA - VS-LE - EN-EJ - TR-WA - DR--F - DGACA
		BS-SA - VS-LE - EN-C2 - TR-WA - DR--F - DGACA
		BS-SA - VS-KY - EN-EH - TR-WA - DR--B - DGACA
		BS-SA - VS-JZ - EN-EL - TR-WA - DR--E - DGACA
		BS-SA - VS-LE - EN-EH - TR-WA - DR--B - DGACA*/
		
		Map<Integer, List<String>> existingPPV = new HashMap<Integer,List<String>>();
		
		List<String> ogmEntityFeature= new ArrayList<>();
		ogmEntityFeature.add("BS-SA");
		ogmEntityFeature.add("VS-KX");
		ogmEntityFeature.add("EN-C1");
		ogmEntityFeature.add("TR-WA");
		ogmEntityFeature.add("DR--B");
		ogmEntityFeature.add("DGACA");
		
		List<String> ogmEntityFeature1= new ArrayList<>();
		ogmEntityFeature1.add("BS-SA");
		ogmEntityFeature1.add("VS-KX");
		ogmEntityFeature1.add("EN-C2");
		ogmEntityFeature1.add("TR-WA");
		ogmEntityFeature1.add("DR--F");
		ogmEntityFeature1.add("DGACA");
		
		List<String> ogmEntityFeature2= new ArrayList<>();
		ogmEntityFeature2.add("BS-SA");
		ogmEntityFeature2.add("VS-LE");
		ogmEntityFeature2.add("EN-C1");
		ogmEntityFeature2.add("TR-WA");
		ogmEntityFeature2.add("DR--B");
		ogmEntityFeature2.add("DGACA");
		
		existingPPV.put(1, ogmEntityFeature);
		existingPPV.put(2, ogmEntityFeature1);
		existingPPV.put(3, ogmEntityFeature2);
	
		Map<Integer, List<String>> pdoEntities = new HashMap<>();
		List<String> pdoEntity = new ArrayList<>();
		pdoEntity.add("DGACA");
		pdoEntity.add("VS-KX");
		pdoEntity.add("DR--B");
		pdoEntity.add("TR-WA");
		pdoEntity.add("EN-C1");
		pdoEntity.add("BS-SA");
		
		List<String> pdoEntity1 = new ArrayList<>();
		pdoEntity1.add("TR-WA");
		pdoEntity1.add("VS-KX");
		pdoEntity1.add("EN-C2");
		pdoEntity1.add("BS-SA");
		pdoEntity1.add("DR--F");
		pdoEntity1.add("DGACA");
		
		List<String> pdoEntity2 = new ArrayList<>();
		pdoEntity2.add("DR--B");
		pdoEntity2.add("VS-LE");
		pdoEntity2.add("EN-C1");
		pdoEntity2.add("TR-WA");
		pdoEntity2.add("BS-SA");
		pdoEntity2.add("DGACA");
		
		pdoEntities.put(0, pdoEntity);
		pdoEntities.put(1, pdoEntity1);
		pdoEntities.put(2, pdoEntity2);
		
		//testdata preparation end
		
		
		
		SortListOfStringUsingGivenPattern sortListOfStringUsingGivenPattern = new SortListOfStringUsingGivenPattern();
		sortListOfStringUsingGivenPattern.splitfeatureCode();
		
		/*List<String> existingSpcpsEntityPattern = sortListOfStringUsingGivenPattern.getExistingSpcpsEntityPattern(existingPPV);
		
		Map<String,Integer> spcpsFamilyOrderPattern = sortListOfStringUsingGivenPattern.getSpcpsFamilyOrderPattern(existingSpcpsEntityPattern);
		Map<Integer,List<String>> orderedPDOEntities = sortListOfStringUsingGivenPattern.orderPdoEntityAsSpcpsEntityPattern(pdoEntities,spcpsFamilyOrderPattern);
		
		List<List<String>> newOrderdPDOEntities = new ArrayList<>();
		for(Map.Entry<Integer, List<String>> entry : orderedPDOEntities.entrySet()) {
			newOrderdPDOEntities.add(entry.getValue());
		}
		
		for(Map.Entry<Integer, List<String>> ent : existingPPV.entrySet()) {
			if(newOrderdPDOEntities.contains(ent.getValue())) {
				System.out.println("both are same");
			}
		}*/
		
		
		
	}

}
