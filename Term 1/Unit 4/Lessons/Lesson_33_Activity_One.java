import java.util.Scanner;
import java.lang.Math;
public class Lesson_33_Activity_One {

	/**
	* @param args
    */
	
	public static void upper(String s[]){
       for (int i = 0; i < s.length; i++)
           {
               
                s[i] = (s[i].toUpperCase());
           }
    }
    
    public static void main(String[] args) {
        String [] list =  {"cat,dog"};
        upper(list);
        
    }

}