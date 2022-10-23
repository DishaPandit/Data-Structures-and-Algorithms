package day23_2DArrays;

public class MCQ {
	
//		Ques 1
//		
//		Which of the following statement is correct?
//		
//		1. int[][] array = {1, 2};
//		2. int[2][2] array = {{1, 2}, {3, 4}};
//		3. int[2][] array = {{1, 2}, {3, 4}};
//		4. int[][] array = {{1, 2}, {3, 4}};
//		
//		Ans : int[][] array = {{1, 2}, {3, 4}};
//		
//--------------------------------------------------------------------------------------------------------------------------
//
//		Ques 2
//		
//		Assume double[][] x = new double[4][5], what are x.length and x[2].length?
//				
//		Ans : 4 and 5
//		
//--------------------------------------------------------------------------------------------------------------------------
//
//		Ques 3
//		
//		How many elements are there in the matrix,(int[][] matrix = new int[5][5])?
//				
//		Ans : 25
//		
//--------------------------------------------------------------------------------------------------------------------------
//
//		Ques 4
//		
//		How would you get the value 6 out of the following array 
//		int[][] a = {{2, 4, 6, 8}, {1, 2, 3, 4}};? Remember each set of curly braces represents a row, or a single dimensional array.
//				
//		Ans :  a[0][2]
//				
//--------------------------------------------------------------------------------------------------------------------------
//
//		Ques 5
//		
//		Give the following :
//
//			double[][] things = {
//			 {1.2, 9.0},
//			 {9.2, 0.5, 0.0}, 
//			 {7.3, 7.9, 1.2, 3.9}
//			};
//			What is the value of things.length?
//					
//		Ans : 3, because in 2D array, things have 3 arrays.
//		
//--------------------------------------------------------------------------------------------------------------------------
//
//		Ques 6
//		
//		Assume int[][] x = {{1, 2}, {3, 4, 5}, {5, 6, 5, 9}}, what are x[0].length, x[1].length, and x[2].length?
//				
//		Ans : 2, 3 and 4 is correct
//		x[0] -> {1, 2} -> so x[0].length = 2
//		x[1] -> {3, 4, 5} -> sp x[1].length = 3
//		x[2] -> {5, 6, 5, 9} -> sp x[2].length = 4
//		
//-------------------------------------------------------------------------------------------------------------------------
//
//		Ques 7
//		
//		What is the output of the following code?
//
//				public class Test {
//				    public static void main(String[] args) {
//				        int[][] matrix = {
//				             {1, 2, 3, 4},
//				             {4, 5, 6, 7},
//				             {8, 9, 10, 11},
//				             {12, 13, 14, 15}
//				         };
//				        for(int i = 0; i < 4; i++)
//				             System.out.print(matrix[i][1] + " ");
//				     }
//				}
//		
//		Ans : 2 5 9 13
//		
//---------------------------------------------------------------------------------------------------------------------------
//
//		Ques 8
//		
//		What are the contents of arr after the following code has been executed?
//
//				int[][] arr = {{3, 2, 1}, {1, 2, 3}};
//				for(int row = 1; row < arr.length; row++) {
//				    for(int col = 1; col < arr[0].length; col++) {
//				        if(arr[row][col] % 2 == 1) {
//				             arr[row][col] = arr[row][col] + 1;
//				         }
//				        if(arr[row][col] % 2 == 0) {
//				             arr[row][col] = arr[row][col] * 2;
//				         }
//				     }
//				}
//				
//		Ans :  {{3, 2, 1}, {1, 4, 8}}
//				The first if will change an odd number to an even. The second if will also execute after an odd number has been made even. 
//				Both loops start at index 1 so this only changes the items in the second row and second and third column.
//				
//----------------------------------------------------------------------------------------------------------------------------
//
//		Ques 9
//		
//		Given the following long[][] stuff;, which of the following statements construct an array with 5 rows of 7 columns 
//		each and assign its reference to stuff?
//
//		Ans : studd = new long[5][7];
//		To initialize the array, we need a new keyword.
//		
//----------------------------------------------------------------------------------------------------------------------------
//
//		Ques 10
//		
//		An array of arrays in JAVA is called ___________ array?
//				
//		Ans : Multidimensional
//		2D array is called Multidimensional array.
}
