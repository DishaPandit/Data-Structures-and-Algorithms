//https://www.scaler.com/academy/mentee-dashboard/class/34842/assignment/problems/11753?navref=cl_tt_nv
package day6_IfElse1;

import java.util.Scanner;

public class ProfitOrLoss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        int S = sc.nextInt();

        int answer = S - C;
        if(answer > 0)
        {
            System.out.println("1");
            System.out.println(answer);
        }

        else
        {
            System.out.println("-1");
            System.out.println(Math.abs(answer));
        }

	}

}
