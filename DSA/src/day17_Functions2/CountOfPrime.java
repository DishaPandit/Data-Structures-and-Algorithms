//https://www.scaler.com/academy/mentee-dashboard/class/36219/homework/problems/6779?navref=cl_tt_lst_nm
package day17_Functions2;

public class CountOfPrime {
	
	public int solve(int A) {

        int ans = 0;
        
        for(int i = 2; i<=A; i++)
        {
            int count = 0;
            for(int j = 1; j<=i; j++)
            {
                if(i%j == 0)
                    count++;
            }
            if(count == 2)
                ans++;
        }
        return ans;
    }

}
