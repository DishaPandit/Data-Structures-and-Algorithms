//https://www.scaler.com/academy/mentee-dashboard/class/36212/assignment/problems/11379?navref=cl_tt_nv
package day10_WhileLoop2;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        int totalNo = sc.nextInt();

        while(totalNo > 0)
        {
            int number = sc.nextInt();
            int count = 0;
            if(number == 0)
            {
                System.out.println(1);
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
                number = number/10; 
                count++;   
                
            }
            System.out.println(count);
            totalNo--;
        }


	}

}
