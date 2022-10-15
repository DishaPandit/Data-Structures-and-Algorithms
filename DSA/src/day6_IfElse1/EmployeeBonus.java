//https://www.scaler.com/academy/mentee-dashboard/class/34842/homework/problems/25524?navref=cl_tt_nv
package day6_IfElse1;

import java.util.Scanner;

public class EmployeeBonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
        String name = sc.next();
        int year = sc.nextInt();

        if(year > 5)
            System.out.println("Yes " + name + " will recieve bonus.");
        
        else
            System.out.println("No " + name + " will not recieve bonus.");
        

	}

}
