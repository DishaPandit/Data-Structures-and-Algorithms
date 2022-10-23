//https://www.scaler.com/academy/mentee-dashboard/class/36223/assignment/problems/16496?navref=cl_tt_nv
package day22_1DArrayProblem2;

public class CheckIfArrayIsSorted {
	
	public int solve(int[] A) {

        for(int i=0; i<A.length-1; i++)
        {
            if(A[i] > A[i+1])
                return 0;
        }
        return 1;
    }

}
