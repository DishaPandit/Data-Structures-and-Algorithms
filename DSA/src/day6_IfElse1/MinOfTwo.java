//https://www.scaler.com/academy/mentee-dashboard/class/34842/assignment/problems/11666?navref=cl_tt_nv
package day6_IfElse1;

import java.util.Scanner;

public class MinOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        if(A < B)
            System.out.println(A);
        
        else    
            System.out.println(B);

	}

}
