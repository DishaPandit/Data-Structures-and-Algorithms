package day9_WhileLoop1;

public class MCQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ques 1
		
//		Choose the correct syntax of the WHILE loop in Java below.
//		1.
//		while(condition) {
//
//		//statements
//
//		}
//		
//		2.
//		while(condition);
//		{
//
//		//statements
//
//		}
//		
//		3.
//		while {
//
//		//statements
//
//		}(condition)
//		
//		4.
//		None
		
		//Ans - 1
		
//-------------------------------------------------------------------------------------------------
		
		//Ques 2
		
//		State TRUE or FALSE.
//
//		“A WHILE loop in Java executes the statements at least once even if the condition is not satisfied.”

		//Ans - False
		
//-------------------------------------------------------------------------------------------------
		
		//Ques 3
		
//		Every loop in Java has a condition that should be ___ in order to proceed for execution.
		
		//Ans - true
		
//-------------------------------------------------------------------------------------------------
		
		//Ques 4
		
//		What is the output of the below JAVA program?
//
//				int a=1;
//
//				while(a<4)
//
//				{
//
//				System.out.print(a + " ");
//
//				a++;
//
//				}
//		
		//Ans - This loop will work until a becomes 4 and hence, the output would be 1 2 3. a++; yields to a=a+1;
		
//------------------------------------------------------------------------------------------------
		
		//Ques 5
		
//		What is the output of the below JAVA program?
//
//				int a=4;
//
//				while(a>0)
//
//				{
//
//				a--;
//
//				System.out.print(a + " ");
//
//				a--;
//
//				}
		
		//Ans - Since 4 > 0, Line1 will execute and decrease the value of a to 3, line2 will print 3 and again Line3 will change the value to 2.
		//2 > 0, Line1 will execute and decrease the value of a to 1, line2 will print 1 and again Line3 will change the value to 0.
		//And hence the loop will be terminated giving output 3 1.
		
//-------------------------------------------------------------------------------------------------
		
		//Ques 6
		
//		What is the output of the below program?
//
//				int num = 2;
//
//				int i=0;
//
//				while(i<5)
//
//				{
//
//				System.out.print(num * i + " ");
//
//				i++;
//
//				}
		
		//Ans - I is starting from 0, and num is starting from 2, i is increasing every time by 1, num is fixed.

//				i = 0  print(i*num) 0
//				i = 1  print(i*num) 2
//				i = 2  print(i*num) 4
//				i = 3  print(i*num) 6
//				i = 4  print(i*num) 8
		
//-------------------------------------------------------------------------------------------------
		
		//Ques 7
		
//		What will be the output of the JAVA program?
//
//				int i = 0;
//
//				while(i < 4){
//
//				if(i % 2 == 0){
//
//				System.out.print(“YES ”);
//
//				}else{
//
//				System.out.print(“NO “);
//
//				}
//
//				i += 2;
//
//				}
		
		//Ans - Initially, the value of i is 0 (i.e. even) hence YES will be printed then the value of i is incremented to 2 (i.e. even) again YES will be printed and 
		//then i will be incremented to 4 and hence the loop will be terminated.
		
//-------------------------------------------------------------------------------------------------
		
		//Ques 8
		
//		How many times will Line 1 be executed in the following loop?
//
//				int x = 6;
//
//				while(x > 0){
//
//				System.out.print(“YES ”); // Line 1
//
//				x = x/2;
//
//				}
		
		//Ans - Since, the value of x is being reduced to half, hence 6 → 3 → 1 → 0, and the loop will be terminated. Hence, Line 1 will be executed 3 times.
		
//------------------------------------------------------------------------------------------------
		
		//Ques 9
		
//		What will be the output of the following JAVA snippet?
//
//				int a = 5;
//
//				int b = 15;
//
//				while(b != a){
//
//				System.out.print(“TRUE “);
//
//				b -= 10;
//
//				}
//
//				System.out.print(“FALSE “);
		
		//Ans - The statements inside the while loop will only be executed once because after that b is reduced to 5 and the loop will terminate. 
		//Hence the output is TRUE FALSE.
	}

}
