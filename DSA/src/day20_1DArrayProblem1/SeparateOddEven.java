//https://www.scaler.com/academy/mentee-dashboard/class/36222/assignment/problems/11570?navref=cl_tt_nv
package day20_1DArrayProblem1;

import java.util.Scanner;

public class SeparateOddEven {
	
	static void printOddEven(int arr[])
    {
        for(int i =0; i<arr.length; i++)
        {
            if(arr[i]%2 ==1)
                System.out.print(arr[i] + " ");
        }
        //odd aur even separate line me print krne ke liye
        System.out.println();
        for(int i =0; i<arr.length; i++)
        {
            if(arr[i]%2 ==0)
                System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0)
        {
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0; i<n; i++)
            {
                a[i] = sc.nextInt();
            }
            printOddEven(a);
            //to print answer of different test cases in different line
            System.out.println();
            T--;
        }
        
    }

}
