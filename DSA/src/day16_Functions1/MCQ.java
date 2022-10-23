package day16_Functions1;

public class MCQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Ques 1
//		
//		Tell the correct output:
//
//			public class Main {
//			    public static void fun() {
//			         System.out.println("World");
//			     }
//			    public static void main(String[] args) {
//			         System.out.print("Hello ");
//			         fun();
//			     }
//			}
//	
//		Ans : Hello World
//		
//---------------------------------------------------------------------------------------------------------------------------------
//
//		Ques 2
//		
//		JAVA method signature is a combination of _________.
//		
//		Ans : method name, and argument name.
//		
//---------------------------------------------------------------------------------------------------------------------------------
//
//		Ques 3
//		
//		What is the return type of a method that does not return any value?
//				
//		Ans : Return type of a method must be made void if it is not returning any value.
//		
//---------------------------------------------------------------------------------------------------------------------------------
//
//		Ques 4
//		
//		Tell the correct output:
//
//			public class Main {
//			    public static void fun(int a) {
//			         System.out.println("World");
//			     }
//			    public static void main(String[] args) {
//			         System.out.print("Hello ");
//			         fun();
//			     }
//			}
//		
//		Ans : Error,
//		Because fun have an argument int a, we are not passing it from main.
//		
//----------------------------------------------------------------------------------------------------------------------------------
//
//		Ques 5
//		
//		Tell the correct output :
//
//			public class Main {
//			    public static void fun(int a) {
//			         System.out.println("def");
//			        return;
//			         System.out.println(a + "ghi");
//			     } 
//			    public static void main(String[] args) {
//			         System.out.print("abc");
//			         fun(10);
//			     }
//			}
//			
//		Ans : Error,
//		Because the second S.O.P. in function is not reachable, so the compiler throws an error.
//		
//--------------------------------------------------------------------------------------------------------------------------------
//
//		Ques 6
//		
//		Tell the correct output :
//
//			public class Main {
//			    public static void fun(int a) {
//			         a = a + 10;
//			         System.out.print(a);
//			     }
//			    public static void main(String[] args) {
//			        int a = 10;
//			         System.out.print(a);
//			         fun(a);
//			         System.out.print(a);
//			     }
//			}
//			
//			Ans : 102010,
//			Because in the main function the value of a is 10, then in the fun function we add 10 more in the a variable 
//			so the value of a will be 20. But variable a inside the fun function is just a copy so the value of a 
//			in the main function does alter from this.
//		

	}

}
