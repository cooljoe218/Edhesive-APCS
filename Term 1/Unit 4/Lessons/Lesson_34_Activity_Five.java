import java.util.Scanner;
import java.lang.Math;
public class Lesson_34_Activity_Five {

	/**
	* @param args
    */
	public static int sumEven(int[] x) {
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i]%2==0)
                sum = sum + x[i];
        }
        return sum;
    }
    
	public static void main(String[] args) {
        
        
    }

}