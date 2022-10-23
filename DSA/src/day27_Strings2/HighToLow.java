//https://www.scaler.com/academy/mentee-dashboard/class/36228/homework/problems/11801?navref=cl_tt_nv
package day27_Strings2;

public class HighToLow {
	
	public String solve(String A) {

        String ans = "";
        for(int i=0; i<A.length(); i++)
        {
            ans += (char)(A.charAt(i) + 32);
        }
        return ans;
    }

}
