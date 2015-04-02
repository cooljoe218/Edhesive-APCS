import java.util.Scanner;
import java.lang.Math;
public class Lesson_33_Activity_Two {

	/**
	* @param args
    */
	
	public static void randomize(int[] x) {
        for (int i = 0; i < x.length; i++)
           {
               x[i] = (int)((Math.random() * 90) + 10);
           }
    }
    
    public static void main(String[] args) {     
        
    }

}