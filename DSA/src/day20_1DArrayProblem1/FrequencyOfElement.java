//https://www.scaler.com/academy/mentee-dashboard/class/36222/assignment/problems/21484?navref=cl_tt_nv
package day20_1DArrayProblem1;

public class FrequencyOfElement {

	public int solve(int[] A, int B) {

        int frequency = 0;
        for(int i = 0; i<A.length; i++)
        {
            if(A[i] == B)
                frequency++;
        }
        return frequency;
    }

}
