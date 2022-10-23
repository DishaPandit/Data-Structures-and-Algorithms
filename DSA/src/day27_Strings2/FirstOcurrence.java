//https://www.scaler.com/academy/mentee-dashboard/class/36228/assignment/problems/11491?navref=cl_tt_nv
package day27_Strings2;

public class FirstOcurrence {
	
	public int solve(final String A, final int B) {

        for(int i=0; i<A.length(); i++)
        {
            char ch = A.charAt(i);
            if(ch == B)
                return i;
        }
        return -1;
    }

}
