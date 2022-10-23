//https://www.scaler.com/academy/mentee-dashboard/class/36213/homework/problems/11237?navref=cl_tt_lst_nm
package day11_ForLoop1;

import java.util.Scanner;

public class PalindromicInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int reverse = 0;
        int num = a;

        while(num > 0)
        {
            int digit = num%10;
            if(reverse > Integer.MAX_VALUE/10 ||reverse < Integer.MIN_VALUE/10)
                return ;

            reverse = reverse * 10 + digit;
            num = num/10;
        }
        if(a == reverse)
            System.out.println("Yes");

        else
            System.out.println("No"); 
        

	}

}
