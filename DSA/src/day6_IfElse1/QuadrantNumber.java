//https://www.scaler.com/academy/mentee-dashboard/class/34842/homework/problems/25633?navref=cl_tt_nv
package day6_IfElse1;

public class QuadrantNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if(x>0 && y>0)
            System.out.println(x + ", " + y + " belongs to First Quadrant");
        
        else if(x<0 && y>0)
            System.out.println(x + ", " + y + " belongs to Second Quadrant");

        else if(x<0 && y<0)
            System.out.println(x + ", " + y + " belongs to Third Quadrant");

        else
            System.out.println(x + ", " + y + " belongs to Fourth Quadrant");

	}

}
