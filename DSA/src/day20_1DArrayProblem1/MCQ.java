package day20_1DArrayProblem1;

public class MCQ {
	
//		Ques 1
//		
//		What is the output of the following code :
//
//			class Main {
//			    public static void main(String[] args) {
//			        int[] arr = {1, 2, 1, 3, 6, 1, 4, 1, 1, 9, 1};
//			        int count = 0;
//			        for(int i = 0; i < arr.length; i++) {
//			            if(arr[i] == 1) {
//			                 count++;
//			             }
//			         }
//			         System.out.print(count);
//			     }
//			}
//
//		Ans : 6
//		
//----------------------------------------------------------------------------------------------------------------------------------
//
//		Ques 2
//		
//		What is the output of the following code :
//
//			class Main {
//			    public static void main(String[] args) {
//			        double[] myList = {1, 5, 5, 5, 5, 1};
//			        double max = myList[0];
//			        int index = 0;
//			        for(int i = 1; i < myList.length; i++) {
//			            if(myList[i] > max) {
//			                 max = myList[i];
//			                 index = i;
//			             }
//			         }
//			         System.out.println(index);
//			     }
//			}
//		
//		Ans : 1 is correct
//		In the given program.
//		Line 7 : if(myList[i] > max) execute only on time when i =1;
//		when i = 1 then myList[i] = 5 and max = 1(so the statement is true and if block will be executed).
//		Then, max = myList[i] = 5 and indexOfMax = i = 1.
//		After that if the statement is always false. so indexOfMax value remains 1.
//
//		Therefore the value of indexOfMax is 1 at the end of the for loop.
//		
//-----------------------------------------------------------------------------------------------------------------------------------
//
//		Ques 3
//		
//		Analyze the following code and choose the correct answer :
//
//			int[] arr = new int[5];
//			arr = new int[6];
//			
//		Ans : The code can compile and run the program. The second line assigns a new array to arr.
//		
//------------------------------------------------------------------------------------------------------------------------------------
//
//		Ques 4
//		
//		Select the correct output of code :
//
//			public class Main {
//			    public static void main(String[] args) {
//			        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//			        int left = 0;
//			        int right = arr.length - 1;
//			        while(left < right) {
//			            int temp = arr[left];
//			             arr[left] = arr[right];
//			             arr[right] = temp;
//			             left++;
//			             right--;
//			         }
//			        for(int i = 0; i < arr.length; i++) {
//			             System.out.print(arr[i] + " ");
//			         }
//			     }
//			}
//			
//		Ans : 10 9 8 7 6 5 4 3 2 1, Code is based on reversal of array.
//		
//-------------------------------------------------------------------------------------------------------------------------------------
//
//		Ques 5
//		
//		Which will legally declare, construct, and initialize an array?
//				
//		Ans : int[] myList = {4, 3, 7}
//
//				int myList = {}; this is wrong because there are no [] brackets.
//				int[] myList = (5, 8, 2); this is wrong because () brackets are there instead of {}.
//				int myList[][] = {4, 9, 7, 0}; this is wrong because on the left side, it is [][], but on the right it has a single array initialisation.
//				
//--------------------------------------------------------------------------------------------------------------------------------------------
//
//		Ques 6
//		
//		What is the value of arr[1] after the following code is executed?
//
//				int[] arr = {0, 2, 4, 1, 3};
//				for(int i = 0; i < arr.length; i++) 
//				    arr[i] = arr[(arr[i] + 3) % arr.length];
//				
//		Ans : when i = 0;
//						a[i] = a[(a[i]+3)%a.length] //a.length =5;
//						a[0] = a[(a[0]+3)%5];
//						a[0] = a[(0+3)%5] ; // 3
//						a[0] = a[3] = 1
//						when i = 1;
//						a[1]=a[(a[1]+3)%5];
//						a[1]=a[(2+3)%5];
//						a[1]=a[0];
//						a[1]=1;
//						Therefore a[1] is equal to 1
//

}
