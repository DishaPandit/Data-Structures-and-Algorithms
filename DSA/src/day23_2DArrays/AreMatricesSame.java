//https://www.scaler.com/academy/mentee-dashboard/class/36224/homework/problems/11614?navref=cl_tt_lst_nm
package day23_2DArrays;

public class AreMatricesSame {
	
	public int solve(int[][] A, int[][] B) {

        int row = A.length;
        int col = A[0].length;

        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                if(A[i][j] != B[i][j])
                    return 0;
            }
        }
        return 1;
    }
	

}
