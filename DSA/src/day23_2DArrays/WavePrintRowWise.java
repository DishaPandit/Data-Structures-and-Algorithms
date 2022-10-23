//https://www.scaler.com/academy/mentee-dashboard/class/36224/assignment/problems/17364?navref=cl_tt_nv
package day23_2DArrays;

import java.util.Scanner;

public class WavePrintRowWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mat[][] = new int[n][n];
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                mat[i][j] = sc.nextInt();
            }
        }
        //print
        for(int i=0; i<n; i++)
        {
            if(i%2==0)
            {
                for(int j=0; j<n; j++)
                    System.out.print(mat[i][j] + " ");
            }

            else
            {
                for(int j=n-1; j>=0; j--)
                    System.out.print(mat[i][j] + " ");
            }
        }    

	}

}
