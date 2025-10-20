package com.nt;

import java.util.ArrayList;

public class FactorsOfPositiveNumber {
	public void Factors(int number) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 1;i<=number/2;i++) {
			if(number%i == 0) {
				list.add(i);
			}
		}
		list.add(number);
		
		System.out.println(list);
	}
	
	//simple method
	public void Factors1(int number) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 1;i<=Math.sqrt(number);i++) {
			if(number%i == 0) {
				
				if(i == number/i) {
					list.add(i);
				}
				else {
					list.add(i);
					list.add(number/i);
				}
			}
		}		
		System.out.println(list);
	}
	
	public static void main(String[] args) {
		FactorsOfPositiveNumber positive = new FactorsOfPositiveNumber();
		positive.Factors(10);
		positive.Factors1(10);
	}

}
