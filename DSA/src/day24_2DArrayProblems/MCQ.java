package day24_2DArrayProblems;

public class MCQ {
	
//		Ques 1
//		
//		What is the transpose of the given matrix?
//
//				int[][]A = {
//
//				          {2,5,9,8},
//
//				          {6,2,5,7},
//
//				          {1,3,0,4}
//
//				 };
//		
//		Ans : In transpose all rows transformed into columns or we can say all columns transform into rows.
//		{{2,6,1},{5,2,3},{9,5,0},{8,7,4}} is the correct transpose.
//		
//-------------------------------------------------------------------------------------------------------------------------------
//
//		Ques 2
//		
//		Can we multiply A matrix with B if the dimensions of A is 4x5 and the dimensions of B is 5x16?
//				
//		Ans : Yes, when the matrix of r1xc1 multiplied by r2xc2, then first of all multiplication can be done 
//		only if c1 == r2 and the dimensions of the resultant matrix is r1xc1. Hence, the answer is 4x16.
//		
//-------------------------------------------------------------------------------------------------------------------------------
//
//		Ques 3
//		
//		Predict the output of the following code?
//
//				class Main {
//
//				   static void func(int[][]mat) {
//
//				       mat[2][3] = 19;
//
//				   }
//
//				   public static void main(String args[]) {
//
//				       int[][]A = {
//
//				           {2,5,9,8},
//
//				           {6,2,5,7},
//
//				           {1,3,0,4}
//
//				       };
//
//				      
//				       func(A);
//
//				       System.out.println(A[2][4]);
//
//				   }
//
//				}
//		
//		Ans : Runtime error, because we are trying to print A[2][4], columns are from 0 to 3 only.
//		
//-------------------------------------------------------------------------------------------------------------------------------
//
//		Ques 4
//		
//		If we want to create an Array to store each row’ sum of a given matrix of dimension 9 x 6, what will be the array size?
//				
//		Ans : We need to create an array with size total number of rows, i.e 9.
//		
//-------------------------------------------------------------------------------------------------------------------------------
//
//		Ques 5
//		
//		Is this code correct for finding the transpose of a matrix?
//
//				class Main {
//
//				   public static void main(String args[]) {
//
//				       int[][]mat = {
//
//				           {2,6,7,8},
//
//				           {3,9,4,1},
//
//				           {6,5,0,9}
//
//				       };
//
//				      
//				       int[][]trans = new int[4][3];
//
//				       for(int i=0; i < 3;i++) {
//
//				           for(int j=0; j < 4;j++) {
//
//				               trans[i][j] = mat[j][i];
//
//				           }
//
//				       }
//
//				   }
//
//				}
//				
//		Ans : The above code is not correct due to index out of bound error. 
//		Variable i is travelling on rows and j is travelling on columns of mat matrix so we can’t use i for col and j for row.
//		
//--------------------------------------------------------------------------------------------------------------------------------
//
//		Ques 6
//		
//		Which of the following is an identity matrix for A?
//		Note : A is a matrix of dimensions 2x4.
//		
//		Ans : Identity matrix for A is a matrix such that
//		A x I = A, hence the correct answer is {{1,0,0,0},{0,1,0,0},{0,0,1,0},{0,0,0,1}}
//				
//--------------------------------------------------------------------------------------------------------------------------------
//
//
//		Ques 7
//		
//		What is a diagonal matrix?
//				
//		Ans : A matrix having non-zero elements only in the diagonal running from the upper left to the lower right.
//		Eg. {5,0,0}
//			{0,9,0}
//			{0,0,8}
//			
//---------------------------------------------------------------------------------------------------------------------------------
//
//		Ques 8
//		
//		What will be the output of the following code?
//
//				class Main {
//
//				   static int[][] func(int[][]mat) {
//
//				       int[][]A = new int[1][1];
//
//				       return A;
//
//				   }
//
//				   public static void main(String args[]) {
//
//				       int[][]A = {
//
//				           {2,5,9,8},
//
//				           {6,2,5,7},
//
//				           {1,3,0,4}
//
//				       };
//
//				      
//				       A = func(A);
//
//				       System.out.println(A[0][0]);
//
//				   }
//
//				}
//
//			Ans : 0, from func a new 2D array {{0}} is getting returned and we are capturing it in A of main function. 
//			So A matrix is changed to {{0}} now, and printing A[0][0] will give 0.
//			
//----------------------------------------------------------------------------------------------------------------------------------
//
//		Ques 9
//		
//		Is the following code correct to check whether a given matrix is an identity matrix or not?
//
//				static boolean isIdentity(int[][]mat) {
//
//				    int r = mat.length;
//
//				    int c = mat[0].length;
//
//				    if(r != c) {
//
//				        return false;
//
//				    }
//
//				    int i = 0;
//
//				    int j = 0;
//
//				    while(i < r && j < c) {
//
//				        if(mat[i][j] != 1) {
//
//				            return false;
//
//				        }
//
//				        i++;
//
//				        j++;
//
//				     }
//
//				     return true;
//
//				}
//			
//			Ans : This code is incorrect due to wrong logic, for an identity matrix elements on the main diagonal must be 1 but the rest of elements must be 0. 
//			We are only checking main diagonal elements, we need to check the rest of the elements as well.
//			
//---------------------------------------------------------------------------------------------------------------------------------------------------------
//
//			Ques 10
//			
//			Given a matrix A, find the sum of the diagonal which starts from the top right corner and goes till bottom left corner.
//
//			int[][]mat = {
//
//			     {2,3,6,1},
//
//			     {9,1,0,5},
//
//			     {4,2,7,9},
//
//			     {8,6,5,0}
//
//			};
//				
//			Ans : The element from top right corner till bottom left corner diagonal are : 1 0 2 8 and their sum is = 11

}
