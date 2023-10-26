import java.util.*;

public class Reverse {
/* 
 *  2. Write a program to reverse a given List of strings.

Expected Output:

Original List : [ Apple, Banana, Cherry, Mango ]

Reverse List : [ Mango, Cherry, Banana, Apple ]
 *
 */
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");
		list.add("Mango");
		
		System.out.println(reverse(list));
		System.out.println(reverseCollections(list));
	}
	
	//This method reverse the list using naive approach which is 
	//using for loop initailizing i = list size and iterator to 0 and storing elements to different
	//list this is good idea but it increase the space complexity so the best idea is Collections 
	public static ArrayList<String> reverse(ArrayList<String> list) {
		ArrayList<String> reversedList = new ArrayList<>();
		for(int i = list.size() - 1; i >= 0; i--) {
			reversedList.add(list.get(i));
		}
		return reversedList;
	}
	//This method reverse the list using Collections static method reverse
	public static ArrayList<String> reverseCollections(ArrayList<String> list) {
		Collections.reverse(list);
		return list;
	}
}