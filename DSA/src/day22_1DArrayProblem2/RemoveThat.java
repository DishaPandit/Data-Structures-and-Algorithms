//https://www.scaler.com/academy/mentee-dashboard/class/36223/homework/problems/11456?navref=cl_tt_nv
package day22_1DArrayProblem2;

import java.util.Scanner;

public class RemoveThat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        //taking array element from user
        for(int i=0; i<n; i++)
        {
            a[i] =  sc.nextInt();
        }
        int pos = sc.nextInt();     //position at which deletion will happen
       
        //answer array b of size n-1
        int[] b = new int[n - 1];
        for(int i=0; i<n-1; i++)
        {
            if(i < pos-1)
                b[i] = a[i];    

            else
                b[i] = a[i+1];
        }

        //printing output array
        for(int i=0; i<n-1; i++)
        {
            System.out.print(b[i] + " ");
        }

	}

}
