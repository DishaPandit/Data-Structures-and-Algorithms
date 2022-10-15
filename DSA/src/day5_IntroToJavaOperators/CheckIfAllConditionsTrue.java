//https://www.scaler.com/academy/mentee-dashboard/class/34841/assignment/problems/25473?navref=cl_tt_nv
package day5_IntroToJavaOperators;

import java.util.Scanner;

public class CheckIfAllConditionsTrue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        System.out.println("Number 1 is " + n1);
        System.out.println("Number 2 is " + n2);
        System.out.println("Number 3 is " + n3);
        System.out.println((n1 < 50) && (n2 > n3) && (n1 <= n3));

	}

}
