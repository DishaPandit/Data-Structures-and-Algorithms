//https://www.scaler.com/academy/mentee-dashboard/class/36224/assignment/problems/17356?navref=cl_tt_nv
package day23_2DArrays;

import java.util.Scanner;

public class WavePrintColumnWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mat[][] = new int[n][n];

        //input
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                mat[i][j] = sc.nextInt();
            }
        }

        //print
        for(int j=0; j<n; j++)
        {
            if(j%2==0)
            {
                for(int i=0; i<n; i++)
                    System.out.print(mat[i][j] + " ");
            }

            else
            {
                for(int i=n-1; i>=0; i--)
                    System.out.print(mat[i][j] + " ");
            }
        }    

	}

}
