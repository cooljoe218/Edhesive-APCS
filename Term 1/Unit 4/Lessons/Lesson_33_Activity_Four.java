import java.util.Scanner;
import java.lang.Math;
public class Lesson_33_Activity_Four {

	/**
	* @param args
    */
	public static void reverse(int[] x) {
        int j = x.length-1;
        int[] y = new int[x.length];
        for (int k = 0; k < x.length; k++) {
            y[k]=x[k];
        }
        
        
        for (int i = 0; i < x.length; i++)
           {
                x[i]=y[j];
                j--;
           }
	}
    
	public static void main(String[] args) {
        
    }

}