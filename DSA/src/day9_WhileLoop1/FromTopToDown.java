//https://www.scaler.com/academy/mentee-dashboard/class/36211/assignment/problems/11221?navref=cl_tt_lst_nm
package day9_WhileLoop1;

import java.util.Scanner;

public class FromTopToDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 1;
        while(i <= n)
        {
            System.out.print(i + " ");
            i++;
        }

	}

}
