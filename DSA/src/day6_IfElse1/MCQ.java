package day6_IfElse1;

public class MCQ {
	
//		Ques 1
//		
//		State TRUE or FALSE:
//			“Every IF statement must be followed by an ELSE statement.”
//		
//		Ans : False
//			
//-------------------------------------------------------------------------------------------------------------------------
//
//		Ques 2
//		
//		An IF statement in Java is also a ___ statement.
//		
//		Ans : Conditional
//			
//-------------------------------------------------------------------------------------------------------------------------
//		
//		Ques 3
//		
//		If the condition of an IF-statement is false, which is true below.
//		
//		1. IF block is executed.
//		2. Else block is executed.
//		3. Both IF and ELSE blocks are skipped.
//		4. Both IF and ELSE blocks are executed.
//		
//		Ans : 2
//			
//-------------------------------------------------------------------------------------------------------------------------
//
//		
//		Ques 4
//		
//		What are the maximum lines of code that can be written inside a Java style IF, ELSE or IF-ELSE block?
//		
//		Ans : There is no such limit on the number of lines of code in any block or statement in Java.
//			
//-------------------------------------------------------------------------------------------------------------------------
//	
//		Ques 5
//		
//		State TRUE or FALSE:
//			“An IF statement code must be defined in between two Braces.”
//		
//		Ans : False
//		Single line of code does not need Braces {}.
//		if(a>9)
//		System.out.println(“NINE”);
//			
//-------------------------------------------------------------------------------------------------------------------------
//	
//		Ques 6
//		
//		What is the output of the Java code snippet?
//
//				int k=20;
//
//				if(k)
//
//				{
//
//				System.out.println("YES");
//
//				}
//
//				else
//
//				{
//
//				System.out.println("NO");
//
//				}
//		
//		Ans : Error: if(k) –> k is not boolean
//
//		Type mismatch: cannot convert from int to boolean
//			
//-------------------------------------------------------------------------------------------------------------------------
//
//		
//		Ques 7
//		
//		What is the output of the given Java program with IF statement?
//
//				if(1)
//
//				{
//
//				System.out.println("OK");
//
//				}
//		
//		Ans : The condition inside an IF statement should evaluate to either true/false. The below error is triggered:
//
//		Type mismatch: cannot convert from int to boolean
//			
//-------------------------------------------------------------------------------------------------------------------------
//		
//		Ques 8
//		
//		What is the output of the given below program?
//
//				public class Main
//
//				{
//
//				public static void main(String[] args) {
//
//				if(a<b)
//
//				System.out.println("Hi");
//
//				else
//
//				System.out.println("Hello");
//
//				}
//
//				}
//		
//		Ans : Compile-time error, Because in Java, all variables must be declared before using it. Here “a”, and “b” variables are not declared.
//			
//-------------------------------------------------------------------------------------------------------------------------
//		
//		Ques 9
//		
//		What is the output of the Java program?
//
//				String name="dino";
//
//				if(name == "dino")
//
//				System.out.print("DINO");
//
//				System.out.println("GOOD");
//		
//		Ans : DINO GOOD
//		The second Print statement is not part of the IF statement. So it is always executed.
//			
//-------------------------------------------------------------------------------------------------------------------------
//
//		Ques 10
//		
//		Find the output of the given Java program?
//
//				boolean x, y, z;
//
//				x = y = z = true;
//
//				if(!x || (!y && !z))
//
//				System.out.println("WHY");
//
//				else
//
//				System.out.println("WHAT");
//		
//		Ans : WHAT
//			
//-------------------------------------------------------------------------------------------------------------------------
//		
//		Ques 11
//		
//		What is the output of the given below program?
//
//				float a = 7.3f;
//
//				if(a == 7.3)
//
//				System.out.print("Hi");
//
//				else
//
//				System.out.print("Know Program");
//		
//		Ans : Know Program
//		The 7.3 is a double type value but the “a” variable is float type. 
//		Both are not the same, hence the condition becomes false, and the ELSE block will be executed.
//			
//-------------------------------------------------------------------------------------------------------------------------
//		
//		Ques 12
//		
//		The condition of an IF statement evaluates to boolean only if the expression contains?
//		
//		Ans : Logical Operators, Relational Operators, Boolean Operators
//			
//-------------------------------------------------------------------------------------------------------------------------
//		
//		Ques 13
//		
//		Choose the correct syntax of Java IF statement below.
//		
//			if(condition) //statement
//			if(condition){ //statement }
//			if(condition){ //statement1 //statement2 }
//			All of the above
//		
//		Ans : All of the above
//			
//-------------------------------------------------------------------------------------------------------------------------
//
//		
//		Ques 14
//		
//		What is the output of the Java code snippet?
//
//				int a=5, b=6;
//
//				if(a++ == --b)
//
//				{
//
//				System.out.println("5=5");
//
//				}
//
//				else
//
//				{
//
//				System.out.println("NONE");
//
//				}
//		
//		Ans : Post increment will happen after comparing the values, so a = 5 and b will be decremented to 5. Hence, the output will be 5=5.
//			
//-------------------------------------------------------------------------------------------------------------------------
//		
//		Ques 15 
//		
//		What will be the output of the following JAVA snippet?
//
//				int x = 10;
//
//				if(x >= 10){
//
//				System.out.print(“YES ”);
//
//				}else if (x > 5){
//
//				System.out.print(“NO ”);
//
//				}
//		
//		Ans : YES
//		When the IF condition is true ELSE IF condition will not get executed.
		

}
