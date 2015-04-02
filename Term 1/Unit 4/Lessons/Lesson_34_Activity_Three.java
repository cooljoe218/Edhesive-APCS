import java.util.Scanner;
import java.lang.Math;
public class Lesson_34_Activity_Three {

	/**
	* @param args
    */
	public static int findMax(int[] x) {
        int max = -2147483648;
        for (int i = 0; i < x.length; i++) {
            if (x[i] > max)
                max = x[i];
        }
        return max;
    }
    
	public static void main(String[] args) {
        
        
    }

}