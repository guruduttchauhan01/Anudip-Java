import java.util.*;
public class EvenSum {
	//3. Write a Java program that calculates the sum of all even numbers present in an 
	//ArrayList of integers.
	//
	//Sample Input : [2, 5, 8, 10, 15]
	//
	//Expected Output: Sum of even numbers : 20


	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.addAll(List.of(2, 5, 8, 10, 15));
		
		System.out.println(evenSum(list));
	}
	
	//Simple sum method that sum all the elements in the list
	public static int evenSum(ArrayList<Integer> list) {
		int sum = 0;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) % 2 == 0) {
				sum += list.get(i);
			}
		}
		return sum;
	}

}

