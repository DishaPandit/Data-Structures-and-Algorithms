//https://www.scaler.com/academy/mentee-dashboard/class/36211/assignment/problems/11377?navref=cl_tt_nv
package day9_WhileLoop1;

import java.util.Scanner;

public class OddGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 1;
        while(i <= n)
        {
            if(i % 2 == 1)
            {
                 System.out.print(i + " ");
            }
            i++;
        }

	}

}
