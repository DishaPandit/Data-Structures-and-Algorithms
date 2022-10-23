//https://www.scaler.com/academy/mentee-dashboard/class/34844/assignment/problems/25343?navref=cl_tt_nv

package day8_IfElse3;

import java.util.Scanner;

public class ConfusionInElectricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double amount = 0.0;

        if(n<=50)
        {
            amount = n*0.50;    //169.5
        }

        else if(n>50 && n<=150)
        {
            amount = 50*0.50 + (n-50)*0.75;     //241.75
        }

        else if(n>150 && n<=250)
        {
            amount = 50*0.50 + 100*0.75 + (n-150)*1.20;     //326.8
        }

        else if(n>250)
        {
            amount = 50*0.50 + 100*0.75 + 100*1.2 + (n-250)*1.50;     //
        }

        amount = (0.2*amount + amount);
        int ans = (int)amount;
        System.out.println(ans);

	}

}
