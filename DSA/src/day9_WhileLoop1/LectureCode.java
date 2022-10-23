package day9_WhileLoop1;

import java.util.Scanner;

public class LectureCode {
	
	public static void main(String args[]) {
		// Your code goes here
        Scanner scn = new Scanner (System.in);
        
        /*
        int i = 1; //Step:1 Initialise loop/condition variable
        
        //Step:2 write while condition
        while(i <= 100) {
            //Step:3 write code for your task
            System.out.println(i);
            
            //Step:4 update loop/condition variable
            i = i + 1;
        }
        */
        
        
        //2. Given n, print natural number till n
        /*
        int n = scn.nextInt();
        int i = 1;
        
        while(i <= n) {
            System.out.println(i);
            i = i + 1;
        }
        */
        
        //3. Given n, print all even numbers from 0 to n
        //n = 15 -> 0,2,4,6,8,10,12,14
        //n = 6 ->  0,2,4,6
        
        //1st approach
        //i->0,1,2,3,4,5,6...
        /*
        int n = scn.nextInt();
        int i = 0;
        
        while(i <= n) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
            i++; //i = i+1
        }
        */
        
        //2nd approach
        //i->0,2,4,6,8...
        /*
        int n = scn.nextInt();
        int i = 0;
        
        while(i <= n) {
            System.out.println(i);
            i = i + 2;
        }
        */
        
        //2nd approach is better (we are travelling less in while loop in 2nd approach)
        
        //5. Given n, print all odd numbers from 1 to n
        //n = 15 -> 1,3,5,7,9,11,13,5
        //n = 6 ->  1,3,5
        
        
        //1st approach
        //i->1,2,3,4,5....
        /*
        int n = scn.nextInt();
        int i = 1;
        
        while(i <= n) {
            if(i % 2 == 1) {
                System.out.println(i);
            }
            i++;
        }
        */
        
        //2nd approach
        //i->1,3,5,7....
        
        /*
        int n = scn.nextInt();
        int i = 1;
        
        while(i <= n) {
            System.out.println(i);
            i = i + 2;
        }
        */
        
        //5. Given n, print all the multiples of 4 from 1 to n
        //n = 18 -> 4,8,12,16
        //n = 50 -> 4,8,12,16,20,24,28,32,36,40,44,48
        
        /*
        int n = scn.nextInt();
        int i = 4;
        
        while(i <= n) {
            System.out.println(i);
            i = i + 4;
        }
        
        //i = 4,8,12,16,20... (our code)
        //i = 1,2,3,4,5,6,7,8... (i % 4 == 0)
        */
        
        /*
        int n = scn.nextInt();
        int i = 1;
        
        while(4 * i <= n) {
            System.out.println(4 * i);
            i++;
        }
        */
        
        
        //6.Print numbers from 5 to 1
        /*
        int i = 50;
        
        while(i >= 1) {
            System.out.println(i);
            i = i-1; //i--
        }
        */
        
        
        //7.Given n, Print numbers from n to 1
        /*
        int n = scn.nextInt();
        int i = n;
        
        while(i >= 1) {
            System.out.println(i);
            i = i-1; //i--
        }
        */
        
        /*
        int i = 5;
        while(i <= 10){
            System.out.println(i);
            i = i*2;
        }
        
        //i -> 5  o/p 5
        //i -> 10 o/p 10
        //i -> 20 condition fails(loop breaks)
        */
        
        /*
        int i = 0;
        while(i <= 5){  
            System.out.println(i);
            i = i-1; 
        }
        
        //i -> 0  o/p : 0
        //i -> -1 o/p : -1
        //i -> -2 o/p : -2
        //i -> -3 o/p : -3
        //infinite loop
        */
        
        
        /*int i = 0;
        while(i <= 6) {
            System.out.println(i);
            i = i * 2;
        }
        */
                
        /*
          i     o/p
          0     0
          0     0
          0     0
          .
          .
          (infinite loop)
        */
          
        
        //Doubts
        //compilation stage(syntax) -> runtime stage(code is running)
        
        /*
        int i = 1;
        while(i <= 5) {
            int a = 10;
            System.out.println(a * i);
            i++;
        }
        System.out.println(i); //correct
        System.out.println(a); //incorrect
        
        //i -> 1,2,3,4,5
        */
        
        

	}

}
