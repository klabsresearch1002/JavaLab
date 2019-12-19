package com.testpackage;

public class ConditionBreakTest {
	public static void main(String[] args) {
		int matchvalue = 6;
		for(int i=0;i<10;i++) {
			if(matchvalue == i) {
				break;
			}
			System.out.println("test"+i);
		}
	}

}
