//https://www.scaler.com/academy/mentee-dashboard/class/34840/homework/problems/24649?navref=cl_tt_lst_nm
package day4_ReadingInput;

import java.util.Scanner;

public class CalculateCurrencyChange {
	
public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int budget = sc.nextInt();
        int exchangingAmount = sc.nextInt();
        int moneyLeft = budget - exchangingAmount;
        System.out.println(moneyLeft);
        
    }

}
