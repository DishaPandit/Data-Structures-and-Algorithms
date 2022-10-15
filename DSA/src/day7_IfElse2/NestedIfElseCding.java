//https://www.scaler.com/academy/mentee-dashboard/class/34843/homework/problems/25341?navref=cl_tt_nv
package day7_IfElse2;

import java.util.Scanner;

public class NestedIfElseCding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n>=10 && n<=20)
        {
            int m = sc.nextInt();
            System.out.println(n+m);

            if(n+m >= 100)
            {
                System.out.println("That is a large sum!");
            }
        }
        else
            System.out.println("-1");

	}

}
