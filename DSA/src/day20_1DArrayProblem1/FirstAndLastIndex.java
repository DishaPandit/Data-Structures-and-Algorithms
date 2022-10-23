//https://www.scaler.com/academy/mentee-dashboard/class/36222/assignment/problems/27896?navref=cl_tt_nv
package day20_1DArrayProblem1;

public class FirstAndLastIndex {

	public int[] solve(int[] A, int B) {
        
        int ans[] = new int[2];

        for(int i=1; i<A.length; i++)
        {
            if(A[i] == B && A[i-1] != B)
                ans[0] = i;
        }
        for(int i=0; i<A.length-1; i++)
        {
            if(A[i] == B && A[i+1] != B)
                ans[1] = i;
        }
        return ans;
    }

}
