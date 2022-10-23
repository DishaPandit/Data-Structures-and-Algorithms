//https://www.scaler.com/academy/mentee-dashboard/class/41328/assignment/problems/11470?navref=cl_tt_lst_nm
package day26_Strings1;

import java.util.Scanner;

public class LengthOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            String s = sc.next();
            int count = 0;
            for(int i=0; i<s.length(); i++)
            {
                count++;
            }
            System.out.println(count);
            t--;
        }  

	}

}
