//https://www.scaler.com/academy/mentee-dashboard/class/41328/homework/problems/11803?navref=cl_tt_lst_nm
package day26_Strings1;

public class ReverseWord {
	
	public String solve(String A) {

        String rev = "";
        for(int i = A.length()-1; i>=0; i--)
        {
            rev = rev + A.charAt(i);
        }
        return rev;
    }

}
