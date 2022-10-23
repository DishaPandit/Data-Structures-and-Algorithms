//https://www.scaler.com/academy/mentee-dashboard/class/36224/assignment/problems/30652?navref=cl_tt_nv
package day23_2DArrays;

import java.util.Scanner;

public class PrintMatrixColumnByColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int mat[][] = new int[n][m];
        //input
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                mat[i][j] = sc.nextInt();
            }
        }
        //output
        for(int j=0; j<m; j++)
        {
            for(int i=0; i<n; i++)
            {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

	}

}
