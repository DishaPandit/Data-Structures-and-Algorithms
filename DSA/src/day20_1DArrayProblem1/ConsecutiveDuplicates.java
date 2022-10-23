//https://www.scaler.com/academy/mentee-dashboard/class/36222/homework/problems/21813?navref=cl_tt_nv
package day20_1DArrayProblem1;

public class ConsecutiveDuplicates {
	
	public static boolean solve(int arr[]) {
	    
	    boolean ans = false;
	    for(int i=0; i<arr.length-1; i++)
	    {
	        if(arr[i] == arr[i+1])
	            ans = true;
	    }
	    return ans;
	}

}
