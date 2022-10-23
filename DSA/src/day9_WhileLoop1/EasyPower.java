//https://www.scaler.com/academy/mentee-dashboard/class/36211/homework/problems/11249?navref=cl_tt_nv
package day9_WhileLoop1;

import java.util.Scanner;

public class EasyPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int i = 1;
        int ans = 1;
        while(i<=b)
        {
            ans = ans*a;
            i++;
        }
        System.out.println(ans);

	}

}
