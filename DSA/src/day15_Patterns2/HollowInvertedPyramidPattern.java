//https://www.scaler.com/academy/mentee-dashboard/class/36217/assignment/problems/20869?navref=cl_tt_nv
package day15_Patterns2;

import java.util.Scanner;

public class HollowInvertedPyramidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++)
        {
            for(int j =1; j<=i; j++)
            {
                System.out.print("*");
            }
            // for(int j = n-i; j>=1; j--)
            // {
            //     System.out.print(" ");
            // }
            // for(int j = n-i; j>=1; j--)
            // {
            //     System.out.print(" ");
            // }
            for(int j = 1; j<= 2*(n-i); j++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

	}

}
