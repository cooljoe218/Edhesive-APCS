import java.util.Scanner;
import java.lang.Math;
public class Lesson_34_Activity_Six {

	/**
	* @param args
    */
	public static boolean allPositive(int[] x) {
        for (int i = 0; i < x.length; i++) {
            if (x[i] < 0)
                return false;
        }
        return true;
    }
    
	public static void main(String[] args) {
        
        
    }

}