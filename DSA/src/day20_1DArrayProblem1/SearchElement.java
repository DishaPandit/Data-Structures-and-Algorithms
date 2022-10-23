//https://www.scaler.com/academy/mentee-dashboard/class/36222/assignment/problems/11426?navref=cl_tt_lst_nm
package day20_1DArrayProblem1;

import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0)
        {
            int n = sc.nextInt();
            int found = 0;
            int a[] = new int[n];
            for(int i=0; i<n; i++)
            {
                a[i] = sc.nextInt();
            }
            int k = sc.nextInt();
            for(int i = 0; i<n; i++)
            {
                if(a[i] == k)
                    found = 1;
  
            }
            System.out.println(found);
            T--;
        }

	}

}
