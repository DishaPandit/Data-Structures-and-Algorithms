//https://www.scaler.com/academy/mentee-dashboard/class/34843/homework/problems/25526?navref=cl_tt_lst_nm
package day7_IfElse2;

import java.util.Scanner;

public class MarkingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        if(m >= 50)
            System.out.print("PASS ");
        
        else
            System.out.print("FAIL");

        if(m>=50 && m<=80)
            System.out.println("B");
        
        else if(m>=81 && m<=100)
            System.out.println("A");

	}

}
