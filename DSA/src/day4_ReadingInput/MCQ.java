package day4_ReadingInput;

public class MCQ {
	
//		Ques 1
//		
//		Which is the smallest integer data type?
//				
//		Ans : byte
//		
//----------------------------------------------------------------------------------------------------------------------------------------
//
//		Ques 2
//		
//		What is the output of the below Java code snippet?
//
//				float a = 8.2/2;
//
//				System.out.println(a);
//				
//		Ans : Add a suffix f or F: float a = 8.2f/2;
//		(or)
//		explicit typecast: float a = (float)8.2/2;
//
//----------------------------------------------------------------------------------------------------------------------------------------
//
//		Ques 3
//		
//		Which among the following is not a Data Type in JAVA ?
//				short
//				int
//				long double
//				double
//				
//		Ans : long double
//		
//----------------------------------------------------------------------------------------------------------------------------------------
//
//		Ques 4
//		
//		What should be the output of the following code ?
//
//				int a = 10, b = 5; //1
//
//				int c = (a * 1.0) / b; //2
//
//				System.out. println(c); //3
//				
//		Ans : (a*1.0) will give a double value and double/int will give a double value but we are storing it in an int variable.
//
//----------------------------------------------------------------------------------------------------------------------------------------
//
//		Ques 5
//		
//		What is the Type Conversion available in JAVA language?
//				
//		Ans : We can convert small range data type into wide range and also wide range data type into small range data type
//
//----------------------------------------------------------------------------------------------------------------------------------------
//
//		Ques 6
//		
//		What is the result of a Narrowing Type Conversion in JAVA?
//			
//		Ans : int a = (int)1.2f; // now a holds only 1 hence we loss some data
//
//----------------------------------------------------------------------------------------------------------------------------------------
//
//		Ques 7
//		
//		What is the result of a Widening Type Conversion in JAVA?
//				
//		Ans : int a = 456; float b = a; // no change of data, b holds 456.0
//
//----------------------------------------------------------------------------------------------------------------------------------------
//
//		Ques 8
//		
//		Which of the following automatic type conversion will be possible?
//				float to int
//				int to long
//				long to int
//				double to int
//				
//		Ans : In Automatic Type conversion, a lower data type is promoted to a higher type present in the expression. 
//		Higher type is never promoted to lower type automatically to prevent data loss.
//
//----------------------------------------------------------------------------------------------------------------------------------------
//
//		 Ques 9
//		 
//		 What is the output of the below Java code snippet?
//
//				 float a = 8.2/2;
//
//				 System.out.println(a);
//				 
//		Ans : It will give compilation error. Lossy conversion from double to float. Add a suffix f or F: float a = 8.2f/2;
//		(or)
//		explicit typecast: float a = (float)8.2/2;
//		
//----------------------------------------------------------------------------------------------------------------------------------------
//		
//		Ques 10
//		
//		The given code gives a compilation error. Which of the following changes will remove the compilation error.
//
//		int a = 10, b = 5; //1
//
//		int c = (a * 1.0) / b; //2
//
//		System.out. println(c); //3
//		
//		1. Change line 2 as : float c = (a * 1.0) / b;
//		2. Change line 2 as : double c = (a * 1.0) / b;
//		3. Change line 2 as : int c = a / b;
//		4. Both second and third options are correct
//		
//		Ans : Why first option is wrong -> {right hand side is calculated as double, we won’t be able to store double in float data type}
//		Fourth option is correct because -> {In option ii, rhs is double and we are storing it in double data type as well. In option iii, 
//		rhs is int and we are storing it in int data type.}
//		
//----------------------------------------------------------------------------------------------------------------------------------------
//		
//		Ques 11
//		
//		Which of the following is incorrect ?
//				
//				int n = scn.nextInt();
//				float n = scn.nextInt();
//				double n = scn.nextFloat();
//				float n = scn.nextDouble();
//				
//		Ans : We can store a small sized data type in a big sized data type container but can’t do vice-versa. 4th is incorrect
//----------------------------------------------------------------------------------------------------------------------------------------
//
//		Ques 12
//		
//		What is the output of the JAVA code snippet?
//
//
//				int a = 10, b = 5, c = 3;
//
//				int d = a + c / 2 * b;
//
//				System.out.println(d);
//				
//		Ans : 15 is Correct because → {/ and * have equal priority. 
//		So associativity of Left to Right is used. Remember that 3/2 is 1 not 1.5 as both operands are integers.}

}
