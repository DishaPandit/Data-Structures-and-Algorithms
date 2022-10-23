//https://www.scaler.com/academy/mentee-dashboard/class/36223/assignment/problems/21182?navref=cl_tt_nv
package day22_1DArrayProblem2;

public class UniqueElement {
	
	public int solve(int[] A) {
        
        int ans = 0;
        for(int i=0; i<A.length; i++)
        {
            int count = 0;
            for(int j=0; j<A.length; j++)
            {
                if(A[j] == A[i])
                    count++;
                
                //can skip continue 
                // if(count == 2)
                //     continue;
            }
            if(count == 1)
                ans = A[i];
        }
        return ans;
    }

}
