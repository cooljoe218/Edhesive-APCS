import java.util.Scanner;
import java.lang.Math;
public class Lesson_10_Activity {

	/**
	* @param args
    */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
        System.out.println("Please enter two decimal values:");
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        int tempx = (int) Math.round((x * 1000));
        int tempy = (int) Math.round((y * 1000));
        System.out.println(1.0 * (tempx - tempy)/1000);
        
    }

}