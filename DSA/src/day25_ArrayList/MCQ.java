package day25_ArrayList;

public class MCQ {

//		Ques 1
//		
//		Which of these methods of ArrayList class is used to obtain the present size of an object?
//				
//				1. size()
//				2. length()
//				3. index()
//				4. capacity()
//				
//		Ans : size()
//		
//-----------------------------------------------------------------------------------------------------------------------
//
//		Ques 2
//		
//		Which statement is the correct declaration and initialization of an ArrayList of Integer Values?
//				
//				1. ArrayList<Integer> name = new ArrayList<Integer>();
//				2. ArrayList name = new ArrayList<Integer>();
//				3. ArrayList<Integer> name; name = ArrayList<Integer>();
//				4. Integer<ArrayList> name; name = new Integer<ArrayList>();
//				
//		Ans : ArrayList<Integer> name = new ArrayList<Integer>();
//				
//-----------------------------------------------------------------------------------------------------------------------
//
//		Ques 3
//		
//		Which of the following is the correct way to remove the value 3 from the list nums = [5, 3, 2, 1] ?
//				
//		Ans : nums.remove(1); This would remove the value at index 1 which is 3.
//		
//-----------------------------------------------------------------------------------------------------------------------
//
//		Ques 4
//		
//		What will be the output of the following JAVA program?
//
//				import java.util.*;
//				class ArrayList {
//				    public static void main(String[] args) {
//				         ArrayList<Integer> list = new ArrayList<>();
//				         list.add(1);
//				         list.add(2);
//				         list.add(3);
//				         list.add(1, 47);
//				         list.add(4, 48);
//				         System.out.println(list);
//				     }
//				}
//				
//		Ans : [1, 47, 2, 3, 48].
//		The add(index, E) method is used to insert the given element at the specified position or index. 
//		Similar to the array, the list index starts from 0.
//		
//-----------------------------------------------------------------------------------------------------------------------
//
//		Ques 5
//		
//		What will be the output of the following JAVA program?
//
//				import java.util.*;
//				class ArrayList {
//				    public static void main(String[] args) {
//				         ArrayList<Integer> list = new ArrayList<>();
//				         list.add(1);
//				         list.add(4, 48);
//				         System.out.println(list);
//				     }
//				}
//				
//		Ans : IndexOutOfBoundsException
//		List contains only 1 element, without inserting 3 elements we are trying to insert an element at 4th position 
//		hence we get OutOfBoundsException. We will not get the compile-error because syntactically it is a valid statement.
//		
//--------------------------------------------------------------------------------------------------------------------------
//
//		Ques 6
//		
//		Which index is the last element in an ArrayList called nums at?
//		
//		Ans : last index in arraylist is nums.size() - 1
//		
//---------------------------------------------------------------------------------------------------------------------------
//
//		Ques 7
//		
//		Which of the following is the correct way to get the first value in the arraylist called nums?
//				
//		Ans : nums.get(0), Use the get method to get a value from a list and the first element in a list is at index 0.
//		
//-------------------------------------------------------------------------------------------------------------------------------
//
//		Ques 8
//		
//		Which of the following is the correct way to set the second value in a list called nums to 5?
//				
//		Ans : nums.set(1, 5); This sets the second value in the list to 5.
//		
//-------------------------------------------------------------------------------------------------------------------------------
//
//		Ques 9
//		
//		What will be the output of the following JAVA program?
//
//				import java.util.*;
//				class ArrayList {
//				    public static void main(String[] args) {
//				         ArrayList<Integer> list = new ArrayList<>();
//				         list.add(1);
//				         list.add(0, 2);
//				         System.out.println(list.size());
//				     }
//				}
//				
//		Ans : 2
//		
//--------------------------------------------------------------------------------------------------------------------------------
//
//		Ques 10
//		
//		What will be the output of the following JAVA program?
//
//				import java.util.*;
//				class ArrayList {
//				    public static void main(String[] args) {
//				         ArrayList<Integer> list = new ArrayList<>();
//				         list.add(1);
//				         list.add(2);
//				         list.add(3);
//				         list.add(1, 4);
//				         System.out.println(list);
//				     }
//				}
//				
//		Ans : [1, 4, 2, 3]
//				list.add(val), will simply add val in the end and list.add(indx, val) will add val at 
//				index position and the rest of the element will shift by 1 index.
//				So list.add(1, 4) will add 4 in index = 1.

}
