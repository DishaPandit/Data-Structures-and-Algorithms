//https://www.scaler.com/academy/mentee-dashboard/class/36222/homework/problems/21184?navref=cl_tt_lst_nm
package day20_1DArrayProblem1;

public class CubeOfArray {
	
	public long[] solve(int[] A) {

        int n = A.length;
        long b[] = new long[n];
        for(int i=0; i<n; i++)
        {
            b[i] = A[i]*A[i]*A[i];
        }
        return b;
    }

}
