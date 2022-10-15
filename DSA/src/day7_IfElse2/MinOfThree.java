//https://www.scaler.com/academy/mentee-dashboard/class/34843/homework/problems/11667?navref=cl_tt_nv
package day7_IfElse2;

public class MinOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a<=b && a<=c)
            System.out.println(a);

        else if(b<=a && b<=c)
            System.out.println(b);
        
        else 
            System.out.println(c);

	}

}
