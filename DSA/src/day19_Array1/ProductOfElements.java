//https://www.scaler.com/academy/mentee-dashboard/class/36221/assignment/problems/22194?navref=cl_tt_nv
package day19_Array1;

import java.util.ArrayList;

public class ProductOfElements {

	public static long solve(ArrayList<Integer> arr) {
	    
	    long product = 1;
	    for(int i=0; i<arr.size(); i++)
	    {
	        product = product * arr.get(i);
	    }
	    return product;
	}
}
