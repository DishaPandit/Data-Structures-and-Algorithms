package day7_IfElse2;

public class MCQ {
	
//		Ques 1
//		
//		An ELSE statement must be preceded by ___ statement in Java.
//		
//		Ans : It can be either preceded by IF or ELSE if statement.
//			
//--------------------------------------------------------------------------------------------------------------------------------------------
//		
//		Ques 2
//		
//		What is the output of the Java program?
//
//				int horses = 10;
//
//				int camels = 5;
//
//				if(horses < 5)
//
//				{
//
//				System.out.println("TOWN");
//
//				}
//
//				else if(horses >=5)
//
//				System.out.print("FOREST ");
//
//				System.out.println("AMAZON");
//
//				else
//
//				System.out.println("UNKNOWN");
//		
//		Ans : Compilation error
//		IF or ELSE-IF statements can contain only one statement without braces { }.
//		So, line “System.out.println(“AMAZON”);” is not under the ELSE-IF block, 
//		and hence there is no IF statement before the ELSE statement, which is the reason for compilation error.
//
//--------------------------------------------------------------------------------------------------------------------------------------------
//
//		Ques 3
//		
//		What will happen when you compile and run the following code?
//
//				int temperature = 33;
//
//				if(temperature < 0)
//
//				System.out.println("Freezing");
//
//				else if(temperature < 30)
//
//				System.out.println("Pleasant");
//
//				else if(temperature < 50)
//
//				System.out.println("Hot");
//
//				else
//
//				System.out.println("Boiling");
//		
//		Ans : Since, temperature is greater than 30 and less than 50 the output would be Hot.
//			
//--------------------------------------------------------------------------------------------------------------------------------------------
//		
//		Ques 4
//		
//		What would be the output of the following code snippet if variable a=10?
//
//				if(a<=0)
//
//				{
//
//				if(a==0){
//
//				System.out.println("1 ");
//
//				}
//
//				else{
//
//				System.out.println("2 ");
//
//				}
//
//				}
//
//				System.out.println("3 ");
//		
//		Ans : 3
//		Since the first if condition is not met, control would not go inside the if statement 
//		and hence only the statement after the entire if block will be executed.
//		
//--------------------------------------------------------------------------------------------------------------------------------------------
//
//		Ques 5
//		
//		What will be the output of the following program?
//
//				boolean male = false;
//
//				int age = 30;
//
//				if( male )
//
//				if( age < 20 )
//
//				System.out.println("Boy");
//
//				else
//
//				System.out.println("Man");
//
//				else
//
//				if( age < 20 )
//
//				System.out.println("Girl");
//
//				else
//
//				System.out.println("Woman");
//		
//		Ans : Since, male is false else block would run and since the age is not less than 20 again 
//		the else block would run and hence the output would be Woman.
//			
//--------------------------------------------------------------------------------------------------------------------------------------------
//	
//		Ques 6
//		
//		What will be the output of the following program?
//
//				int marks = 80;
//
//				if( marks > 70 ){
//
//				System.out.print("Distinction ");
//
//				System.out.print("Congratulations ");
//
//				}else if( marks > 35 ){
//
//				System.out.print("Pass ");
//
//				}else
//
//				System.out.print("Fail ");
//
//				System.out.println("Better luck next time");
//		
//		Ans : Distinction Congratulations Better luck next time
//		Since, marks are greater than 70, So the first if condition will be executed and since 
//		else can only contain one statement without braces {}, So the last statement will always get executed.
//			
//--------------------------------------------------------------------------------------------------------------------------------------------
//		
//		Ques 7
//		
//		What is the value of grade when the following code executes and score is 80?
//
//				if (score >= 90) grade = "A";
//
//				if (score >= 80) grade = "B";
//
//				if (score >= 70) grade = "C";
//
//				if (score >= 60) grade = "D";
//
//				else grade = "E";
//		
//		Ans : D
//		Each of the if statements will be executed. So the grade will be set to B then C and finally D.
//			
//--------------------------------------------------------------------------------------------------------------------------------------------
//	
//		Ques 8
//		
//		State TRUE or FALSE:
//			
//			“An ELSE or ELSE-IF statement in Java can not exist alone without an IF statement.”
//		
//		Ans : True
//			
//--------------------------------------------------------------------------------------------------------------------------------------------
//		
//		Ques 9
//		
//		What will be the output of the following code?
//
//				int x = 15;
//
//				if(x > 10){
//
//				x++;
//
//				if(x == 16){
//
//				System.out.println(“UPDATED”);
//
//				}else if(x == 15){
//
//				System.out.println(“NO CHANGE”);
//
//				}
//
//				}else{
//
//				System.out.println(“YES”);
//
//				}
//		
//		Ans : Because of statement x++ the value of x is updated to 16 and hence the output would be UPDATED.
//		
//---------------------------------------------------------------------------------------------------------------------------------------------

		

}
