package day10_WhileLoop2;

public class MCQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Ques 1
//		
//		Select the correct option?
//				
//				1. Odd numbers are divisible by 2, even numbers are not divisible by 2.
//				2. Odd numbers are not divisible by 2, even numbers are divisible by 2.
//				3. Even numbers are 0,1,2,3,4….
//				4. None
//				
//		Ans - Correct answer → Odd numbers are not divisible by 2 eg. 1,3,5,7….
//		Even numbers are divisible by 2 eg. 0,2,4,6….
//		
//-----------------------------------------------------------------------------------------------------
//
//		Ques 2
//		
//		What will be the output of the following code?
//
//				class Main{
//
//				    public static void main(String[] args) {
//
//				         for(int i = 0; i <= 8;i++) {
//
//				             if(i % 2 == 0) {
//
//				                 System.out.print(i+1 + “ ”);
//
//				             }
//
//				         }
//
//				    }
//
//				}
//		
//		Ans - Correct ans → 1 3 5 7 9
//		We will come inside if condition when i = 0,2,4,6,8 and everytime we are printing i+1, so the answer is 1 3 5 7 9.
//	
//----------------------------------------------------------------------------------------------------

//		Ques 3
//		
//		What is the last digit of number 9784?
//				
//		Ans - 4
//		
//-----------------------------------------------------------------------------------------------------
//
//		Ques 4
//		
//		Given n = 19305, What is the sequence of digits from left to right?
//				
//		Ans - 1 9 3 0 5
//		
//----------------------------------------------------------------------------------------------------
//
//		Ques 5
//		
//		Given n, what is the correct option to extract the rightmost digit (least significant digit) of n?
//				
//		Ans - Correct answer → int d = n % 10 will give the rightmost digit.
//		Example n = 1985, n % 10 will give 5.
		
//-----------------------------------------------------------------------------------------------------
		
//		Ques 6
//		
//		What is the output for following Code?
//
//				import java.util.*;
//				class Main { 
//				    public static void main(String args[]) { 
//				        int n = 34562;
//				        int sum = 0;
//				        while(n > 0) {
//				            int ld = n % 10;
//				             sum += 1;
//				             System.out.print(ld + " ");
//				             n = n / 10;
//				         }
//				        System.out.print(sum);
//				     }
//				}
//				
//		Ans - Correct Output → 2 6 5 4 3 5
//		Because inside the loop we are printing the last digit, then after the loop, we are printing sum i.e. nothing but count of digits.
//		
//----------------------------------------------------------------------------------------------------
//
//		Ques 7
//		
//		What is the correct output ?
//
//				import java.util.*;
//				class Main { 
//				    public static void main(String args[]) { 
//				        int n = 25364;
//				        int sum = 0;
//				        while(n > 0) {
//				            int ld = n % 10;
//				             sum += ld;
//				             System.out.print(ld + " ");
//				             n = n / 10;
//				         }
//				         System.out.print(sum);
//				     }
//				}
//				
//		Ans - Correct Output → 4 6 3 5 2 20
//		Because inside the loop we are printing the last digit, then after the loop, we are printing the sum of the digits.
//		
//---------------------------------------------------------------------------------------------------
//
//		Ques 8
//		
//		What is the correct output for the following code :
//
//			import java.util.*;
//			class Main {
//			    public static void main(String args[]) { 
//			        while(true) {
//			             System.out.println("Hello");
//			         }
//			     }
//			}
//			
//		Ans - Correct Output → Print “Hello” infinite times, because condition is always true
//		
//---------------------------------------------------------------------------------------------------
//
//		Ques 9
//		
//		What is the correct output for following code:
//
//			import java.util.*;
//			class Main {
//			    public static void main(String args[]) {
//			        int n = 3;
//			        while(n-- >= 0) {
//			             System.out.println("Hello");
//			         }
//			    }
//			}
//			
//		Ans - Correct Output → Print “Hello” 4 times
//		Because n is starting from 3 and iterates until unless n– is greater than equal to 0, so it will iterate 4 times and print “Hello”.
//		
//--------------------------------------------------------------------------------------------------
//
//		Ques 10
//		
//		What are the perfect squares numbers?
//				
//		Ans - Correct Output → All Numbers for which they have integer square roots are known as perfect squares.
//		
//		


		
		

	}

}
