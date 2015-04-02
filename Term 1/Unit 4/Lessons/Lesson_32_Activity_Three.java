import java.util.Scanner;
import java.lang.Math;
public class Lesson_32_Activity_Three {

	/**
	* @param args
    */
	
	public static void swap(int a, int b){
        System.out.println(b + " " + a);
    }
    
    public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
        int one = scan.nextInt();
        int two = scan.nextInt();
        swap(one, two);
        
    }

}