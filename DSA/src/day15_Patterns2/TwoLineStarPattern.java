//https://www.scaler.com/academy/mentee-dashboard/class/36217/assignment/problems/20825?navref=cl_tt_lst_nm
package day15_Patterns2;

import java.util.Scanner;

public class TwoLineStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++)
        {
            for(int j =1; j<=n; j++)
            {
                if(j==1 || j==n)
                    System.out.print("*");
                
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

	}

}
