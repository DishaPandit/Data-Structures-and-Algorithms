package day12_ForLoop2;

public class MCQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Ques 1
//		
//		For any two numbers N and i (where N >= i), if (N % i) == 0, then what is the relation between N and i?
//				
//		Ans : i is factor of N
//		
//---------------------------------------------------------------------------------------------------------------------------------
//
//		Ques 2
//		
//		Write the correct output for the following code :
//
//
//			import java.util.*;
//
//			public class Main {
//
//			public static void main(String[] args) {
//
//			int n = 20;
//
//			for (int i = 1; i <= n; i++) {
//
//			if (n % i == 0) {
//
//			System.out.print(i + " ");
//
//			}
//
//			}
//
//			}
//
//			}
//			
//		Ans : 1 2 4 5 10 20 is the correct answer, because we are printing i if n%i == 0, i.e. nothing but if i multiple of n we are printing i.
//					
//-------------------------------------------------------------------------------------------------------------------------------
//
//		Ques 3
//		
//		If A, B are two distinct prime numbers then the highest common factor of A & B will be
//		
//		Ans : HCF of two prime numbers is 1
//		
//-------------------------------------------------------------------------------------------------------------------------------
//
//		Ques 4
//		
//		The number of factors of a prime numbers are :
//			
//		Ans : Prime numbers have exactly 2 factors, 1 and Number itself
//		
//------------------------------------------------------------------------------------------------------------------------------
//
//		Ques 5
//		
//		A Highest Common Factor (HCF) of a,b is defined as _______.
//		
//		Ans : The HCF of two numbers is defined as the greatest integer that divides both a and b.
//		
//------------------------------------------------------------------------------------------------------------------------------
//
//		Ques 6
//		
//		A Least Common Multiple (LCM) of a, b is defined as _____.
//		
//		Ans : Definition of LCM(a, b) - smallest multiple of a and b.
		
------------------------------------------------------------------------------------------------------------------------------

//		Ques 7
//		
//		The relation between LCM and GCD is :
//			
//		Ans : As we know (n1 * n2) = LCM * GCD, which implies that LCM = (n1 * n2) / GCD
//		
//-----------------------------------------------------------------------------------------------------------------------------
//
//		Ques 8
//		
//		What keyword is used to end the current loop iteration and proceed execution with the next iteration of that loop?
//				
//		Ans : continue keyword used to end the loop iteration immediately and resume execution at the next iteration. So it is the correct option.
//		break keyword will stop the loop and cause the execution just after the loop body,
//		end and skip is not a valid keyword for JAVA
//
//----------------------------------------------------------------------------------------------------------------------------
//
//		Ques 9
//		
//		What if the output of the following program?
//
//				import java.util.*;
//
//				public class Main {
//
//				public static void main(String[] args) {
//
//				int i = 0;
//
//				for(i = 0; i < 10; i++) {
//
//				break;
//
//				}
//
//				System.out.println(i);
//
//				}
//
//				}
//				
//		Ans : 0 is correct output, When a break statement is encountered inside a loop, 
//		the loop is immediately terminated and the program control resumes at the next statement following the loop.
//		
//-----------------------------------------------------------------------------------------------------------------------------
//
//		Ques 10
//		
//		What is the output of the following program?
//
//				import java.util.*;
//
//				public class Main {
//
//				public static void main(String[] args) {
//
//				for(int i = 0; i <= 10; i++) {
//
//				if(i % 2 == 0) {
//
//				continue;
//
//				}
//
//				System.out.println(i);
//
//				}
//
//				}
//
//				}
//				
//		Ans : Program will print all odd numbers between 0 to 10.
//		Reason - for loop starts with 0 and goes up to 10, after that condition becomes false. 
//		Inside the loop, if-condition checks if the current value of variable i is divisible by 2 using the modulo operator. 
//		If it is 0, the current iteration is skipped using the continue keyword. If not, the number is odd then the value is printed.
//		
//----------------------------------------------------------------------------------------------------------------------------
//
//		Ques 11
//		
//		What is the output of the following program:
//
//			import java.util.*;
//
//			public class Main {
//
//			public static void main(String[] args) {
//
//			int i = 0;
//
//			for(i = 0; i < 10; i++) {
//
//			continue;
//
//			}
//
//			System.out.println(i);
//
//			}
//
//			}
//			
//		Ans : 10 is correct answer,
//		In JAVA, continue keywords makes a loop to skip the current iteration and continue with the next iteration. 
//		There will be a total of 10 iterations after which the value of i becomes 10 and 
//		that would make the for-loop condition false. So finally the value of variable i is 10 after the loop hence it will print 10.
//		
//---------------------------------------------------------------------------------------------------------------------------------
//
//		Ques 12
//		
//		From where a break statement causes an exit?
//				
//		Ans : From the loop on which it is written.
//

	}

}
