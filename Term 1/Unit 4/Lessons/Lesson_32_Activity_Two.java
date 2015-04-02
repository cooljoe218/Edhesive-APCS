import java.util.Scanner;
import java.lang.Math;
public class Lesson_32_Activity_Two {

	/**
	* @param args
    */
	
	public static void monthDay(int x) {
        if (x == 1)
        {
            System.out.println("31");
        }
        if (x == 2)
        {
            System.out.println("28");
        }
        if (x == 3)
        {
            System.out.println("31");
        }
        if (x == 4)
        {
            System.out.println("30");
        }
        if (x == 5)
        {
            System.out.println("31");
        }
        if (x == 6)
        {
            System.out.println("30");
        }
        if (x == 7)
        {
            System.out.println("31");
        }
        if (x == 8)
        {
            System.out.println("31");
        }
        if (x == 9)
        {
            System.out.println("30");
        }
        if (x == 10)
        {
            System.out.println("31");
        }
        if (x == 11)
        {
            System.out.println("30");
        }
        if (x == 12)
        {
            System.out.println("31");
        }
    
    }
    
    public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
        int month = scan.nextInt();
        monthDay(month);
    }
}