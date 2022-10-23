//https://www.scaler.com/academy/mentee-dashboard/class/36218/homework/problems/11352?navref=cl_tt_nv
package day16_Functions1;

public class RoundedDivision {
	
	public int solve(int A) {

        double d = (double)A/200;
        if(d>=0)
            return (int)Math.round(d);
        else if(d - Math.round(d) <= -0.5)
            return (int)Math.round(d)-1;
        else
            return (int)Math.round(d);
        
    }

}
