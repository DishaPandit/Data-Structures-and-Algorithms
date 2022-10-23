//https://www.scaler.com/academy/mentee-dashboard/class/41328/homework/problems/22287?navref=cl_tt_nv
package day26_Strings1;

public class Palindrome {
	
	public static boolean isPalin(String s) {
	    
	    String rev = "";
	    for(int i = s.length()-1; i>= 0; i--)
	    {
	        rev = rev + s.charAt(i);
	    }
	    if(rev.equals(s))
	        return true;
	    else 
	        return false;
	}

}
