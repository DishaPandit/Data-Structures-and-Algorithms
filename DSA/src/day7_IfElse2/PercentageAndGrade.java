//https://www.scaler.com/academy/mentee-dashboard/class/34843/assignment/problems/11674?navref=cl_tt_nv
package day7_IfElse2;

import java.util.Scanner;

public class PercentageAndGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        int percentage = ((a+b+c+d+e)*100)/500;         
        //Since integer division hai to pehle 100 se multiply krolo
        //taki numerator ki value badi ho jaye else output 0 aaega
        //you can also write : (a+b+c+d+e)/5 to calculate percentage
        System.out.println(percentage);

        if(percentage >= 90)
            System.out.println("A");

        else if(percentage >= 80 && percentage < 90)
            System.out.println("B");

        else if(percentage >= 70 && percentage < 80)
            System.out.println("C");

        else if(percentage >= 60 && percentage < 70)
            System.out.println("D");

        else if(percentage >= 40 && percentage < 60)
            System.out.println("E");

        else if(percentage < 40)
            System.out.println("F");
        

	}

}
