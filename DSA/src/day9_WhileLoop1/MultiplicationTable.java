//https://www.scaler.com/academy/mentee-dashboard/class/36211/homework/problems/11228?navref=cl_tt_nv
package day9_WhileLoop1;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i = 1;
        while(i <= 10)
        {
            System.out.println(a + " " + "* " + i + " = " + a*i);
            i++;
        }

	}

}
