package day4_ReadingInput;

import java.util.Scanner;

public class LectureCode {
	
	public static void main(String[]args) {
		//Your code goes here
		
		/*
		int a = 10; //creating a variable 
		
		//change the value of a to 20
		a = 20; //over riding the previous value of a
		
		//1. int a = 20 (not work)
		//2. a = 20
		System.out.print(a);
		*/
		
		/*
		int a; //(not work)
		a = 10;
		System.out.print(a);
		*/
		
		//Naming rules for variables
		//int num = 10;
		//int Num = 20; //will work (java is case sensitive)
		
		/*
			1. variable name can't start with a number
			2. special chars : _,$ working (anywhere)
			3. variable names follow case sensitive
		*/
		
		
		/*
		black_grapes_ //valid
		sun$shine //valid
		7a //invalid
		_roll_number$ //valid
		4twenty //invalid
		#age //invalid
		spring roll //invalid
		_delhi //valid
		roll_number //valid
		bus ticket //invalid
		static //invalid (reserved word)
		void //invalid
		$$$$ //valid
		*/
		
		/*
		int num = 2000000000; //2 * (10 power 9)
		//-2147483648 to 2147483647 (range of int)
		
		long population = 1350000000000000l; // (10 power 18)
		//-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		System.out.print(population);
		*/
		
		
		//int and long relation
		/*
		long a = 100000;
		long b = 400000;
		long c = a * b;
		System.out.print(c); 
		*/
		
		/*
		long a = 10;
		long b = 40000000000000l;
		*/
		
		
		//to store decimal values - float, double
		
		/*
		float a = 10;
		float b = 3;
		float c = a / b;
		System.out.println(c);
		
		
		double a1 = 10;
		double b1 = 3;
		double c1 = a1 / b1;
		System.out.print(c1);
		*/
		
		/*
		float val = 4.6f;
		System.out.print(val);
		*/
		
		/*
		double a = 10;
		double b = 40;
		float c = a * b;
		System.out.print(c);
		*/
		
		
		/*
		boolean i_want_tea = true; //true / false
		System.out.print("Mona do you want tea ? " + i_want_tea);
		*/
		
		//boolean - 1L bucket
		//int/float - 4L bucket
		//long/double - 8L bucket
		
		
		Scanner scn = new Scanner(System.in);
		/*
		int length = scn.nextInt();
		int breadth = scn.nextInt();
		int area = length * breadth;
		
		System.out.print(area);
		*/
		
		
		/*
		double length = scn.nextDouble();
		double breadth = scn.nextDouble();
		double area = length * breadth;
		
		System.out.println(area);
		*/
		
		//scan int -> scn.nextInt();
		//scan long -> scn.nextLong();
		//scan float -> scn.nextFloat();
		//scan double -> scn.nextDouble();
		//scan boolean -> scn.nextBoolean();
		
		/*
		int a = 5;
		int b = 2;
		float c = a / b;
		System.out.print(c); //2.0
		*/
		
		
		/*
		long a = 100000;
		int b = 400000;
		long c = a * b;
		System.out.print(c);
		*/
		
		/*
		int num1 = scn.nextInt();
		int num2 = scn.nextInt();
		
		float ans = (num1 * 1.0f)/num2;
		System.out.print(ans);
		*/
	}

}
