//https://www.scaler.com/academy/mentee-dashboard/class/36223/homework/problems/27864?navref=cl_tt_nv
package day22_1DArrayProblem2;

public class InverseOfArray {
	
	public int[] solve(int[] A) {

        int[] B = new int[A.length];
        for(int i=0; i<A.length; i++)
        {
            int temp =0;
            for(int j=0; j<A.length; j++)
            {
                if(A[i]==j)   
                    temp = j;
            }        
            B[temp] = i;
        }
        return B;

    }

}
