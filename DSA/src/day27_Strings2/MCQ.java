package day27_Strings2;

public class MCQ {
	
//		Ques 1
//		
//		Predict the output of the following code?
//
//				class Main {
//
//				   public static void main(String args[]) {
//
//				       int ans = 'a' + 'B';
//
//				       System.out.println(ans);
//
//				   }
//
//				}
//		
//		Ans : 163. Right hand side calculation is done in integer manner only, the ascii value of ‘a’ is 97 and of ‘B’ is 66.
//		
//-------------------------------------------------------------------------------------------------------------------------------------------
//
//		Ques 2
//		
//		Predict the output of the following code?
//
//				class Main {
//
//				   public static void main(String args[]) {
//
//				       char ch1 = 'A';
//
//				       char ch2 = 'B';
//
//				       int ans = ch1 + ch2;
//
//				       System.out.println(ans);
//
//				   }
//
//				}
//				
//		Ans : 131. In the calculation ch1 + ch2, the ascii value of ch1 and ch2 is going to be used. Hence 65 + 66 is the answer.
//		
//------------------------------------------------------------------------------------------------------------------------------------------
//
//		Ques 3
//		
//		Which of the following is not a palindromic String?
//			1.	malayalam
//			2.	madam
//			3.	abba
//			4.	papa
//			
//		Ans : papa
//		
//-----------------------------------------------------------------------------------------------------------------------------------------
//
//		Ques 4
//		
//		How many vowels and consonants are present in String "helicopter"?
//
//		Ans : vowels = 4, consonants = 6. Vowels in helicopter are e,i,o,e and consonants are h,l,c,p,t,r.
//		
//-------------------------------------------------------------------------------------------------------------------------------------------
//
//		Ques 5
//		
//		What is the index of the first occurence of char 'a' in the String "malayalam"?
//				
//		Ans : 1st index
//		
//------------------------------------------------------------------------------------------------------------------------------------------
//
//		Ques 6
//		
//		What is the index of the last occurence of char 'a' in the String "malayalam"?
//				
//		Ans : 7th index
//		
//------------------------------------------------------------------------------------------------------------------------------------------
//
//		Ques 7
//		
//		Predict the output of the following code?
//
//				import java.util.*;
//				class Main {
//				   public static void main(String args[]) {
//				       Scanner scn = new Scanner(System.in);
//				       String s1 = scn.next();
//				       String s2 = scn.next();
//				       if(s1 == s2) {
//				           System.out.println("Strings are equal");
//				       }
//				       else {
//				           System.out.println("Strings are not equal");
//				       }
//				   }
//				}
//
//				Note : Input given is : Hello Hello
//				
//		Ans : Strings are not equal. Due to some logical reason(related to memory) Strings in Java must not be compared with == sign. 
//		To check whether two Strings are the same or not, write this line : s1.equals(s2) it will give true or false.
//		
//-----------------------------------------------------------------------------------------------------------------------------------------
//
//		Ques 8
//		
//		Predict the output of the following code?
//
//				String str = "hello";
//
//				String s = str.toUpperCase();
//
//				System.out.println(s);
//				
//		Ans : HELLO.
//		The function str.toUpperCase() returns the value of the string converted to uppercase.
//		
//---------------------------------------------------------------------------------------------------------------------------------------
//
//		Ques 9
//		
//		Predict the output of the following code?
//
//				String str = "HELLO";
//
//				String s = str.toLowerCase();
//
//				System.out.println(s);
//				
//		Ans : hello.
//		The function str.toLowerCase() returns the value of the string converted to lowercase.
//		
//---------------------------------------------------------------------------------------------------------------------------------------
//
//		Ques 10
//		
//		Predict the output of the following program?
//
//				class Main {
//
//				   public static void main(String args[]) {
//
//				       char ch1 = 'S';
//
//				       char ch2 = 'C';
//
//				       String s = ch1 + ch2 + "ALER";      
//
//				       System.out.println(s);
//
//				   }
//
//				}
//				
//		Ans : 150ALER is the correct answer.
//		ch1 + ch2 + “ALER” is going to execute from left to right, 
//		ch1 is ‘S’ i.e 83 and it is added to ‘C’ i.e 67 till now we got 150 which is getting added with a String “ALER”. 
//		So the final result is 150ALER.
//		
//-------------------------------------------------------------------------------------------------------------------------------------
//
//		Ques 11
//		
//		What will be the output of the following code?
//
//				class Main {
//
//				   public static void main(String args[]) {
//
//				       String str = "India";
//
//				       char ch = (int)str.charAt(0);
//
//				       System.out.println(ch);
//
//				   }
//
//				}
//				
//		Ans : Compilation Error, we can’t store an int into a char type variable.
//		
//--------------------------------------------------------------------------------------------------------------------------------------
//
//		Ques 12
//		
//		What will be the output of the following code?
//
//				class Main {
//
//				   public static void main(String args[]) {
//
//				       String str = "India";
//
//				       int ch = (int)str.charAt(0);
//
//				       System.out.println(ch);
//
//				   }
//
//				}
//				
//		Ans : 73. This ascii value of ‘I’ is 73. By writing (int)str.charAt(0) we are trying to typecast ‘I’ into int and 
//		that will give the ascii value of ‘I’.
//			

}
