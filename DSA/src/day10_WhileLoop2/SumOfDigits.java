//https://www.scaler.com/academy/mentee-dashboard/class/36212/homework/problems/11381?navref=cl_tt_lst_nm
package day10_WhileLoop2;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        int totalNo = sc.nextInt();

        while(totalNo > 0)
        {
            int number = sc.nextInt();
            int sum = 0;
            if(number == 0)
            {
                System.out.println(0);
                //I used continue to solve printing sysout again at line 28.
                //issey n = 0 wala case to solve ho gaya
                //but iski wajah se totalNo-- wali line reach nahi hui and hence the error
                //isiliye is if  block me totalNo-- krna hai
                //discussion wale post me aisa nhi hua kyuki that code used for loop
                totalNo--;
                continue;
            }
                
            while(number > 0)
            {
                int digit = number%10;
                sum = sum + digit;
                number = number/10;        
                
            }
            System.out.println(sum);
            totalNo--;
        }

	}

}
