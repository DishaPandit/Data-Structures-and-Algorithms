//https://www.scaler.com/academy/mentee-dashboard/class/36214/homework/problems/10465?navref=cl_tt_nv
package day12_ForLoop2;

public class SumOfEven {

	public int solve(int A) {
        
        int sum = 0;
        for(int i=2; i<=A; i+=2)
        {
            sum = sum + i;
        }
        return sum;
    }
}
