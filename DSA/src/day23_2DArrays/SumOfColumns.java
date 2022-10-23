//https://www.scaler.com/academy/mentee-dashboard/class/36224/homework/problems/16531?navref=cl_tt_nv
package day23_2DArrays;

public class SumOfColumns {
	
	public int[] solve(int A, int B, int[][] C) {

        int ans[] = new int[B];
        for(int j=0; j<B; j++)
        {
            int colSum =0;
            for(int i=0; i<A;i++)
            {
                colSum += C[i][j];
                ans[j] = colSum;
            }
        }
        return ans;
    }

}
