//https://www.scaler.com/academy/mentee-dashboard/class/36225/homework/problems/11613?navref=cl_tt_nv
package day24_2DArrayProblems;

public class MatrixScalarProduct {
	
	public int[][] solve(int[][] A, int B) {

        int ans[][] = new int[A.length][A[0].length];
        for(int i=0; i<A.length; i++)
        {
            for(int j=0; j<A[0].length; j++)
            {
                ans[i][j] = A[i][j]*B;
            }
        }
        return ans;
    }

}
