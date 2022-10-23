//https://www.scaler.com/academy/mentee-dashboard/class/36211/assignment/problems/11222?navref=cl_tt_nv
package day9_WhileLoop1;

import java.util.Scanner;

public class FromDownToTop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = n;
        while(i >= 1)
        {
            System.out.print(i + " ");
            i--;
        }

	}

}
