//https://www.scaler.com/academy/mentee-dashboard/class/34841/assignment/problems/25465?navref=cl_tt_nv
package day5_IntroToJavaOperators;

import java.util.Scanner;

public class LogicalPrinting {
public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        System.out.println("Number 1 is " + n1);
        System.out.println("Number 2 is " + n2);
        System.out.println("Number 3 is " + n3);
        System.out.println("(n1 < n2) condition is " + (n1 < n2));
        System.out.println("(n2 == n3) condition is " + (n2 == n3));
        System.out.println("(n1 < n2) && (n2 == n3) condition is " + ((n1 < n2) && (n2 == n3)));

        
    }

}
