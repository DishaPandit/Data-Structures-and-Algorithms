//https://www.scaler.com/academy/mentee-dashboard/class/36221/homework/problems/11553?navref=cl_tt_nv
package day19_Array1;

import java.util.Scanner;

public class CopyTheArray {

	public int[] solve(final int[] A, int B) {

        Scanner sc = new Scanner(System.in);
        int n = A.length;
        int copy[] = new int[n];
        for(int i=0; i<n; i++)
        {
            copy[i] = A[i] + B;
        }
        return copy;
    }

}
