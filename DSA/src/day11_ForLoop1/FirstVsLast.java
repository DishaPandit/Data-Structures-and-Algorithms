//https://www.scaler.com/academy/mentee-dashboard/class/36213/assignment/problems/11380?navref=cl_tt_lst_nm
package day11_ForLoop1;

import java.util.Scanner;

public class FirstVsLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int lastDigit = 0;
        int digit = 0;

        while(T>0)
        {
            int N = sc.nextInt();
            int num = N;
            while(num>0)
            {
                digit = num%10;
                if(num == N)
                {
                    lastDigit = digit;
                }
                num = num/10;
            }
            System.out.println(digit + " " + lastDigit);
            T--;

        }

	}

}
