//https://www.scaler.com/academy/mentee-dashboard/class/36217/homework/problems/10453?navref=cl_tt_nv
package day15_Patterns2;

import java.util.Scanner;

public class HollowInvertedHalfPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++)
        {
            for(int j = n-i+1; j>=1; j--)
            {
                if(i==1 || j==1 || (i+j) == n+1)
                    System.out.print("*");

                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        

	}

}
