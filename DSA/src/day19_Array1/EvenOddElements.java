//https://www.scaler.com/academy/mentee-dashboard/class/36221/homework/problems/11425?navref=cl_tt_nv
package day19_Array1;

import java.util.Scanner;

public class EvenOddElements {
	
	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0)
        {
            int n = sc.nextInt();
            int a[] = new int[n];
            int evenCount = 0;
            int oddCount = 0;

            for(int i = 0; i<n; i++)
            {
                a[i] = sc.nextInt();
                if(a[i]%2 == 0)
                    evenCount++;    
                else
                    oddCount++;
            }
            System.out.println(Math.abs(evenCount-oddCount));
            T--;
        }
        
    }

}
