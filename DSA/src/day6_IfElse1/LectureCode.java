package day6_IfElse1;

import java.util.Scanner;

class LectureCode {
	
	public static void main(String[]args) {
		Scanner scn = new Scanner(System.in);
		
		/*
		1. Given a person is non-veg or veg 
		please provide some sources of protein
		*/
		
		//user - please write true on input if you are non-veg and write false if you are veg
		/*
		boolean non_veg = scn.nextBoolean();
		
		if(non_veg == true) {
			System.out.println("Boiled chicken, eggs, Fish");
		}
		else {
			System.out.println("Pulses, sprouts, paneer, tofu");
		}
		*/
		
		
		/*
		2. Given the age of a person, tell whether 
		the person can cast a vote or not
		*/
		
		/*
		int age = scn.nextInt();
		if(age >= 18) {
			System.out.print("You can vote!!!");
		}
		else {
			System.out.print("You can't vote this time, please wait");
		}
		*/
		
		/*
		3. Given temperature of a person, tell whether
		the person is suffering from fever or not
		*/
		
		//always use double for decimal numbers or
		//use 'f' to compare two float numbers (refer to line 50) 
		/*
		float temperature = scn.nextFloat();
		
		if(temperature >= 98.6f) {
			System.out.println("You have fever, please eat PCM");
		}
		else {
			System.out.println("You are fine");
		} 
		*/
		
		/*
		4. Given the age of a person, tell whether
		the person can watch A grade movie or not
		*/
		
		/*
		5. Given SPO2 level, tell whether to go for RTPCR or not
		*/
		
		/*
		double spo2 = scn.nextDouble();
		
		if(spo2 < 95) {
			System.out.println("Go for RTPCR");
		}
		else {
			System.out.println("Not needed, but you can still go for RTPCR");
		}
		*/
		
		
		/*
		6. Given temperature of a person, give a detailed information
		*/
		//this code is correct only when user will give temp till one decimal point
		/*
		double temp = scn.nextDouble(); //temperature
		
		if(temp >= 98.0 && temp <= 98.9) {
			System.out.println("Normal");
		}
		if(temp >= 99.0 && temp <= 99.9) {
			System.out.println("Mild fever");
		}
		if(temp >= 100.0 && temp <= 102.0) {
			System.out.println("Fever");
		}
		if(temp > 102.0) {
			System.out.println("High fever");
		}
		if(temp >= 96.0 && temp <= 97.9) {
			System.out.println("Mild hypothermia");
		}
		if(temp < 96.0) {
			System.out.println("Hypothermia");
		}
		
		System.out.println("Hey there");
		*/
		
		
		/*
		if(false) {
			System.out.println("Hey there! ");
		}
		
		System.out.println(10*20);
		*/
		
		
		//arithmetic operators
		/*
		addition -> +
		subtraction -> -
		multiply -> *
		divide -> /
		*/
		
		//division -> quotient (a/b), remainder (a%b)
		//% -> mod/modulus
		//when a is completely divisible by b the remainder is 0
		
		/*
		int a = scn.nextInt();
		int b = scn.nextInt();
		
		System.out.println("Quotient : " + (a / b));
		System.out.println("Remainder : " + (a % b));
		*/
		
		/*
		7. Given a number, find whether it is even or odd
		Even number -> divisible by 2
		Odd number -> not divisible by 2
		*/
		
		/*
		int num = scn.nextInt();
	
		if(num % 2 == 0) {
			System.out.print(num + " is Even");
		}
		else {
			System.out.print(num + " is Odd");
		}
		*/
		
		
		// Doubt
		// boolean b = false;
		// b = !b;  //! -> not, !false -> true
		
		// System.out.println(b);
	
		// != -> relational operator (not equals to)
		// = ! -> not an operator, = means assigment, ! means not
		
		
	}

}
