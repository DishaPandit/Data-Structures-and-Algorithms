//https://www.scaler.com/academy/mentee-dashboard/class/36213/assignment/problems/11223?navref=cl_tt_nv
package day11_ForLoop1;

import java.util.Scanner;

public class SummationGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i =1; i<=n ; i++)
        {
            sum = sum + i;
        }
        System.out.println(sum);

	}

}
