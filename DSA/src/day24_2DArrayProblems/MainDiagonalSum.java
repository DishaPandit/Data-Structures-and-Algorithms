//https://www.scaler.com/academy/mentee-dashboard/class/36225/homework/problems/11465?navref=cl_tt_nv
package day24_2DArrayProblems;

public class MainDiagonalSum {
	
	public int solve(final int[][] A) {

        int ans = 0;
        for(int i=0; i<A.length; i++)
        {
            for(int j=0; j<A[0].length; j++)
            {
                if(i==j)
                    ans += A[i][j];
            }
        }
        return ans;
    }

}
