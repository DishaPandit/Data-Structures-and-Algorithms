//https://www.scaler.com/academy/mentee-dashboard/class/36228/homework/problems/11422?navref=cl_tt_nv
package day27_Strings2;

import java.util.Scanner;

public class VowelvsConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0)
        {
            String s = sc.next();
            int vowels = 0;
            int consonants = 0;
            for(int i=0; i<s.length(); i++)
            {
                char ch = s.charAt(i);
                if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    vowels++;
            }
            consonants = s.length() - vowels;
            System.out.print(vowels + " " + consonants);
            System.out.println();
            T--;
        }

	}

}
