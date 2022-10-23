//https://www.scaler.com/academy/mentee-dashboard/class/36225/homework/problems/11617?navref=cl_tt_lst_nm
package day24_2DArrayProblems;

public class RowAndColumnSum {
	
	public int[] solve(int[][] A) {

        int row = A.length;
        int col = A[0].length;
        int ans[] = new int[row+col];
        //rowsum
        for(int i=0; i<row; i++)
        {
            int rowSum =0;
            for(int j=0; j<col; j++)
            {
                rowSum += A[i][j];
            }
            ans[i] = rowSum;
        }
        //colsum
        int val = row;
        for(int j=0; j<col; j++)
        {
            int colSum =0;
            for(int i=0; i<row; i++)
            {
                colSum += A[i][j];
            }
            ans[val] = colSum;
            val++;
        }
    return ans;

    }

}
