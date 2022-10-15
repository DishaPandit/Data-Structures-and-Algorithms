//https://www.scaler.com/academy/mentee-dashboard/class/34842/homework/problems/25625?navref=cl_tt_nv
package day6_IfElse1;

import java.util.Scanner;

public class Rockstar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Method 1

        if((n % 3 == 0) && (n % 5 == 0))
            System.out.println("Rockstar");

        if(n % 3 == 0)
            System.out.println("Rock");

        if(n % 5 == 0)
            System.out.println("star");

        //Method 2

        /*
        
        if(n % 3 == 0)
            System.out.print("Rock");

        if(n % 5 == 0)
            System.out.print("star");
        */

	}

}
