package day8_IfElse3;

public class LectureCode {
	
	public static void main(String args[]) {
		//Scope and life of variable
        /*
		int a = 10; // a = 15
		
		{
			System.out.println(a); //10
		}
		
		{
			int b = 10;
			a = 15;
			System.out.println(a); //15
		}
		
		System.out.println(a); //15
		*/
		
		/*
		int x = 10, y = 20;
		
		{
			System.out.println(x + " " + y); //10 20
		}
		{
			x = 15;
			System.out.println(x + " " + y); //15 20
		}
		System.out.println(x + " " + y); //15 20
		*/
		
		/*
		int x = 10;
		{
			int y = 20;
			System.out.println(x + " " + y);
		}
		
		{
			System.out.println(x + " " + y); //error (can't find y)
		}
		
		System.out.println(x + " " + y); //error (can't find y)
		*/
		
		/*
		int a = 10, b = 20;
		
		if(a < b) {
			int c = a * b;
		}
		
		System.out.println(c); //error (can't find c)
		*/
		
		/*
		int a = 10, b = 20,c = 0;
		
		if(a < b) {
			c = a * b;
		}
		
		System.out.println(c);
		*/
		
		/*
		int a = 20, b = 5;
		
		if(a > b) {
			int c = 6;
			if(true) {
				c++;
			}
			else {
				System.out.println(c);
			}
			System.out.println(c);
		}
		*/
		

	}

}
