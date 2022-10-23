//https://www.scaler.com/academy/mentee-dashboard/class/36228/homework/problems/11652?navref=cl_tt_nv
package day27_Strings2;

public class CharIndex {
	
	public String solve(String A) {

        String res = "";
        for(int i=0; i<A.length(); i++)
        {
            res += A.charAt(i);
            res += A.charAt(i) - 96;
        }
        return res;
    }

}
