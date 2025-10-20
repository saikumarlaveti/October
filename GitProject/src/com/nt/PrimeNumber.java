package com.nt;

import java.util.ArrayList;

public class PrimeNumber {
	public void primeNumberList(int number) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 2;i<number;i++) {
			boolean result = false;
			for(int j = 2;j<i;j++) {
				if(i%j == 0) {
					result = true;
				}
			}
			if(!result) {
				list.add(i);
			}
		}
		System.out.println(list);
	}
	
	public void primeNumberList1(int number) {
		//ArrayList<Integer> list1 = new ArrayList<>();
		boolean[] prime = new boolean[number+1];
		
		//initially all are prime numbers
		for(int i = 0;i<number;i++) {
			prime[i] = true;
		}
		
		//starting with first prime
		for(int p = 2;p<=number;p++) {
			if(prime[p]) {
				for(int j = p*p;j<=number;j = j + p) {
					prime[j] = false;
				}
			}
		}
		
		//count prime numbers
		int count = 0;
		for(int i = 2 ;i<number;i++) {
			if(prime[i] == true)	
				count++;
		}
		
		int[] primenumbers = new int[count];
		int index = 0;
		for(int k = 2;k<number;k++) {
			if(prime[k]) {
				primenumbers[index++] = k;
			}
		}
		for(int a :primenumbers) {
			System.out.print(a+ " ");
		}
	}
	public static void main(String[] args) {
		PrimeNumber pn = new PrimeNumber();
		pn.primeNumberList1(100);
		pn.primeNumberList1(23);
	}

}
