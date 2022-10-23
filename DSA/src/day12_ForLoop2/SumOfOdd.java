//https://www.scaler.com/academy/mentee-dashboard/class/36214/assignment/problems/11220?navref=cl_tt_nv
package day12_ForLoop2;

import java.util.Scanner;

public class SumOfOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        for(int i = 1; i<=a; i+=2)
        {
            sum = sum + i;
        }
        System.out.println(sum);

	}

}
