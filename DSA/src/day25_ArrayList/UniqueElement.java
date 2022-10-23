//https://www.scaler.com/academy/mentee-dashboard/class/36226/homework/problems/21182?navref=cl_tt_lst_nm
package day25_ArrayList;
import java.util.ArrayList;

public class UniqueElement {
	
	public int solve(ArrayList<Integer> A) {

        int ans = 0;
        for(int i=0; i<A.size(); i++)
        {
            int count = 0;
            for(int j=0; j<A.size(); j++)
            {
                //both methods can be used
                //if(A.get(i).intValue() == A.get(j).intValue())
                if(A.get(i).equals(A.get(j)))
                    count++;
            
            }
            if(count == 1)
            {
                ans = A.get(i);
                break;
            }
        }
        return ans;
    }

}
