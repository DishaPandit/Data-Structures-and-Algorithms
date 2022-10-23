//https://www.scaler.com/academy/mentee-dashboard/class/36223/homework/problems/11458?navref=cl_tt_lst_nm
package day22_1DArrayProblem2;

import java.util.Scanner;

public class InsertThat {
	
	public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        //taking array element from user
        for(int i=0; i<n; i++)
        {
            a[i] =  sc.nextInt();
        }

        int pos = sc.nextInt();     //position at which insertion will happen
        //System.out.println(pos); 
        int y = sc.nextInt();       //element to be inserted

        //answer array b of size n+1
        int[] b = new int[n + 1];
        for(int i=0; i<n+1; i++)
        {
            if(i < pos-1)
                b[i] = a[i];    

            else if(i == pos-1)
                b[i] = y;

            else
                b[i] = a[i-1];
        }

        //printing output array
        for(int i=0; i<n+1; i++)
        {
            System.out.print(b[i] + " ");
        }    
    }

}
