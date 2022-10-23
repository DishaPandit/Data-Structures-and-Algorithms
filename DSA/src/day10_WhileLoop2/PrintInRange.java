//https://www.scaler.com/academy/mentee-dashboard/class/36212/assignment/problems/25835?navref=cl_tt_nv
package day10_WhileLoop2;

import java.util.Scanner;

public class PrintInRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int i = a;
        while(i<=b)
        {
            System.out.print(i + " ");
            i++;
        }

	}

}
