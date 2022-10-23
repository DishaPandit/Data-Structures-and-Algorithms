//https://www.scaler.com/academy/mentee-dashboard/class/36223/assignment/problems/11573?navref=cl_tt_nv
package day22_1DArrayProblem2;

public class PairCount {
	
	public int solve(int[] A, int B) {

        int count = 0;
        for(int i=0; i<A.length; i++)
        {
            for(int j=i+1; j<A.length; j++)
            {
                if(A[j] == B-A[i])
                    count++;
            }
        }
        return count;
    }

}
