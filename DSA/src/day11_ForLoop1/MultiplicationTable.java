//https://www.scaler.com/academy/mentee-dashboard/class/36213/homework/problems/11228?navref=cl_tt_nv
package day11_ForLoop1;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for(int i = 1; i<=10; i++)
        {
            System.out.println(a + " * " + i + " = " + a*i );
        }

	}

}
