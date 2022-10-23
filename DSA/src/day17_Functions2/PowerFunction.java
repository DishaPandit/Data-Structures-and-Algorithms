//https://www.scaler.com/academy/mentee-dashboard/class/36219/assignment/problems/11259?navref=cl_tt_lst_nm
package day17_Functions2;

public class PowerFunction {
	
	public int power(final int A, final int B) {

        int ans = 1;
        for(int i = 1; i<=B; i++)
        {
            ans = ans*A;
        }
        return ans;
    }

}
