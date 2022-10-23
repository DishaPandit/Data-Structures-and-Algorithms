//https://www.scaler.com/academy/mentee-dashboard/class/36225/assignment/problems/11615?navref=cl_tt_nv
package day24_2DArrayProblems;

public class MatrixTranspose {
	
	public int[][] solve(int[][] A) {

        int row = A.length;
        int col = A[0].length;
        int trans[][] = new int[col][row];
        for(int i=0; i<row; i++ )
        {
            for(int j=0; j<col; j++)
            {
                //important condition to check array out of bo
                trans[j][i] = A[i][j];
            }
        }
        return trans;
    }

}
