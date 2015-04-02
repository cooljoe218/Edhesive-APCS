import java.util.Scanner;
import java.lang.Math;
public class Lesson_34_Activity_Two {

	/**
	* @param args
    */
	
    public static double average(int[] x) {
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum = sum + x[i];
        }
        
        return (1.0 * ((sum*100)/x.length)/100);
    }
    
	public static void main(String[] args) {
        
        
    }

}