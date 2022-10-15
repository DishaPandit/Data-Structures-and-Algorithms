//https://www.scaler.com/academy/mentee-dashboard/class/34842/homework/problems/25307?navref=cl_tt_lst_nm
package day6_IfElse1;

import java.util.Scanner;

public class ClassPerformance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int marks_A1 = sc.nextInt();
        int marks_A2 = sc.nextInt();

        int marks_B1 = sc.nextInt();
        int marks_B2 = sc.nextInt();

        //I missed the decimal part for i/p 65 64 64 66.  
        //Hence used double so that decimal part is also considered

        double avg_A = (double)(marks_A1 + marks_A2)/2;
        double avg_B = (double)(marks_B1 + marks_B2)/2;

        if(avg_A > avg_B)
            System.out.println("True");
        
        else
            System.out.println("False");

	}

}
