import java.util.Scanner;
import java.lang.Math;
public class Lesson_32_Activity_One {

	/**
	* @param args
    */
	
	public static void monthName(int x) {
        if (x == 1)
        {
            System.out.println("January");
        }
        if (x == 2)
        {
            System.out.println("February");
        }
        if (x == 3)
        {
            System.out.println("March");
        }
        if (x == 4)
        {
            System.out.println("April");
        }
        if (x == 5)
        {
            System.out.println("May");
        }
        if (x == 6)
        {
            System.out.println("June");
        }
        if (x == 7)
        {
            System.out.println("July");
        }
        if (x == 8)
        {
            System.out.println("August");
        }
        if (x == 9)
        {
            System.out.println("September");
        }
        if (x == 10)
        {
            System.out.println("October");
        }
        if (x == 11)
        {
            System.out.println("November");
        }
        if (x == 12)
        {
            System.out.println("December");
        }
    
    }
    
    public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
        int month = scan.nextInt();
        monthName(month);
        
        
    }

}