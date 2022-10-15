//https://www.scaler.com/academy/mentee-dashboard/class/34842/assignment/problems/25316?navref=cl_tt_nv
package day6_IfElse1;

import java.util.Scanner;

public class RollerCoasterRide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age >= 13)
            System.out.println("You can ride the roller coaster!");
        
        else
            System.out.println("You can't ride the roller coaster.");

	}

}
