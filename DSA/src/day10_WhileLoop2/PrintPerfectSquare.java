//https://www.scaler.com/academy/mentee-dashboard/class/36212/assignment/problems/25478?navref=cl_tt_lst_nm
package day10_WhileLoop2;

import java.util.Scanner;

public class PrintPerfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int i = 1;
        while(i <= a)
        {
            if(i*i <= a)
                System.out.print(i*i + " ");
            i++;
        }

	}

}
