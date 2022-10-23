package day11_ForLoop1;

public class MCQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Ques 1
//		
//		Select the correct order for Structure of for-loop?
//
//				for(1. ; 2. ; 3. ){
//				    // loop statement/work
//				}
//		
//		Ans : 1- Initialisation, 2- Condition Check ,3- Update is correct answer.
//		
//------------------------------------------------------------------------------------------------
//
//		Ques 2
//		
//		What is the correct output for following code :
//
//			import java.util.*;
//			public class Main {
//			    public static void main(String[] args) {
//			        for(int i = 1; i < 10; ) {
//			             System.out.print(i + " ");
//			             i++;
//			         }
//			     }
//			}
//			
//		Ans : 1 2 3 4 5 6 7 8 9 is correct answer.
//		Because loop starts from 1 and iterates until unless i is less than 10, and incrementation is inside the loop.
//		
//------------------------------------------------------------------------------------------------
//
//		Ques 3
//		
//		What is the correct output for following code :
//
//			import java.util.*;
//			public class Main {
//			    public static void main(String[] args) {
//			        for(int i = 1; i <= 10; i++) {
//			             System.out.print(i + " ");
//			             i++;
//			         }
//			     }
//			}
//			
//		Ans : 1 3 5 7 9 is correct output.
//		Because loop is start from 1 and after printing we are increasing the value of i by 1 inside the loop and 
//		it is also increasing in update section of loop, 
//		that means overall update is equivalent to i = i + 2, so it always print odd numbers.
//		
//-------------------------------------------------------------------------------------------------
//
//
//		Ques 4
//		
//		What is the correct output for following code :
//
//			import java.util.*;
//			public class Main {
//			    public static void main(String[] args) {
//			        for(int i = 1; i <= 10; i++) {
//			             System.out.print(i + 1 + " ");
//			             i++;
//			         }
//			     }
//			}
//			
//		Ans : 2 4 6 8 10 is correct output.
//		Because loop is start from 1 and and we are printing (i + 1) then we are increasing the value of i by 1 inside the loop and 
//		it is also increasing in update section of loop, that means overall update is equivalent to i = i + 2, so it always print even numbers.
//		
//--------------------------------------------------------------------------------------------------------
//
//		Ques 5
//		
//		What is the correct output for following code :
//
//			import java.util.*;
//			public class Main {
//			    public static void main(String[] args) {
//			        for(int i = 10; i > 0; ) {
//			             i--;
//			             System.out.print(i + " ");
//			         }
//			     }
//			}
//			
//		Ans : 9 8 7 6 5 4 3 2 1 0 is correct answer.
//		Because loop is starting from 10, but inside the loop we are decreasing the value of i then printing it, 
//		so first time it will print 9 ans then same happened till i = 1 and in that case it will print 0 in last.
//		
//----------------------------------------------------------------------------------------------------------------------------
		
//		Ques 6
//		
//		What is the correct output for following code :
//
//			import java.util.*;
//			public class Main {
//			    public static void main(String[] args) {
//			        int i = 0;
//			        for(i = 0; i < 5; i++) {
//			         }
//			         System.out.print(i + " ");
//			     }
//			}
//			
//		Ans : 5 is correct answer,
//		Loop is starting from i = 0 and iterates until unless i is less than 5, when i is equal to 5, loop will stop and at that time value of i is 5.
//		
//---------------------------------------------------------------------------------------------------------------------------
//
//		Ques 7
//		
//		What is the correct output for following code :
//
//			import java.util.*;
//			public class Main {
//			    public static void main(String[] args) {
//			        for(int i = 10; i <= 5; i--) {
//			             System.out.print(i + " ");
//			         }
//			     }
//			}
//			
//		Ans : No Output is correct answer.
//		In initialisation i = 10, and condition is i <= 5, which is false, so we stop the loop.
//		
//------------------------------------------------------------------------------------------------------------------------
//
//		Ques 8
//		
//		What is the correct output for following code :
//
//			import java.util.*;
//			public class Main {
//			    public static void main(String[] args) {
//			        for(int i = 1; i <= 10; i++) {
//			             System.out.print(i++ + " ");
//			         }
//			     }
//			}
//			
//		Ans : 1 3 5 7 9 is correct answer
//		Loop is start from i = 1 and iterates till i <= 10, inside loop it is i++, so we print i and 
//		then increase the value of i, and i is also increasing in update section of loop, 
//		that means overall update is equivalent to i = i + 2, so it always print odd numbers from 1 to 10.
//		
//------------------------------------------------------------------------------------------------------------------------
//
//		Ques 9
//		
//		How many times does the following loop print “Hello”?
//
//				import java.util.*;
//				public class Main {
//				    public static void main(String[] args) {
//				        for(int i = 1; i <= 20; i = i * 2) {
//				             System.out.print("Hello ");
//				         }
//				     }
//				}
//				
//		Ans : 5 times is correct answer,
//		‘i’ is starting from 1 and update statement is i = i * 2, that means 
//		the value of ‘i’ is increasing as i = 1, 2, 4, 8, 16, 32, so the condition is true only 5 times, so Hello print only 5 times.
//
//--------------------------------------------------------------------------------------------------------------------------------
//
//		Ques 10
//		
//		What is the correct output for following code :
//
//			import java.util.*;
//			public class Main {
//			    public static void main(String[] args) {
//			        for(int i = 11; i < 10; i++) {
//			             System.out.print(100 / 0);
//			         }
//			     }
//			}
//			
//		Ans :  No Output is correct answer.
//		Because, 100 / 0 is not a syntax error, so it can be detectable in run time error, but statement inside for-loop 
//		in unreachable due to initial value and condition of for-loop, so it doesn’t throw any error and also not print any output.
//

	}

}
