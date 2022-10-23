//https://www.scaler.com/academy/mentee-dashboard/class/36226/assignment/problems/16531?navref=cl_tt_nv
package day25_ArrayList;

import java.util.ArrayList;

public class SumOfColums {
	
	public ArrayList<Integer> solve(int A, int B, ArrayList<ArrayList<Integer>> C) {

        ArrayList<Integer> ans = new ArrayList<>();
        for(int j=0; j<B; j++)
        {
            int colSum = 0;
            for(int i=0; i<A; i++)
            {
                colSum += C.get(i).get(j);
            }
            ans.add(colSum);
        }
        return ans;
    }

}
