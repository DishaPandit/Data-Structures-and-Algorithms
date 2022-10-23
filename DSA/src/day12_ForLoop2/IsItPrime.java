//https://www.scaler.com/academy/mentee-dashboard/class/36214/assignment/problems/11291?navref=cl_tt_nv
package day12_ForLoop2;

import java.util.Scanner;

public class IsItPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a == 1)
        {
            System.out.println("NO");
            return;
        }
        int count = 2;
        for(int i = 2; i<a; i++)
        {
            if(a%i == 0)
                count++;
        }
        if(count == 2)
            System.out.println("YES");
        
        else
            System.out.println("NO");

	}

}
