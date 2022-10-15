//https://www.scaler.com/academy/mentee-dashboard/class/34842/homework/problems/25525?navref=cl_tt_lst_nm
package day6_IfElse1;

import java.util.Scanner;

public class SituationOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if( n>=0 && n%2==1 )
            System.out.println("Number is Positive and Odd");
        
        else if(n>=0 && n%2==0 )
            System.out.println("Number is Positive and Even");

        else if(n<0 && Math.abs(n%2) == 1 )
        //(n<0 && n%2 == -1)
        //(n<0 && n%2 != 0)
            System.out.println("Number is Negative and Odd");

        else
            System.out.println("Number is Negative and Even");

        //Method 2 -
        // Viewed the solution
        /*
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        System.out.print("Number is ");
        if(n > 0) {
            System.out.print("Positive ");
        } else {
            System.out.print("Negative ");
        }
        System.out.print("and ");
        if(n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        */

	}

}
