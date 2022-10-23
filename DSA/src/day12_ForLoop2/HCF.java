//https://www.scaler.com/academy/mentee-dashboard/class/36214/homework/problems/25474?navref=cl_tt_nv
package day12_ForLoop2;

import java.util.Scanner;

public class HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int hcf = 1;

        for(int i=2; i<=a && i<=b ; i++)
        {
            if(a%i == 0 && b%i == 0)
                hcf = Math.max(hcf,i);
        }
        System.out.println(hcf);

	}

}
