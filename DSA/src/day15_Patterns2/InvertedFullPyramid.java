//https://www.scaler.com/academy/mentee-dashboard/class/36217/homework/problems/10455?navref=cl_tt_nv
package day15_Patterns2;

import java.util.Scanner;

public class InvertedFullPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++)
        {
            for(int j = 1; j<i; j++)
            {
                System.out.print(" ");
            }

            for(int j=n-i+1; j>=1; j--)
            {
                System.out.print("* ");
            }

            System.out.println();
        }

	}

}
