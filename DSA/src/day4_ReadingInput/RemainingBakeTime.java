//https://www.scaler.com/academy/mentee-dashboard/class/34840/assignment/problems/24541?navref=cl_tt_lst_nm

package day4_ReadingInput;

import java.util.Scanner;

public class RemainingBakeTime {
	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int timeInOven = sc.nextInt();
        int timeLeft = 40 - timeInOven;
        System.out.println(timeLeft);
        
    }
}
