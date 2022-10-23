//https://www.scaler.com/academy/mentee-dashboard/class/36212/homework/problems/10461?navref=cl_tt_nv
package day10_WhileLoop2;

import java.util.Scanner;

public class ArmstrongNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        
        int i = 1;
        while( i <= n)
        {
            int num = i;
            int sumofCube = 0;
            while( num > 0 )
            {
                int digit = num % 10;
                sumofCube = sumofCube + (digit*digit*digit);
                num = num/10;
            }
            //System.out.println("Sum of " + i + " cube : " + sumofCube);
            // ek sysout daalte hi sab smjh aa gya
            //neeche wale if statement ke baad semicolon laga tha
            //jiski wajah se if staement execute nhi ho rha tha//aur saare sumOfCube print ho rhe the
            if(sumofCube == i)
                System.out.println(sumofCube);

            i++;
        }
        

	}

}
