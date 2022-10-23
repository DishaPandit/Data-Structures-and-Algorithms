//https://www.scaler.com/academy/mentee-dashboard/class/41328/assignment/problems/22290?navref=cl_tt_nv
package day26_Strings1;

public class ReplacingCharacter {

	public static String change_char(String s) {
	    // complete the function template

	    String ans = "";
	    ans = ans + s.charAt(0);
	    char ch = s.charAt(0);
	    for(int i=1; i<s.length(); i++)
	    {
	        if(s.charAt(i) != ch)
	            ans = ans +  s.charAt(i);
	        else
	            ans = ans + "$";
	    }
	    return ans;
	}

}
