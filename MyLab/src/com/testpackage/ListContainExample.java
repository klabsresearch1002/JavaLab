package com.testpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListContainExample {
	public static void main(String[] args) {
		
		Map<Integer,List<String>> dblistkeyValuePair = new HashMap<>();
		Map<List<String>,Integer> dblistvalueKeyPair = new HashMap<>();
		
		
		List<List<String>> dblist = new ArrayList<>();
		
		List<String> dbString1 =  new ArrayList<>();
		dbString1.add("abcd1");
		dbString1.add("abcd2");
		dbString1.add("abcd3");
		dbString1.add("abcd4");
		dbString1.add("abcd5");
		
		List<String> dbString2 =  new ArrayList<>();
		dbString2.add("abcd6");
		dbString2.add("abcd7");
		dbString2.add("abcd8");
		dbString2.add("abcd9");
		dbString2.add("abcd0");
		
		List<String> dbString3 =  new ArrayList<>();
		dbString3.add("abrd6");
		dbString3.add("abrd7");
		dbString3.add("abrd8");
		dbString3.add("abrd9");
		dbString3.add("abrd0");
		
		/*Map<Integer,String> yn = new HashMap<>();
		yn.put(88888, "Y");
		yn.put(99999, "Y");
		yn.put(77777, "N");
		*/
		/*Map<Integer,String> n = new HashMap<>();
		n.put(77777, "N");*/
		
		TestBeanClass tbc = new TestBeanClass();
		tbc.setId(88888);
		tbc.setFlag("Y");
		
		TestBeanClass tbc1 = new TestBeanClass();
		tbc1.setId(99999);
		tbc1.setFlag("Y");
		
		TestBeanClass tbc2 = new TestBeanClass();
		tbc2.setId(77777);
		tbc2.setFlag("N");
		
		List<TestBeanClass> yn = new ArrayList<>();
		yn.add(tbc);
		yn.add(tbc1);
		yn.add(tbc2);
		
		
		
		
		
		
		
	
		dblistkeyValuePair.put(88888, dbString1);
		dblistkeyValuePair.put(99999, dbString2);
		dblistkeyValuePair.put(77777, dbString3);
	
	
	for(Entry<Integer,List<String>> newentry:dblistkeyValuePair.entrySet()) {
		dblistvalueKeyPair.put(newentry.getValue(), newentry.getKey());
		dblist.add(newentry.getValue());
		
	}
	
	
	Map<Integer,List<String>> rlistkeyValuePair = new HashMap<>();
	
	
	
	List<String> newList1 =  new ArrayList<>();
	newList1.add("abcd1");
	newList1.add("abcd2");
	newList1.add("abcd3");
	newList1.add("abcd4");
	newList1.add("abcd5");
	
	List<String> newList2 =  new ArrayList<>();
	newList2.add("abcdt");
	newList2.add("abcdy");
	newList2.add("abcdd");
	newList2.add("abcdp");
	newList2.add("abcdh");
	
	List<String> newList3 =  new ArrayList<>();
	newList3.add("abcdl");
	newList3.add("abcmn");
	newList3.add("abcdm");
	newList3.add("abcdk");
	newList3.add("abcdo");
	
	
	CopyOnWriteArrayList<List<String>> rlists = new CopyOnWriteArrayList<>();
	rlistkeyValuePair.put(1, newList1);
	rlistkeyValuePair.put(2, newList2);
	rlistkeyValuePair.put(3, newList3);
	
	for(Entry<Integer,List<String>> rentry:rlistkeyValuePair.entrySet()) {
		rlists.add(rentry.getValue());
	}
	
	Map<Integer,List<String>> matchedMap = new HashMap<>();
	Map<Integer,List<String>> noMatchedMap = new HashMap<>();
	List<List<String>> matchedList = new ArrayList<>();
	
	//finding matched and non matched list of string
	for(List<String> dlistString:dblist) {
		if(rlists.contains(dlistString)) {
			matchedMap.put(dblistvalueKeyPair.get(dlistString), dlistString);
			matchedList.add(dlistString);
		}else {
			noMatchedMap.put(dblistvalueKeyPair.get(dlistString), dlistString);
		}
	}
	
	//identifying outbound new resource which is not available inbound
	for(List<String> listString:rlists) {
		if(matchedList.contains(listString)) {
			rlists.remove(listString);
		}
	}
	
	System.out.println("Matched"+matchedMap);
	System.out.println("No matched"+noMatchedMap);
	System.out.println("New"+rlists);
	
	boolean removed = false;
	boolean added = false;
	
	for(TestBeanClass tbce : yn) {
		if("Y".equalsIgnoreCase(tbce.getFlag()) && !matchedMap.containsKey(tbce.getId())) {
			removed = true;
		}else if("N".equalsIgnoreCase(tbce.getFlag()) && matchedMap.containsKey(tbce.getId())) {
			added = true;
		}
	}
	
	System.out.println("removed confirmd: "+ removed);
	System.out.println("added confirmd: "+ added);
	
	/*for(Entry<Integer,String> entY : y.entrySet()) {
		
		if(!matchedMap.containsKey(entY.getKey())) {
			removed = true;
		}
		
	}
	
for(Entry<Integer,String> entY : n.entrySet()) {
		
		if(matchedMap.containsKey(entY.getKey())) {
			added = true;
		}
		
	}*/
	
	
	
	
	
	
	
	}

}
