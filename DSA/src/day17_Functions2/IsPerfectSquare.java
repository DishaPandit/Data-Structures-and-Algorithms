//https://www.scaler.com/academy/mentee-dashboard/class/36219/homework/problems/18029?navref=cl_tt_nv
package day17_Functions2;

import java.util.Scanner;

public class IsPerfectSquare {
	
	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T>0)
        {
            int A = sc.nextInt();
            boolean flag = false;
            for(int i = 1; i*i <= A; i++)
            {
                if(i*i == A)
                {
                    flag = true;
                    System.out.println("1");
                }
                    
                else 
                    continue;    
            }
            if(flag == false)
                System.out.println("0");

            T--;
        }
        
        
    }

}
