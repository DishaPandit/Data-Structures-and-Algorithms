//https://www.scaler.com/academy/mentee-dashboard/class/36216/assignment/problems/20804?navref=cl_tt_lst_nm
package day14_Patterns1;

import java.util.Scanner;

public class PrintStarMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i = 1; i<=n; i++)
        {
            for(int j = 1; j<=m; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

	}

}
