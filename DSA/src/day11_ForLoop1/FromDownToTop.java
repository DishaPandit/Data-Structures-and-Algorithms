//https://www.scaler.com/academy/mentee-dashboard/class/36213/assignment/problems/11222?navref=cl_tt_nv
package day11_ForLoop1;

import java.util.Scanner;

public class FromDownToTop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i =n; i>=1 ; i--)
        {
            System.out.print(i + " ");
        }

	}

}
