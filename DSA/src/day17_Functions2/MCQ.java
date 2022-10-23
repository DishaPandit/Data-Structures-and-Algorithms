package day17_Functions2;

public class MCQ {

//		Ques 1
//		
//		What should be the correct declaration for a function which returns true if given number if even otherwise false?
//				
//		Ans : static boolean checkEven(int n) is the correct declaration of the asked function.
//		
//-----------------------------------------------------------------------------------------------------------------------------------------
//
//		Ques 2
//		
//		What is the output of the following code ?
//
//				class Main {
//
//				   static void func(int n) {
//
//				       return;
//
//				       System.out.print(n);
//
//				   }
//
//
//				   public static void main(String args[]) {
//
//				       int n = 5;
//
//				       func(n);
//
//				   }
//
//				}
//		
//		Ans : Compilation Error.
//		Line System.out.print(n) is an unreachable statement due to the return word.
//				
//-----------------------------------------------------------------------------------------------------------------------------------------
//
//		Ques 3 
//		
//		What is the output of the following code?
//
//				class Main {
//
//				   static void func(int n) {
//
//				       System.out.print(n);
//
//				       return;
//
//				   }
//
//				  
//				   public static void main(String args[]) {
//
//				       int n = 5;
//
//				       func(n);
//
//				   }
//
//				}
//				
//		Ans : 5 
//		
//---------------------------------------------------------------------------------------------------------------------------------------
//
//		Ques 4 
//		
//		What should be the correct declaration for a function which returns smaller out of 2 given numbers?
//				
//		Ans : static int smaller(int a,int b) is the correct declaration.
//		
//---------------------------------------------------------------------------------------------------------------------------------------
//
//		Ques 5
//		
//		What is the output of the following code?
//
//				class Main {
//
//				   static int smaller(int a,int b) {
//
//				       if(a < b) {
//
//				           return a;
//
//				       }
//
//				       else {
//
//				           return b;
//
//				       }
//
//				   }
//
//				  
//
//				   public static void main(String args[]) {
//
//				       int a = 20,b = 45;
//
//				       smaller(a,b);
//
//				   }
//
//				}
//				
//		Ans : None. Nothing will get printed as we just made a call to the smaller function, the returned value is not getting printed anywhere.
//		
//----------------------------------------------------------------------------------------------------------------------------------------
//
//		Ques 6
//		
//		What is the output of the following code ?
//
//				class Main {
//
//				   static void func(int n) {
//
//				       System.out.print(n);
//
//				       return 1;
//
//				   }
//
//				  
//
//				   public static void main(String args[]) {
//
//				       int n = 5;
//
//				       func(n);
//
//				   }
//
//				}
//				
//		Ans : Error. Return type of the function func is void se we can’t return int from it.
}
