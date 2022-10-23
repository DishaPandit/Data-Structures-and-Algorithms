package day19_Array1;

public class MCQ {
	
//		Ques 1
//		
//		What is the correct way to declare an array of size 4 in java?
//				
//		Ans : Both declarations int []arr = new int[4] and int arr[] = new int[4] are correct.
//		
//----------------------------------------------------------------------------------------------------------------------------
//
//		Ques 2
//		
//		Given an array A, how to find the total number of elements?
//				
//		Ans : A.length gives the length of array A
//		
//----------------------------------------------------------------------------------------------------------------------------
//
//		Ques 3
//		
//		If the size of the array is 6, what are the valid indexes?
//				
//		Ans : In an array of size n valid indexes are 0 to n-1. So here the size of the array is 6 hence valid indexes are 0 to 5.
//		
//----------------------------------------------------------------------------------------------------------------------------
//
//		Ques 4
//		
//		Predict the output of the following code?
//
//				class Main {
//
//				  public static void main(String args[]) {
//
//				      int[]arr = {10,20,30,40,50};
//
//				      arr[3] = 95;
//
//				      arr[5] = 60;
//
//
//				      for(int i=0; i < 5;i++) {
//
//				          System.out.print(arr[i] + " ");
//
//				      }
//
//				  }
//
//				}
//		
//		Ans : Error, 5th index is not valid so writing arr[5] will give array index out of bound exception.
//		
//----------------------------------------------------------------------------------------------------------------------------
//
//		Ques 5
//		
//		Predict the output of the following code?
//
//				class Main {
//
//				  public static void main(String args[]) {
//
//				      int[]arr = {10,20,30,40,50};
//
//				      arr[3] = 95;
//
//				      arr[4] = 60;
//
//				     
//
//				      for(int i=0; i < arr.length;i++) {
//
//				          System.out.print(arr[i] + " ");
//
//				      }
//
//				  }
//
//				}
//				
//		Ans : 10 20 30 95 60, arr[3] is changed to 95 and arr[4] is changed to 60.
//		
//------------------------------------------------------------------------------------------------------------------------------
//
//		Ques 6
//		
//		Predict the output of the following code?
//
//				class Main {
//
//				    public static void main(String args[]) {
//
//				         int[]arr = {10,20,30};
//
//				         arr = new int[3];
//
//				         int ans = arr[0] * arr[1];
//
//				         System.out.println(ans);
//
//				     }
//
//				}
//				
//		Ans : Initially arr = [10,20,30] but then it is changed to [0,0,0] . Now ans = 0*0, so 0 is the correct answer.

}
