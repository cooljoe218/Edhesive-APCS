import java.util.Scanner;
import java.lang.Math;
public class Lesson_32_Activity_Four {

	/**
	* @param args
    */
	
	public static void realTime(int x) {
        System.out.println("Hours: " + x / 3600);
        System.out.println("Minutes: " + (x % 3600)/60);
        System.out.println("Seconds: " + x % 60);
    }
    
    public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
        int seconds = scan.nextInt();
        realTime(seconds);
        
    }

}