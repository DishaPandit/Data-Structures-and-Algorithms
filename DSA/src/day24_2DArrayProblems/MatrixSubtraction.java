//https://www.scaler.com/academy/mentee-dashboard/class/36225/assignment/problems/11463?navref=cl_tt_nv
package day24_2DArrayProblems;

public class MatrixSubtraction {
	
	public int[][] solve(int[][] A, int[][] B) {

        int C[][] = new int[A.length][A[0].length];
        for(int i=0; i<A.length; i++)
        {
            for(int j=0; j<A[0].length; j++)
            {
                C[i][j] = A[i][j] - B[i][j];
            }
        }
        return C;
    }

}
