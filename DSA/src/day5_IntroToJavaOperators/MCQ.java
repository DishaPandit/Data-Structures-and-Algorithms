package day5_IntroToJavaOperators;

public class MCQ {
	
//		Ques 1
//		
//		What is the output of the below Java code snippet?
//
//				int a = 2 - - 7;
//
//				System.out.println(a);
//		
//		Ans : 9
//		Minus of Minus is Plus. So 2 - - 7 becomes 2+7.
//			
//--------------------------------------------------------------------------------------------------------------------------------
//		
//		Ques 2
//		
//		What is the output of the Java code snippet?
//
//				boolean b = false;
//
//				b = !b;
//
//				System.out.println(b);
//		
//		Ans : The NOT operator is an operator that returns TRUE or 1 when the operand is FALSE or 0, and returns FALSE or 
//		0 when the operand is TRUE or 1. Since, the operand is false, the output would be true.
//			
//--------------------------------------------------------------------------------------------------------------------------------
//		
//		Ques 3
//		
//		What is the output of the Java code snippet?
//
//				int a=3, b=8;
//
//				boolean c = a > 5 && ++b > 6;
//
//				System.out.println(b);
//		
//		Ans : ++b>6 is not evaluated as the first operand itself is false. AND operator skips the second expression. Hence, the output will be 8.
//			
//--------------------------------------------------------------------------------------------------------------------------------
//		
//		Ques 4 
//		
//		Which of the following can be operands of arithmetic operators?
//				
//				Numeric
//				Boolean
//				Characters
//				Both Numeric and Characters
//		
//		Ans : Both Numeric and Characters
//			
//--------------------------------------------------------------------------------------------------------------------------------
//		
//		Ques 5
//		
//		What is the output of the following program :
//
//			int a = 20;
//
//			int b = 10;
//
//			System.out. print((a > b) && (b++ > 25));
//
//			System.out.println(b);
//			
//		Ans : false11
//		b is initialized with 10, in condition ((a > b) && (b++ > 25))
//		we have two parts, first is (a > b) and it is true so we check 
//		second part, i.e. (b++ > 25), so because of the ++ operator in 
//		the second check, the value of b will increase and it becomes 11 
//		and it is not greater than 25 so the second condition is false. 
//		Both the first and second condition are combined with the AND (&&)
//		operator and if both will be true then we can print “true” . 
//		Both statement are not “true” so first print statement will 
//		print “false” then value of b is 11 so second print statement 
//		will print 11
//			
//--------------------------------------------------------------------------------------------------------------------------------
//		
//		Ques 6
//		
//		What is the correct shorthand way to multiply the value present in variable x by 2 ?
//		
//		Ans : x *= 2
//			
//--------------------------------------------------------------------------------------------------------------------------------
//		
//		Ques 7
//		
//		What will be the output of the following program?
//
//				Scanner scn = new Scanner(System.in);
//
//				String s = scn.nextString();
//
//				System.out.println(s);
//
//				//Note : Value of “s” given by user is “Hello World”
//		
//		Ans : Compilation error
//		In java there is no method named nextString(), to input a string we must use next() or nextLine() method accordingly
//			
//--------------------------------------------------------------------------------------------------------------------------------
//		
//		Ques 8
//		
//		Which of the following statements are true?
//				
//				1. next() can read the input only till the space. It can't read two words separated by a space.
//				2. nextLine() reads input including space between the words i.e it reads till the end of line.
//				3. Java is a strictly typed language.
//				4. All of the Above
//		
//		Ans : All of the above
//		Why -> {All the statements are correct about Java.The next() method can read till a space, nextLine() 
//		method can read entire line with spaces in between words as well, 
//		and strictly typed language means we need to write data type while creating variables (eg. C++, Java)}
//			
//--------------------------------------------------------------------------------------------------------------------------------
//		
//		Ques 9
//		
//		What is the significance of using the "!” symbol?
//		
//		Ans : “!” sign in Java denotes Not, eg. “!=” means Not equals to
//			
//--------------------------------------------------------------------------------------------------------------------------------
//		
//		Ques 10
//		
//		What will be the output for the following program?
//
//				System.out. println(1 + 1 + 1 + 1 + 1 == 5);
//		
//		Ans : 1 + 1 + 1 + 1 + 1 == 5 because there is no string before numbers and 5 == 5, hence it is true
//			
//--------------------------------------------------------------------------------------------------------------------------------
//		
//		Ques 11
//		
//		Which of the following statements are true?
//				
//				1. x++ and ++x both are the same.
//				2. x++ executes the statement and then increments the value. ++x increments the value and then executes the statement.
//				3. ++x has higher precedence than x++
//				4. None of the above
//				
//		
//		Ans : 2
//		x++ and ++x both are the same.
//		Why wrong -> {Both have different meanings}
//
//		x++ executes the statement and then increments the value. ++x increments the value and then executes the statement.
//		Why Correct -> {This option is correct, ++x happens prior to assignment (pre-increment), but x++ happens after assignment (post-increment).}
//
//		++x has higher precedence than x++
//		Why wrong -> {Both have same precedence}
//			
//--------------------------------------------------------------------------------------------------------------------------------
//		
//		Ques 12
//		
//		What will be the output for the following JAVA program?
//
//				int a, b, c, d;
//
//				a = b = c = d = 20;
//
//				a += b -= c *= d /= 20;
//
//				System.out. println(“A = ” + a + “ B = ” + b + “ C = ” + c + “ D = ” + d);
//		
//		Ans : A = 20 B = 0 C = 20 D = 1
//		Expression will evaluate from right to left
//			
//--------------------------------------------------------------------------------------------------------------------------------
//		
//		Ques 13
//		
//		Which of the following statements are true?
//				
//				1. next() can read the input only till the space. It can't read two words separated by a space.
//				2. nextLine() reads input including space between the words i.e it reads till the end of line.
//				3. Java is a strictly typed language.
//				4. All of the Above
//		
//		Ans : All of the above
//		All the statements are correct about Java.The next() method can read till a space, 
//		nextLine() method can read entire line with spaces in between words as well, and 
//		strictly typed language means we need to write data type while creating variables (eg. C++, Java)
//			
//--------------------------------------------------------------------------------------------------------------------------------
//		
//		Ques 14
//		
//		What happens to the second operand/expression if the first operand is FALSE with the AND (&&) operator?
//		
//		Ans : Evaluation of Second Operand/Expression is Skipped, In AND (&&) operator, both operands should be TRUE to give output as true. 
//		If the first operand itself is false, then there is no point in evaluating the second expression.
//			
//--------------------------------------------------------------------------------------------------------------------------------
//		
//		Ques 15
//		
//		Which Scanner class method is used to read string value from the user?
//				
//		Ans : next() and nextLine()
//			
//--------------------------------------------------------------------------------------------------------------------------------

}
