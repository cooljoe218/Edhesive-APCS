import java.lang.Math;
public class Lesson_35_Activity {

	/**
	* @param args
    */
	
	public static int randomize(int x){
        int rand = (int) (Math.random()*x);
        return rand;
    }
    public static double randomize(double x){
        double rand = Math.random()*x;
        return rand;
    }
    public static int randomize(int x, int y){
        int rand = 0;
        if (x >= y)
            {
                rand = (int) (y + Math.random( ) * (x - y + 1));
            }
        else if (y > x)
            {
                rand = (int) (x + Math.random( ) * (y - x + 1));
        }
        return rand;
        
    }
	public static double randomize(double min, double max){
		return (Math.random()*(max-min) + min);
	}    
    
    public static void main(String[] args) {
        
        
    }

}