//https://www.scaler.com/academy/mentee-dashboard/class/36214/homework/problems/10464/hints?navref=cl_pb_nv_tb
package day12_ForLoop2;

import java.util.Scanner;

public class PrintPrime {

	public static boolean isPrime(int n)
    {
        int count = 0;
        if(n==1)
            return false;

        for(int i = 1; i<=n; i++)
        {
            if(n%i == 0)
                count++;
        }

        if(count == 2)
            return true;
        
        else
            return false;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++)
        {
            if(isPrime(i))
                System.out.println(i);

        }

        
    }

}
