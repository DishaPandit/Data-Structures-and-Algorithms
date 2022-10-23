//https://www.scaler.com/academy/mentee-dashboard/class/36222/homework/problems/21794?navref=cl_tt_nv
package day20_1DArrayProblem1;

public class FirstMultiple {
	
	public static int first_multiple(int[] ls, int x) {
	    
	    for(int i=0; i<ls.length; i++)
	    {
	        if(ls[i] % x == 0)
	            return ls[i];
	    }
	    return -1;

	}



}
