//https://www.scaler.com/academy/mentee-dashboard/class/36213/homework/problems/11249?navref=cl_tt_nv
package day11_ForLoop1;

import java.util.Scanner;

public class EasyPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int ans = 1;
        while(b>0)
        {
            ans = ans * a;
            b--;
        }

        System.out.println(ans);

	}

}
