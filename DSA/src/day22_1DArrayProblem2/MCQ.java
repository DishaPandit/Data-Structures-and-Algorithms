package day22_1DArrayProblem2;

public class MCQ {
	
//		Ques 1
//		
//		Is this code correct to check if an array is in increasing order or not?
//
//				static boolean check(int[]arr) {
//
//				    int n = arr.length;
//
//				    for(int i=0; i < n;i++) {
//
//				        if(arr[i] <= arr[i-1]) {
//
//				            return false;
//
//				        }
//
//				    }
//
//				    return true;
//
//				}
//		
//		Ans : Incorrect due to index out of bounds issue. See loop is starting from 0 going till n-1, when i=0 we can’t write arr[i-1] in that case.
//				
//------------------------------------------------------------------------------------------------------------------------------------------------------
//
//		Ques 2
//		
//		Given an array where every element appears twice except one element, find the single element. Is the following code correct for this question?
//
//				static int single_element(int[]arr) {
//
//				     int n = arr.length;
//
//				     for(int i=0; i < n;i++) {
//
//				         int c = 0;
//
//				         for(int j=i; j < n;j++) {
//
//				             if(arr[j] == arr[i]) {
//
//				                 c++;
//
//				             }
//
//				         }
//
//
//				         if(c == 1) {
//
//				             return arr[i];
//
//				         }
//
//				     }      
//
//				     return -1;
//
//				}
//				
//		Ans : Incorrect due to wrong counting of elements. The j variable should start from 0 in the second loop.
//		
//-------------------------------------------------------------------------------------------------------------------------------------------------------
//
//		Ques 3
//		
//		Correct way to find cube of a number in Java?
//				
//		Ans : int cube = a * a * a is the correct answer.
//		
//-----------------------------------------------------------------------------------------------------------------------------------------------------
//
//		Ques 4
//		
//		What will be the output of the following code?
//
//				class Main {
//
//				   static void fun(int[]arr) {
//
//				       arr[3] = 98;
//
//				       return;
//
//				   }
//
//				  
//
//				   public static void main(String args[]) {
//
//				       int[]arr = {10,20,30,40,50};
//
//				       fun(arr);
//
//				       System.out.println(arr[3]);
//
//				   }
//
//				}
//				
//		Ans : 98
//		
//-----------------------------------------------------------------------------------------------------------------------------------------------
//
//		Ques 5
//		
//		Is this code correct to check if an array is in increasing order or not?
//
//				static boolean check(int[]arr) {
//
//				     int n = arr.length;
//
//				     for(int i=0; i < n-1;i++) {
//
//				         if(arr[i+1] <= arr[i]) {
//
//				             return false;
//
//				         }
//
//				     }
//
//				     return true;
//
//				}
//				
//		Ans : This is the correct code.
//		
//-----------------------------------------------------------------------------------------------------------------------------------------------
//
//		Ques 6
//		
//		What is the output of the following code?
//
//				class Main {
//
//				    static int[] fun(int[]arr) {
//
//				        int[]new_arr = {64,83,56};
//
//				        return new_arr;
//
//				    }
//
//				    public static void main(String args[]) {
//
//				        int[]arr = {10,20,30,40,50};
//
//				        arr = fun(arr);
//
//				        for(int i=0; i < arr.length;i++) {
//
//				            System.out.print(arr[i] + " ");
//
//				        }
//
//				    }
//
//				}
//				
//		Ans : 64 83 56 is the correct answer. The array fun function returning will be 
//		captured in arr variable of main function, and then we are printing it.
//

}
