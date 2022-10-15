//https://www.scaler.com/academy/mentee-dashboard/class/34843/assignment/problems/11673?navref=cl_tt_nv
package day7_IfElse2;

import java.util.Scanner;

public class WhichTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a == b && b == c)
            System.out.println("equilateral");

        else if (a != b && b != c && a != c)
            System.out.println("scalene");
        
        else
            System.out.println("isosceles");

	}

}
