package day13_ForLoop3;

import java.util.Scanner;

public class LectureCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		//H.C.F OF TWO NUMBERS
		// int A = sc.nextInt();
		// int B = sc.nextInt();
		
		//min of A and B
		// int min = 0;
		// if(A > B){
		// 	min = B;
		// }else{
		// 	min = A;
		// }
		// min = Math.min(A, B); 
		
		/*
		int ans = 0;
		// A = 15.   B = 25.  1 to 15
		for(int i = 1; i <= Math.min(A, B); i++){
			if(A % i == 0 && B % i == 0){
				ans = i;
			}
		}
		System.out.println(ans);
				
				
		// A = 25  B = 100
		// 1, 5, 25 
		
		
		// A = 15.   B = 25
		int ans = 0;
		for(int i = Math.min(A, B) ; i >= 1; i--){
			if(A % i == 0 && B % i == 0){
				ans = i;
				break;
			}
		}
		System.out.println(ans);
		
		
		// ans = 0 		A = 25 		B = 100
		i 		i >= 1		(25 % i == 0 && 100 % i == 0)	  ans 		i--
		25		true		25%25 = 0.  100 % 25 = 0 (true)	   25 ------>break	
		
		
		
		ans = 0  A = 15  B = 25.   min = 15
		i 	i >= 1		15%i == 0 && 25%i == 0 			ans			i--
		15	true		15%15 = 0  25%15 = 10 (false)	-			14
		14	true		15%14 = 1 (false)				-			13
		13	true		15%13 = 2 (false)				-			12
		12 	true		15%12 = 3(false)				-			11
		11	true		15%11 = 4 (false)				-			10
		10	true		15%10 = 5 (false)				-			9
		9 	true		15%9 = 6 (false)				-			8
		8 	true 		15%8 = 7(false) 				-			7
		7	true		15%7 = 8 (false) 				-			6
		6	true		15%6 = 9 (false)				-			5
		5 	true		15%5 = 0.  25%5 = 0 (true)		5 -------break
		
		
		//try to implement this using for loop
		while(A%B!=0){
			int rem=A%B;
			A=B;
			B=rem;
		}
		System.out.println(B);
		}
		*/
		
		/*
		
		// Sum of even and odd digits in a NUMBERS
		int N = 8563512;
		// odd digits --> 5 3 5 1  
		// sum of odd digits = 5 + 3 + 5 + 1 = 14
		// even digits --> 8 6 2
		// sum of even digits = 8 + 6 + 2 = 16
		
		int even_sum = 0;
		int odd_sum = 0;
		for(int i = N; i > 0; i = i / 10){
			int digit = i % 10;
			//System.out.println(digit);
			if(digit % 2 == 0){
				even_sum += digit;
			}else{
				odd_sum  += digit;
			}
			
		}
		System.out.println(even_sum);
		System.out.println(odd_sum);

		
		/*
			i  			i > 0 		digit = (i %10)				i = i/10
		8563512 		true			2	--> Print(2)		856351
		856351			true			1   --> Print(1)		85635
		85635			true			5	--> Print(5)		8563
		8563			true			3	--> Print(3)		856
		856				true			6	--> Print(6)		85
		85 				true			5   --> Print(5) 		8
		8 				true			8	--> Print(8)		0
		0				false ------------------------>break			
		
		*/
		
		//sum of odd and even index digits
		
		// int N = 8563512;
		/*
		index	digit
		1  --> 	 2
		2  -->   1
		3  -->   5
		4  -->   3
		5  --> 	 6
		6  -->   5
		7  -->   8
		
		even indexed digits -->  1  3  5
		sum of even indexes = 1 + 3 + 5 = 9
		odd indexed digits  -->  2  5  6  8
		sum of odd indexes = 2 + 5 + 6 + 8 = 21
		
		
		int even_index_sum = 0;
		int odd_index_sum = 0;
		int index = 1;
		for(int i = N; i > 0; i = i / 10){
			int digit = i % 10;
			//System.out.println(digit);
			if(index % 2 == 0){
				even_index_sum += digit;
			}else{
				odd_index_sum  += digit;
			}
			
			index = index + 1;
			
		}
		System.out.println(even_index_sum);
		System.out.println(odd_index_sum);
		
		es = 0   os = 0
		index 	i 		i>0		digit 	index%2 == 0   es  os    i = i/10
		1	  8563512 	true 	 2 			false      0   2 	  856351
		2 	  856351	true	 1			true	   1   2 	  85635	
		3	  85635		true	 5			false	   1   7 	  8563
		4	  8563		true	 3			true	   4 	7		856
		5     856   	true	 6 			false	   4	13		85
		6	  85		true	 5			true	   9	13		8
		7	  8 		true	 8			false	   9 	21		0
		8	  0			false
		*/
		
		/*
		//Armstrong Number or Not
		// int n = sc.nextInt();
		int sum = 0;
		for(int i = n; i > 0; i = i /10){
			int dig = i %10;
			sum = sum + (dig*dig*dig);
			
		}
		if(sum == n){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
		
		*/
		
		
		
		/*
		//Print all Armstrong numbers from 1 to N
		int N = sc.nextInt();
		
		for(int num = 1; num <= N; num++){
			int sum = 0;
			for(int i = num; i > 0; i = i /10){
				int dig = i %10;
				sum = sum + (dig*dig*dig);
			}
			if(sum == num){
				System.out.println(num);
			}
			
		}
		
		// N = 5
		// num   num <= 5 	i   i > 0   dig  sum   i = i/10.  sum ==num. 			num++
		// 1		true	1	true	1	 1		0
		// 				0	false ----------------->break.  true Print(1)		2
		// 2		true.   2	true	2	 8		0		
		// 				0	false ----------------->break.  false               3
		
		*/
		
		
		//Doubt
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		// while(A%B != 0){
		// 	int rem = A % B;
		// 	A = B; 
		// 	B = rem;
		// }
		
		// System.out.print(B);
		
		int rem = 0;
		for(; A%B != 0;  B = rem){
			rem = A % B;
			A = B;
		}
		System.out.print(B);

	}

}
