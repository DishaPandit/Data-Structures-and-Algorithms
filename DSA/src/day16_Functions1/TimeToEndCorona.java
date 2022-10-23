//https://www.scaler.com/academy/mentee-dashboard/class/36218/homework/problems/27414?navref=cl_tt_nv
package day16_Functions1;

public class TimeToEndCorona {
	
	public int solve(int A, int B, int C) {

        int count = 0;
        
        while(C>0)
        {
            int casesBeforeRecovery = B+C;
            int casesAfterRecovery = casesBeforeRecovery - A;
            if(casesAfterRecovery < 0)
                C = 0;
            else
                C = casesAfterRecovery;
            count++;
        }
        return count;
    }

}
