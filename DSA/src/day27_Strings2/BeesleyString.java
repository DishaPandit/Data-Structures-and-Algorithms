//https://www.scaler.com/academy/mentee-dashboard/class/36228/homework/problems/25634?navref=cl_tt_lst_nm
package day27_Strings2;

public class BeesleyString {
	
	public int solve(String A) {

        int pCount = 0;
        int mCount = 0;
        int aCount = 0;

        for(int i = 0; i<A.length(); i++)
        {
            if(A.charAt(i) == 'p')
                pCount++;
            else if(A.charAt(i) == 'm')
                mCount++;
            else if(A.charAt(i) == 'a')
                aCount++;
        }

        if(pCount + aCount == mCount)
            return 1;
        else
             return 0;
    }

}
