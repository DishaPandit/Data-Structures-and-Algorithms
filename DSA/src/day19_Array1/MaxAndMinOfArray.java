//https://www.scaler.com/academy/mentee-dashboard/class/36221/assignment/problems/11552?navref=cl_tt_nv
package day19_Array1;

import java.util.Scanner;

public class MaxAndMinOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++)
        {
            a[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++)
        {
            if(a[i]<min)
                min = a[i];

            if(a[i]>max)
                max = a[i];
        }
        System.out.print(max + " " + min);

	}

}
