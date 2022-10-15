//https://www.scaler.com/academy/mentee-dashboard/class/34843/homework/problems/11762?navref=cl_tt_nv
package day7_IfElse2;

import java.util.Scanner;

public class AnglesOfValidTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if((a + b + c) == 180)          //brackets can be removed
            System.out.println("1");
        
        else
            System.out.println("0");

	}

}
