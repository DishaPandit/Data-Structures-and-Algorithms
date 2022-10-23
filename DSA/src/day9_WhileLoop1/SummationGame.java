//https://www.scaler.com/academy/mentee-dashboard/class/36211/assignment/problems/11223?navref=cl_tt_nv
package day9_WhileLoop1;

import java.util.Scanner;

public class SummationGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 1;
        int sum = 0;
        while(i <= n)
        {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);

	}

}
