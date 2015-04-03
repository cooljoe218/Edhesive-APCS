/*
 * Amplify AP CS MOOC - Term 2, Lesson 14 
 */
import java.io.*;
import java.util.*;

public class Lesson_14_Activity
{

	/*
	 * Returns the number of Strings in the input list that start with the given
	 * letter. Implementation should use linear search, and ignore the case of
	 * the input letter.
	 */
	public static int countLetter(ArrayList<String> list, String letter)
	{
		int count = 0;
		String firstletter = letter.toUpperCase();
		for (int i = 0; i < list.size(); i++)
		{
			String s = list.get(i).toUpperCase();
			char c = firstletter.charAt(0);
			if (s.charAt(0) == c)
				count++;
		}
		return count;
	}

	public static void main(String str[]) throws IOException
	{
		/*
		 * Initialize an ArrayList of animals called zoo.
		 */
		ArrayList<String> zoo = new ArrayList<String>();
		zoo.add("Zebra");
		zoo.add("Ardvark");
		zoo.add("Emu");
		zoo.add("Hippo");
		zoo.add("Aligator");
		zoo.add("Lion");
		zoo.add("Giraffe");
		zoo.add("Seal");
		zoo.add("Tiger");
		zoo.add("Elephant");

		/*
		 * Print the contents of the zoo.
		 */
		System.out.println(zoo);

		/*
		 * Print the output from calling countLetter with various letters. For
		 * example, countLetter (zoo, "e") should return 2 while
		 * countLetter(zoo, "W") should return 0.
		 */
		System.out.println("A: " + countLetter(zoo, "A"));
		System.out.println("B: " + countLetter(zoo, "B"));
		System.out.println("C: " + countLetter(zoo, "C"));
		System.out.println("L: " + countLetter(zoo, "L"));
		System.out.println("T: " + countLetter(zoo, "T"));

		System.out.println("a: " + countLetter(zoo, "a"));
		System.out.println("b: " + countLetter(zoo, "b"));
		System.out.println("c: " + countLetter(zoo, "c"));
		System.out.println("l: " + countLetter(zoo, "l"));
		System.out.println("t: " + countLetter(zoo, "t"));
	}
}
