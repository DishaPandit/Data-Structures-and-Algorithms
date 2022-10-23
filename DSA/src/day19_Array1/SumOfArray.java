//https://www.scaler.com/academy/mentee-dashboard/class/36221/assignment/problems/11424?navref=cl_tt_nv
package day19_Array1;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++)
        {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        System.out.println(sum); 

	}

}
