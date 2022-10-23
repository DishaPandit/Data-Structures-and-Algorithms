//https://www.scaler.com/academy/mentee-dashboard/class/34844/assignment/problems/25343?navref=cl_tt_nv
package day8_IfElse3;

import java.util.Scanner;

public class PacMan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        int isPelletActive = sc.nextInt();
        int isTouchingGhost = sc.nextInt();

        if(isPelletActive == 0 && isTouchingGhost == 1)
            System.out.println("1");
        
        else
            System.out.println("0");

	}

}
