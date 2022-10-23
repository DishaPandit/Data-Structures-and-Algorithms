//https://www.scaler.com/academy/mentee-dashboard/class/36214/assignment/problems/25240?navref=cl_tt_nv
package day12_ForLoop2;

import java.util.Scanner;

public class CountFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 2;
        for(int i = 2; i<n; i++)
        {
            if(n%i == 0)
                count++;
        }
        System.out.println(count);   

	}

}
