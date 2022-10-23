//https://www.scaler.com/academy/mentee-dashboard/class/36224/homework/problems/11463?navref=cl_tt_nv
package day23_2DArrays;

public class MatrixSubtraction {
	
	public int[][] solve(int[][] A, int[][] B) {

        int row = A.length;
        int col = A[0].length;

        int C[][] = new int[row][col];

        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                C[i][j] = A[i][j] - B[i][j];
            }
        }
        return C;
    }

}
