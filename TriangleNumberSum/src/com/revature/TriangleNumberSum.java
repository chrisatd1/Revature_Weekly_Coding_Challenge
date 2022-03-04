package com.revature;

import java.util.ArrayList;
import java.util.List;

public class TriangleNumberSum {
	public static void main(String[] args) {
		List<Long> listOfTriangleNums = new ArrayList<Long>();
		List<Integer> listOfFactors = new ArrayList<Integer>();
		long sumOfTriangles = 0;
		for (int i = 1;i <= 100000;i++) {
			sumOfTriangles += i;
			listOfTriangleNums.add(sumOfTriangles);
		}
		for (long j : listOfTriangleNums) {
			listOfFactors.clear();
			for (long k = j; k >= 1; k--) {
				if (j%k == 0) {
					listOfFactors.add((int)k);
				}
			}
			if (listOfFactors.size() > 500) {
				System.out.println("The first triangle number to have over 500 divisors is " + j);
				break;
			}
		}
	}
}
