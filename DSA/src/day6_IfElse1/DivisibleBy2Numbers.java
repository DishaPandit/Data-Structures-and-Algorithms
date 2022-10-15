//https://www.scaler.com/academy/mentee-dashboard/class/34842/assignment/problems/11750?navref=cl_tt_nv
package day6_IfElse1;

import java.util.Scanner;

public class DivisibleBy2Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        if((A % 5 == 0) && (A % 11 ==0))
            System.out.println("1");
        
        else
            System.out.println("0");

	}

}
