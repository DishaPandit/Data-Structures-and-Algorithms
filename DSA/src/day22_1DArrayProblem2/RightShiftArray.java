//https://www.scaler.com/academy/mentee-dashboard/class/36223/homework/problems/22762?navref=cl_tt_nv
package day22_1DArrayProblem2;

import java.util.Scanner;

public class RightShiftArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++)
        {
            a[i] = sc.nextInt();
        }

        int temp = a[n-1];
        for(int i=n-2; i>=0; i--)
        {
            a[i+1] = a[i];
        }
        a[0] = temp;

        for(int i=0; i<n; i++)
        {
            System.out.print(a[i] + " ");
        }

	}

}
