//https://www.scaler.com/academy/mentee-dashboard/class/36213/homework/problems/11377?navref=cl_tt_nv
package day11_ForLoop1;

import java.util.Scanner;

public class OddGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i<=n ; i++)
        {
            if(i %2 == 1)
                System.out.print(i + " ");
        }

	}

}
