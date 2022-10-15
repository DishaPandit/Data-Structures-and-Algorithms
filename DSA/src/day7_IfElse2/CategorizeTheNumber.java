//https://www.scaler.com/academy/mentee-dashboard/class/34843/assignment/problems/11670?navref=cl_tt_lst_nm
package day7_IfElse2;

import java.util.Scanner;

public class CategorizeTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a>0)
            System.out.println("1");
        
        else if(a<0)
            System.out.println("-1");
        
        else
            System.out.println("0");
        

	}

}
