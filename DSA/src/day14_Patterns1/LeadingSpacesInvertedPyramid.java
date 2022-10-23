//https://www.scaler.com/academy/mentee-dashboard/class/36216/homework/problems/20828?navref=cl_tt_nv
package day14_Patterns1;

import java.util.Scanner;

public class LeadingSpacesInvertedPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++)
        {
            for(int j = 1; j<i; j++)
            {
                System.out.print(" ");
            }

            for(int k = n-i+1; k>=1; k--)
            {
                System.out.print("*");
            }
            System.out.println();

        }

	}

}
