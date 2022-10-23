//https://www.scaler.com/academy/mentee-dashboard/class/36218/homework/problems/21386?navref=cl_tt_nv
package day16_Functions1;

public class CelsiusToFahrenheit {
	
	public static double solve(double celsius) {

	    double fahrenheit = celsius*1.8 + 32;
	    double ans = Math.round(fahrenheit*100)/100d;
	    return ans;
	 
	}

}
