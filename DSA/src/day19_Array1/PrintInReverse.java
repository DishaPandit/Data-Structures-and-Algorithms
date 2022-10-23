//https://www.scaler.com/academy/mentee-dashboard/class/36221/assignment/problems/11555?navref=cl_tt_lst_nm
package day19_Array1;

import java.util.Scanner;

public class PrintInReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++)
        {
            a[i] = sc.nextInt();
        }

        for(int i=n-1; i>=0; i--)
        {
            System.out.print(a[i] + " ");
        }
        
		

	}

}
