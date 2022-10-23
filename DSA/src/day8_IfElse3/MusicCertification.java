//https://www.scaler.com/academy/mentee-dashboard/class/34844/assignment/problems/25344?navref=cl_tt_nv

package day8_IfElse3;
import java.util.Scanner;

public class MusicCertification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n >= 10000000)
        {
            System.out.println("diamond");
        }

        else if(n >= 1000000 && n <10000000)
        {
            System.out.println("platinum");
        }

        else if(n >= 500000 && n < 1000000)
        {
            System.out.println("gold");
        }

        else
            System.out.println("None");

	}

}
