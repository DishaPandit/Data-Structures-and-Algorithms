//https://www.scaler.com/academy/mentee-dashboard/class/36212/assignment/problems/25836?navref=cl_tt_nv
package day10_WhileLoop2;

import java.util.Scanner;

public class SumOfOddEvenDigitsInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int oddSum = 0;
        int evenSum = 0;

        while(n>0)
        {
            int digit = n%10;
            if(digit % 2 == 0)
                evenSum = evenSum + digit;
            
            else
                oddSum = oddSum + digit;

            n = n/10;
        }

        System.out.println("Sum of Odd Digit : " + oddSum);
        System.out.println("Sum of Even Digit : " + evenSum);

	}

}
