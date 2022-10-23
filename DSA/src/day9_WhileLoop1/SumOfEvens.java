//https://www.scaler.com/academy/mentee-dashboard/class/36211/homework/problems/25479?navref=cl_tt_nv
package day9_WhileLoop1;

import java.util.Scanner;

public class SumOfEvens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i = 1;
        int sum = 0;
        while(i <= a)
        {
            if(i % 2 == 0)
            {
                sum = sum + i;
            }
            i++;
        }
        System.out.println(sum);

	}

}
