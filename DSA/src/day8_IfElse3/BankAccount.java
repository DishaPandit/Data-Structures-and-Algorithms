//https://www.scaler.com/academy/mentee-dashboard/class/34844/homework/problems/10867?navref=cl_tt_lst_nm
package day8_IfElse3;

import java.util.Scanner;

public class BankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int type = sc.nextInt();
        int amount = sc.nextInt();

        if(type == 1)
        {
            n = n + amount;
            System.out.println(n);
        }

        if(type == 2)
        {
            if(amount > n)
                System.out.println("Insufficient Funds");

            else
            {
                n = n - amount;
                System.out.println(n);
            }
        }

	}

}
