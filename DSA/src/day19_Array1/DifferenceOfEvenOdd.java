//https://www.scaler.com/academy/mentee-dashboard/class/36221/homework/problems/22186?navref=cl_tt_nv
package day19_Array1;

public class DifferenceOfEvenOdd {
	
	public static int even_odd(int[] ls) {
	    
	    int evenSum = 0;
	    int oddSum = 0;
	    for(int i = 0; i<ls.length; i++)
	    {
	        if(ls[i]%2==0)
	            evenSum+=ls[i];
	        
	        else
	            oddSum+=ls[i];
	    }
	    return evenSum-oddSum;
	}

}
