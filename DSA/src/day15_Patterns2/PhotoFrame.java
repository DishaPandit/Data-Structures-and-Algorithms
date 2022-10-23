//https://www.scaler.com/academy/mentee-dashboard/class/36217/homework/problems/20870?navref=cl_tt_lst_nm
package day15_Patterns2;

import java.util.Scanner;

public class PhotoFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++)
        {
            for(int j = 1; j<=n; j++)
            {
                if(i==1 || j==1 || i==n || j==n)
                    System.out.print("*");
                
                else
                    System.out.print(" ");

            }
            System.out.println();
        }

	}

}
