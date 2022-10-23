//https://www.scaler.com/academy/mentee-dashboard/class/36213/assignment/problems/25512?navref=cl_tt_nv
package day11_ForLoop1;

import java.util.Scanner;

public class MultiplesOf4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++)
        {
            if(i%4 == 0)
                System.out.print(i + " ");
        }

	}

}
