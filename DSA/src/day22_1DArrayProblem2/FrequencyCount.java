//https://www.scaler.com/academy/mentee-dashboard/class/36223/assignment/problems/11618?navref=cl_tt_lst_nm
package day22_1DArrayProblem2;

public class FrequencyCount {

	 public int[] solve(int[] A) {

	        int B[] = new int[A.length];
	        for(int i=0; i<A.length;i++)
	        {
	            int count = 0;
	            for(int j=0; j<A.length; j++)
	            {
	                if(A[j] == A[i])
	                    count++;
	            }
	            B[i] = count;
	        }
	        return B;
	    }
	
}
