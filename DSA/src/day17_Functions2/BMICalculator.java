//https://www.scaler.com/academy/mentee-dashboard/class/36219/homework/problems/27418?navref=cl_tt_nv
package day17_Functions2;

import java.util.Scanner;

public class BMICalculator {
	
	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int weight = sc.nextInt();

        //cm converted into m
        //decimal round to 1 digit
        double BMI = (double) Math.round(weight/(height*height*0.0001)*10)/10d;

        if(BMI < 18.5)
        {
            System.out.println("Underweight");
            System.out.println(BMI);
        }
        else if(BMI >= 18.5 && BMI <= 24.9)
        {
            System.out.println("Normal");
            System.out.println(BMI);
        }
        else if(BMI > 24.9 && BMI <= 29.9)
        {
            System.out.println("Overweight");
            System.out.println(BMI);
        }
        else if(BMI>29.9)
        {
            System.out.println("Obese");
            System.out.println(BMI);
        }
        
    }

}
