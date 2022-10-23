//https://www.scaler.com/academy/mentee-dashboard/class/34844/homework/problems/25456?navref=cl_tt_nv

package day8_IfElse3;

import java.util.Scanner;

public class LeapYearIII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if( (a % 400 == 0) || ((a % 4 ==0) && (a % 100 != 0)))
            System.out.println("1");
        
        else
            System.out.println("0");

	}

}
