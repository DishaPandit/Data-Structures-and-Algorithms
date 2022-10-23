//https://www.scaler.com/academy/mentee-dashboard/class/36226/homework/problems/16511?navref=cl_tt_nv
package day25_ArrayList;
import java.util.ArrayList;

public class LargestInEachRow {
	
	public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {

        ArrayList<Integer> ans =  new ArrayList<>();
        int row = A.size();
        for(int i=0; i<row; i++)
        {
            //col size will not be A.get(0).size() 
            //becoz arraylist me element no. may differ
            int rowMax = A.get(i).get(0);
            for(int j=1; j<A.get(i).size(); j++)
            {
                int val = A.get(i).get(j);
                if(val > rowMax)
                    rowMax = val;
            }
            ans.add(rowMax);
        }
        return ans;
    }

}
