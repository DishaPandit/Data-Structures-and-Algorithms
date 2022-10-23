//https://www.scaler.com/academy/mentee-dashboard/class/36228/assignment/problems/11490?navref=cl_tt_lst_nm
package day27_Strings2;

public class DiverseCharacters {
	
	public int solve(final String A) {

        int alphabets = 0;
        int digits = 0;

        for(int i=0; i<A.length(); i++)
        {
            char ch = A.charAt(i);
            if( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
                alphabets++;
            
            else if(ch >= '0' && ch <= '9')
                digits++;
        }
        return Math.max(alphabets,digits);
    }

}
