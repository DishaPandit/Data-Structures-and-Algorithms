//https://www.scaler.com/academy/mentee-dashboard/class/36216/assignment/problems/10450?navref=cl_tt_nv
package day14_Patterns1;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++)
        {
            for(int j = 1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

	}

}
