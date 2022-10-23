package day26_Strings1;

public class MCQ {
	
//		Ques 1
//		
//		How to find the length of a given String in Java?
//				
//		Ans : int len = str.length();
//		
//-----------------------------------------------------------------------------------------------------------------------------
//
//		Ques 2
//		
//		What will be the output of the following code?
//
//				class Main {
//
//				   public static void main(String args[]) {
//
//				       String str = "India";
//
//				       char ch = str.charAt(1);
//
//				       System.out.println(ch);
//
//				   }
//
//				}
//
//		Ans : str.charAt(1) will give the character present at 1st index i.e n.
//		
//-----------------------------------------------------------------------------------------------------------------------------
//
//		Ques 3
//		
//		What is the correct condition to check whether a given character is Uppercase or not?
//				
//		Ans : ch >= ‘A’ && ch <= ‘Z’ is the correct condition to check for Uppercase.
//		
//-----------------------------------------------------------------------------------------------------------------------------
//
//		Ques 4
//		
//		What will be the output of the following code?
//
//				import java.util.*;
//
//				class Main {
//
//				  public static void main(String args[]) {
//
//				      Scanner scn = new Scanner(System.in);
//
//				      String str = scn.next();
//
//				      System.out.println(str);
//
//				  }
//
//				}
//
//
//		Note : Input provided is - Welcome to Strings world!
//		
//		Ans : Welcome. 
//		scn.next() reads the content till white space only so the value of str is Welcome.
//		
//----------------------------------------------------------------------------------------------------------------------------
//
//		Ques 5
//		
//		Is the following statement correct according to Java?
//
//		String s = 'a' + 'b';
//		
//		Ans : Incorrect, right hand side calculation is done as int + int, compiler will treat ‘a’ as 97 and ‘b’ as 98 the sum is 195. 
//		But we can’t store an integer directly to a string.
//		
//-----------------------------------------------------------------------------------------------------------------------------
//
//		Ques 6
//		
//		Predict the output of the following code?
//
//				class Main {
//
//				   public static void main(String args[]) {
//
//				       char ch1 = 's';
//
//				       char ch2 = 'r';
//
//				       String s1 = "cale";
//
//				       String s2 = ch1 + s1 + ch2;
//
//				       System.out.println(s2);
//
//				   }
//
//				}
//		
//		Ans : ‘s’ + “cale” + ‘r’ , so the correct answer is scaler.
//		
//-------------------------------------------------------------------------------------------------------------------------------
//
//		Ques 7
//		
//		What will be the output of the following code?
//
//				import java.util.*;
//
//
//				class Main {
//
//				  public static void main(String args[]) {
//
//				      Scanner scn = new Scanner(System.in);
//
//				      String str = scn.nextLine();
//
//				      System.out.println(str);
//
//				  }
//
//				}
//
//		Note : Input provided is - Welcome to Strings world!
//		
//		Ans : Welcome to String world! is the correct answer.
//		scn.nextLine() reads the complete line.
//		
//------------------------------------------------------------------------------------------------------------------------------
//
//		Ques 8
//		
//		Is the following code correct according to Java?
//
//				String s1 = "Hello";
//
//				String s2 = " World!";
//
//				String s = s1 + s2;
//				
//		Ans : This piece of code is correct and the value of s is “Hello World!”.
//		
//------------------------------------------------------------------------------------------------------------------------------
//
//		Ques 9
//		
//		Predict the output of the following code?
//
//				class Main {
//
//				   public static void main(String args[]) {
//
//				      String s1 = "Hello";
//
//				      String s2 = " World!";
//
//				      String s = 100 + 20 + " " + s1 + s2;
//
//				      System.out.println(s);
//
//				   }
//
//				}
//			
//		Ans : 120 Hello World! is the correct answer. 
//		Expression will be evaluated from left to right, 100 + 20 is calculated as 120 then the space and s1 , s2 will be appended to it.
//		
//----------------------------------------------------------------------------------------------------------------------------------
//
//		Ques 10
//		
//		Can we change the characters of a String in Java?
//		
//		Ans : Strings are immutable(can’t change the content of string) in Java.


}
