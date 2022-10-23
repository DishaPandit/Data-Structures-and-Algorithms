//https://www.scaler.com/academy/mentee-dashboard/class/36212/homework/problems/25839?navref=cl_tt_nv
package day10_WhileLoop2;

import java.util.Scanner;

public class SumOfOddEvenIndexDigitsInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int oddSum = 0;
        int evenSum = 0;
        int i = 1;

        while(n > 0)
        {
            int digit = n%10;
            if(i % 2 == 1)
            {
                oddSum = oddSum + digit;
            }
            else
            {
                evenSum = evenSum + digit;
            }

            n = n/10;
            i++;
        }
        System.out.println("Sum of Odd Index Digit : " + oddSum);
        System.out.println("Sum of Even Index Digit : " + evenSum);

	}

}
