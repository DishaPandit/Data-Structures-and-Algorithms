package day10_WhileLoop2;

import java.util.Scanner;

public class LectureCode {
	
	Scanner scn = new Scanner(System.in);
	
	//1. Given n, print all digits of n (right to left)
	/*
	int n = scn.nextInt();
	
	if(n == 0) {
		System.out.println(0);
	}
	else if(n < 0) {
		//if number is -ve make it +ve
		n = -n;
	}
	while(n > 0) {
		int d = n % 10;
		System.out.println(d);
		n = n / 10;
	}
	*/
	
	
	//2. For T testcases, find sum of digits and print it
	/*
	int T = scn.nextInt();
	
	while(T > 0) {
		//work
		int n = scn.nextInt();
		int sum = 0;
		
		if(n < 0) {
			n = -n;
		}
		while(n > 0) {
			int d = n % 10;
			sum = sum + d;
			n = n/10;
		}
		System.out.println(sum);
		
		//updation
		T--;
	}
	*/
	

}
