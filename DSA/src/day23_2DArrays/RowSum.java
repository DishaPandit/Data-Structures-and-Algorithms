//https://www.scaler.com/academy/mentee-dashboard/class/36224/assignment/problems/11437?navref=cl_tt_nv
package day23_2DArrays;

public class RowSum {

	public int[] solve(int[][] A) {

        int row = A.length;
        int col = A[0].length;
        int ans[] = new int[row];
        
        for(int i=0; i<row;i++)
        {
            int rowSum = 0;
            for(int j=0; j<col; j++)
            {
                rowSum += A[i][j];   
            }
            ans[i] = rowSum;
        }
        return ans;
    }

}
