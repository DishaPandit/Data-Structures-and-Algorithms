//https://www.scaler.com/academy/mentee-dashboard/class/36225/homework/problems/11464?navref=cl_tt_nv
package day24_2DArrayProblems;

import java.util.ArrayList;

public class MatrixMultiplication {
	
	public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> B) {
	       
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

        int rowA = A.size();
        int colA = A.get(0).size();
        int colB = B.get(0).size();

        for(int rowIndexA = 0; rowIndexA < rowA; rowIndexA++) {
            ArrayList<Integer> prod = new ArrayList<Integer>();
            for(int colIndexB = 0; colIndexB < colB; colIndexB++) {
                int sum = 0;
                for(int colIndexA = 0; colIndexA < colA; colIndexA++) {
                    sum += A.get(rowIndexA).get(colIndexA)*B.get(colIndexA).get(colIndexB);
                }
                prod.add(sum);
            }
            result.add(prod);
        }
        return result;
    }

}
