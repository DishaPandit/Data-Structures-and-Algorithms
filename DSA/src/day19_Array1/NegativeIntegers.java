//https://www.scaler.com/academy/mentee-dashboard/class/36221/homework/problems/11394?navref=cl_tt_lst_nm
package day19_Array1;

import java.util.Scanner;

public class NegativeIntegers {
	
	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++)
        {
            a[i] = sc.nextInt();
            if(a[i] < 0)
                System.out.print(a[i] + " ");
        }

        
    }

}
