//https://www.scaler.com/academy/mentee-dashboard/class/36224/assignment/problems/30651?navref=cl_tt_lst_nm
package day23_2DArrays;

import java.util.Scanner;

public class PrintMatrixRowByRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int mat[][] = new int[n][m];
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                mat[i][j] = sc.nextInt();
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

	}

}
