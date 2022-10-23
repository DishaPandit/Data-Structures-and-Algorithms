//https://www.scaler.com/academy/mentee-dashboard/class/36217/homework/problems/10878?navref=cl_tt_nv
package day15_Patterns2;

import java.util.Scanner;

public class DifferentNumberTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++)
        {
            for(int j = n-i; j>=1; j--)
            {
                System.out.print("0 ");
            }
            int count = n-i+1;
            for(int j = 1; j<=2*(i-1)+1; j++)
            {
                System.out.print(count*j + " ");
            }
            for(int j = n-i; j>=1; j--)
            {
                System.out.print("0 ");
            }

            System.out.println();
        }

	}

}
