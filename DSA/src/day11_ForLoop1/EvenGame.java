//https://www.scaler.com/academy/mentee-dashboard/class/36213/homework/problems/11375?navref=cl_tt_nv
package day11_ForLoop1;

import java.util.Scanner;

public class EvenGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i<=n ; i++)
        {
            if(i %2 == 0)
                System.out.print(i + " ");
        }

	}

}
