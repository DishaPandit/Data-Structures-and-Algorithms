//https://www.scaler.com/academy/mentee-dashboard/class/36225/assignment/problems/11462?navref=cl_tt_lst_nm
package day24_2DArrayProblems;

public class IsItIdentityMatrix {
	
	public int solve(final int[][] A) {

        int count = 0;
        for(int i=0; i<A.length; i++)
        {
            for(int j=0; j<A[0].length; j++)
            {
                if((i==j && A[i][j]==1 ) || (i!=j && A[i][j] == 0))
                    count++;
            }
        }
        
        if(count == A.length*A[0].length)
            return 1;
        else 
            return 0;
    }

}
