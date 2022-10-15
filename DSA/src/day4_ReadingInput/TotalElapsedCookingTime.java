//https://www.scaler.com/academy/mentee-dashboard/class/34840/assignment/problems/24543?navref=cl_tt_nv
package day4_ReadingInput;

import java.util.Scanner;

public class TotalElapsedCookingTime {
	
public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int layer = sc.nextInt();
        int prepTime = sc.nextInt();
        int answer = layer*2 + prepTime;
        System.out.println(answer);

        
    }

}
