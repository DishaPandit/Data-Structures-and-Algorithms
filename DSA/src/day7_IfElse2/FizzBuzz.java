//https://www.scaler.com/academy/mentee-dashboard/class/34843/assignment/problems/25342?navref=cl_tt_nv
package day7_IfElse2;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n%3==0)
            System.out.print("Fizz");

        if(n%5==0)
            System.out.print("Buzz");

	}

}
