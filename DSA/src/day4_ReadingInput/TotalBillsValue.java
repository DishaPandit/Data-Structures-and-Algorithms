//https://www.scaler.com/academy/mentee-dashboard/class/34840/homework/problems/24625?navref=cl_tt_nv
package day4_ReadingInput;

import java.util.Scanner;

public class TotalBillsValue {
	
public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int billValue = sc.nextInt();
        int totalBills = sc.nextInt();
        int totalValue = billValue * totalBills;
        System.out.println(totalValue);
        
    }

}
