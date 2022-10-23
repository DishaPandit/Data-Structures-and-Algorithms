//https://www.scaler.com/academy/mentee-dashboard/class/36228/assignment/problems/11800?navref=cl_tt_nv
package day27_Strings2;

public class LowToHigh {
	
	public String solve(String A) {

        String ans = "";
        for(int i = 0; i<A.length(); i++)
        {
            char ch = (char)(A.charAt(i) - 'a' + 'A');
            ans = ans + ch;
        }
        return ans;
    }

}
