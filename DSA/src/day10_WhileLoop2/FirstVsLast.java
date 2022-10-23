//https://www.scaler.com/academy/mentee-dashboard/class/36212/homework/problems/11380?navref=cl_tt_nv
package day10_WhileLoop2;

import java.util.Scanner;

public class FirstVsLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int digit = 0;
        int lastDigit = 0;

        while(T > 0)
        {
            int N = sc.nextInt();
            int m = N;
            while(m > 0)
            {
                digit = m%10;
                if( m == N)
                {
                    lastDigit = digit;
                } 
                m = m/10;
            }
            System.out.print(digit + " " + lastDigit);
            System.out.println();
            T--;
        }

	}

}
