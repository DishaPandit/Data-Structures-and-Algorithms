//https://www.scaler.com/academy/mentee-dashboard/class/34844/homework/problems/25527?navref=cl_tt_nv
package day8_IfElse3;

import java.util.Scanner;

public class FindLargestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        if(n1>=n2 && n1>=n3)
            System.out.println(n1 + " is largest number");

        else if(n2>=n1 && n2>=n3)
            System.out.println(n2 + " is largest number");

        else
            System.out.println(n3 + " is largest number");

	}

}
