package com.revature;

import java.util.ArrayList;
import java.util.List;

public class FibonacciEvenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Long> listOfFibonacciNums = new ArrayList<Long>();
		List<Integer> listOfFactors = new ArrayList<Integer>();
		long sumOfEvenFibs = 0;
		long i = 0;
		int j = 2;
		listOfFibonacciNums.add((long) 1);
		listOfFibonacciNums.add((long) 2);
		while (i <= 4000000) {
			i = listOfFibonacciNums.get((j-1)) + listOfFibonacciNums.get((j-2));
			if(i < 4000000) {
				listOfFibonacciNums.add(i);
				j++;
			}
			else {
				break;
			}			
		}
		
		for (long k : listOfFibonacciNums) {
			//listOfFactors.clear();
			if (k%2 == 0) {
				listOfFactors.add((int)k);
			}
		}
		for (int index = 0; index < listOfFactors.size(); index++) {
			sumOfEvenFibs += listOfFactors.get(index);
		}
		System.out.println("The sum of even Fibonacci numbers up to 4000000 is " + sumOfEvenFibs);
	}

}
