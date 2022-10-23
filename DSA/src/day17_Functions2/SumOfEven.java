//https://www.scaler.com/academy/mentee-dashboard/class/36219/homework/problems/10465?navref=cl_tt_nv
package day17_Functions2;

public class SumOfEven {
	
	public int solve(int A) {

        int evenSum = 0;
        for(int i = 1; i<=A; i++)
        {
            if(i%2 == 0)
                evenSum+=i;
        }
        return evenSum;
    }

}
