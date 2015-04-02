import java.util.Scanner;
import java.lang.Math;
public class Lesson_33_Activity_Five {

	/**
	* @param args
    */
	public static void insertValue(int[] string, int replace, int placement) {
        int[] copy = new int[string.length];
        for (int j = 1; j < string.length; j++) {
            copy[j]=string[j-1];
        }
        if (placement==string.length) {
            string[placement] = replace;
        }
        else if (placement==0) {
            for (int k=1; k < string.length; k++) {
                string[k] = copy[k];
            }
            string[placement] = replace;
        }
        else {
            for (int i=placement+1; i < string.length; i++) {
                string[i] = copy[i];
            }
            string[placement] = replace;
        }
    }
            
            
    
	public static void main(String[] args) {

        
        
    }

}