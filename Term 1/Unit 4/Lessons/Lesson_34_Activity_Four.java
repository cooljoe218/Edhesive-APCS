import java.util.Scanner;
import java.lang.Math;
public class Lesson_34_Activity_Four {

	/**
	* @param args
    */
	public static int findMin(int[] x) {
        int min = 2147483648;
        for (int i = 0; i < x.length; i++) {
            if (x[i] < min)
                min = x[i];
        }
        return min;
    }
    
	public static void main(String[] args) {
        
        
    }

}