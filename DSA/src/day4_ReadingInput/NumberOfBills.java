//https://www.scaler.com/academy/mentee-dashboard/class/34840/homework/problems/24648?navref=cl_tt_nv
package day4_ReadingInput;

import java.util.Scanner;

public class NumberOfBills {
public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double budget = sc.nextDouble();
        int bill = sc.nextInt();
        int totalBills = (int) (budget/bill);
        System.out.println(totalBills);
        
    }
}
