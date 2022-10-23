//https://www.scaler.com/academy/mentee-dashboard/class/36226/assignment/problems/11618?navref=cl_tt_nv
package day25_ArrayList;

import java.util.ArrayList;

public class FrequencyCount {
	
	public ArrayList<Integer> solve(ArrayList<Integer> A) {

        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<A.size(); i++)
        {
            int count = 0;
            for(int j=0; j<A.size(); j++)
            {
                //both ways are correct
                //if(A.get(j).intValue() == A.get(i).intValue())
                if(A.get(i).equals(A.get(j)))
                    count++; 
            }
            ans.add(count);
        }
        return ans;
    }

}
