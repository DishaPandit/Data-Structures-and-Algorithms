//https://www.scaler.com/academy/mentee-dashboard/class/36223/homework/problems/11454?navref=cl_tt_nv
package day22_1DArrayProblem2;

public class AdjacentDifferencesArray {
	
	public int[] solve(int[] A) {

        int ans[] = new int[A.length-1];
        if(A.length == 1)
            return ans;
        
        for(int i=0; i<A.length-1; i++)
        {
            ans[i] = A[i+1] - A[i];
        }
        return ans;
    }

}
