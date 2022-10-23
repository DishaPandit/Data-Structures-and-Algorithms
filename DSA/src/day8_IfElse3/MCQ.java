package day8_IfElse3;

public class MCQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ques 1
		
//		What will be printed if x=3, y=5, z=2:
//
//			if (x < y && x < z){
//
//			System.out.println("a");
//
//			}
//
//			else if ( y < x && y < z){
//
//			System.out.println("b");
//
//			}
//
//			else{
//
//			System.out.println("c");
//
//			}
		
		//Ans - c
		
//------------------------------------------------------------------------------------------------------
		
		//Ques 2
//		What is the output of the following code?
//
//				if(4+5 == 10){
//
//				System.out.print("True ");
//
//				}
//
//				else{
//
//				System.out.print("False ");
//
//				}
//
//
//				System.out.print("True");
		
		//Ans - False True
		
//------------------------------------------------------------------------------------------------------

		//Ques 3
//		​​How many unique combinations are possible in a number lock having 3 strips 
//		where each strip contains numbers from 0 to 9?
		
		//Ans - 1000

//------------------------------------------------------------------------------------------------------

		//Ques 4
		
//		What is the output of the following code?
//
//				public class ScopeOfVariables{
//
//				public static void main(String[ ] args){
//
//				int x = 10;
//
//				int y = 20;
//
//				{
//
//				System.out.print(x + ", " + y);
//
//				}
//
//				{
//
//				System.out.print(" - " + x + ", " + y);
//
//				}
//
//				System.out.print(" - " + x + ", " + y);
//
//				}
//
//				}
		
		//Ans - The value of x, y remains constant in each block since they have been declared in outer most scope
		
//------------------------------------------------------------------------------------------------------

		//Ques 5
//		What is meant by dry running code ?
		
		//Ans  - Run code with pen and paper
		
//------------------------------------------------------------------------------------------------------

		//Ques 6
		
//		What will be the output of the following code?
//
//				public class ScopeOfVariables{
//
//				public static void main(String[ ] args){
//
//				int x = 10;
//
//				int y = 20;
//
//				{
//
//				y = 25;
//
//				System.out.print(x + “, “ + y);
//
//				}
//
//				{
//
//				System.out.print(“ - “ + x + “, “ + y);
//
//				}
//
//				System.out.print(“ - “ + x + “, “ + y);
//
//				}
//
//				}
		
		//Ans - 10, 25 - 10, 25 - 10, 25
		
//------------------------------------------------------------------------------------------------------
		
		//Ques 7
		
//		What is the output of the following code?
//
//				public class ScopeOfVariables{
//
//				public static void main(String[ ] args){
//
//				int x = 10;
//
//				int y = 20;
//
//				{
//
//				y = 15;
//
//				System.out.print(x + “, “ + y);
//
//				}
//
//				{
//
//				x = 15;
//
//				System.out.print(“ - “ + x + “, “ + y);
//
//				}
//
//				System.out.print(“ - “ + x + “, “ + y);
//
//				}
//
//				}
		
		//Ans : 10, 15 - 15, 15 - 15, 15
		
//------------------------------------------------------------------------------------------------------

		//Ques 8
		
//		What will be the output of the following code?
//
//				public class ScopeOfVariables{
//
//				public static void main(String[ ] args){
//
//				int x = 10;
//
//				int y = 20;
//
//				{
//
//				System.out.print(x + “, “ + y);
//
//				}
//
//				{
//
//				x = 15;
//
//				System.out.print(“ - “ + x + “, “ + y);
//
//				}
//
//				System.out.print(“ - “ + x + “, “ + y);
//
//				}
//
//				}
		
		//Ans - 10, 20 - 15, 20 - 15, 20
		
//------------------------------------------------------------------------------------------------------
	
		//Ques 9
		
//		What will be the output of the following code?
//
//				public class ScopeOfVariables{
//
//				public static void main(String[ ] args){
//
//				int x = 10;
//
//				{
//
//				int y = 20;
//
//				System.out.print(x + “, “ + y);
//
//				}
//
//				{
//
//				y = 10;
//
//				x = 15;
//
//				System.out.print(“ - “ + x + “, “ + y);
//
//				}
//
//				System.out.print(“ - “ + x + “, “ + y);
//
//				}
//
//				}
//		
		
		//Ans : Since, the variable y is out of scope for the statement (y = 10), so the following compilation error will be displayed:
		//error: cannot find symbol

//------------------------------------------------------------------------------------------------------

		//Ques 10
		
//		What will be the output of the following code?
//
//				public class LifeTime{
//
//				public static void main(String[ ] args){
//
//				if(true){
//
//				int x = 10;
//
//				System.out.print(“Value of X = “ + x);
//
//				x++;
//
//				}
//
//				System.out.print(“ Value of X = “ + x);
//
//				}
//
//				}
		
		//Ans - Since, the variable x is out of scope for the statement (System.out.print(“ Value of X = “ + x)), so the following compilation error will be displayed:
		//error: cannot find symbol

//------------------------------------------------------------------------------------------------------

		//Ques 11
		
//		What will be the output of the following code?
//
//				public class scope{
//
//				public static void main(String[ ] args){
//
//				int a = 0;
//
//				{
//
//				int b = 10;
//
//				System.out.print(“b = “ + b);
//
//				int c = b + a;
//
//				System.out.print(“, c = “ + b);
//
//				}
//
//				a = c + b;
//
//				System.out.print(“, a = “ + a);
//
//				}
//
//				}
		
		//Ans - Since, the variables b and c are out of scope for the statement (a = c + b), so the following compilation error will be displayed:
		//error: cannot find symbol

	}

}
