//https://www.scaler.com/academy/mentee-dashboard/class/36212/homework/problems/25841?navref=cl_tt_nv
package day10_WhileLoop2;

import java.util.Scanner;

public class CalculateSteps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n > 1)
        {
            n = n/2;
            count++;
        }
        System.out.println(count);

	}

}
