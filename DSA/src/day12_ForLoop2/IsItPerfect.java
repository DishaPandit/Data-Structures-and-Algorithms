//https://www.scaler.com/academy/mentee-dashboard/class/36214/assignment/problems/11292?navref=cl_tt_nv
package day12_ForLoop2;

import java.util.Scanner;

public class IsItPerfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n ; i++)
        {
            int a = sc.nextInt();
            int sum = 0;
            for(int j=1; j<a; j++)
            {
                if(a%j == 0)
                    sum = sum + j;
            }
            if(sum == a)
                System.out.println("YES");
            else
                System.out.println("NO");
        }

	}

}
