//https://www.scaler.com/academy/mentee-dashboard/class/36226/assignment/problems/22192?navref=cl_tt_lst_nm
package day25_ArrayList;

import java.util.ArrayList;

public class DivisibleBy5and7 {

	public static ArrayList<Integer> solve(ArrayList<Integer> arr) {
	    
	    ArrayList<Integer> ans = new ArrayList<>();
	    for(int i=0; i<arr.size(); i++)
	    {
	        int val = arr.get(i);
	        if(val % 5 == 0 && val % 7 == 0)
	            ans.add(val);
	    }
	    return ans;
	}

}
