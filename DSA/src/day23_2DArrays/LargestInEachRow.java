//https://www.scaler.com/academy/mentee-dashboard/class/36224/homework/problems/16511?navref=cl_tt_nv
package day23_2DArrays;

public class LargestInEachRow {
	
	public int[] solve(int[][] A) {

        int ans[] = new int[A.length];
        for(int i=0; i<A.length; i++)
        {
            int max = A[i][0];
            for(int j=1; j<A[0].length; j++)
            {
                if(A[i][j] > max)
                    max = A[i][j];
            }
            ans[i] = max;
        }
        return ans;
    }

}
