//https://www.scaler.com/academy/mentee-dashboard/class/36212/assignment/problems/23158?navref=cl_tt_nv
package day10_WhileLoop2;

import java.util.Scanner;

public class BankAccount2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        long balance = sc.nextLong();
        int noOfOperations = sc.nextInt();

        while(noOfOperations > 0)
        {
            int type = sc.nextInt();
            //TC was failing because of integer overflow hence, took the long instead of int
            long amount = sc.nextLong();
            if(type == 1)
            {
                //add
                balance = balance + amount;
                System.out.println(balance);
            }

            if(type == 2)
            {
                //subtract
                if(balance < amount)
                {
                    System.out.println("Insufficient Funds");
                }
                else
                {
                    balance = balance - amount;
                    System.out.println(balance);
                }

            }

            noOfOperations--;
        }

	}

}
