//https://www.scaler.com/academy/mentee-dashboard/class/36226/homework/problems/11617?navref=cl_tt_nv
package day25_ArrayList;
import java.util.ArrayList;

public class RowandColumnSum {
	
	public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {

        ArrayList<Integer> ans = new ArrayList<>();

        //for rowSum
        for(int i=0; i<A.size(); i++)
        {
            int rowSum = 0;
            for(int j=0; j<A.get(0).size(); j++)
            {
                rowSum += A.get(i).get(j);
            }
            ans.add(rowSum);
        }

        //for colSum
        for(int j=0; j<A.get(0).size(); j++)
        {
            int colSum = 0;
            for(int i=0; i<A.size(); i++)
            {
                colSum += A.get(i).get(j);
            }
            ans.add(colSum);
        }
        return ans;
    }

}
