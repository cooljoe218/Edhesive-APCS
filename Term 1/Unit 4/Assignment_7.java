import java.util.Scanner;
import java.lang.Math;
public class Assignment_7 {

	/**
	* @param args
    */
	
	public static int[] convertToBinary(int b) {
        int [] bin = new int[8];
        bin[0] = b/128;
        bin[1] = (b-(128*bin[0]))/64;
        bin[2] = (b-((128*bin[0])+(64*bin[1])))/32;
        bin[3] = (b-((128*bin[0])+(64*bin[1])+(32*bin[2])))/16;
        bin[4] = (b-((128*bin[0])+(64*bin[1])+(32*bin[2])+(16*bin[3])))/8;
        bin[5] = (b-((128*bin[0])+(64*bin[1])+(32*bin[2])+(16*bin[3])+(8*bin[4])))/4;
        bin[6] = (b-((128*bin[0])+(64*bin[1])+(32*bin[2])+(16*bin[3])+(8*bin[4])+(4*bin[5])))/2;
        bin[7] = b%2;
        return bin;
    }
    
    public static void printBin(int b[]) {
        for (int i = 0; i < 8; i++)
            {
            System.out.print(b[i] + " ");
            }
    }
    
    public static int addBin(int a, int b) {
        return a + b;
    }
    
    public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
        System.out.println("Enter a base ten number between 0 and 255, inclusive.");
        int x = scan.nextInt();
        System.out.println("Enter a base ten number between 0 and 255, inclusive.");
        int y = scan.nextInt();
        if (x + y <= 255 && x <= 255 && x >= 0 && y <= 255 && y >=0)
        {
            System.out.println("First binary number:");
            printBin(convertToBinary(x));
            System.out.println("\nSecond binary number:");
            printBin(convertToBinary(y));
            System.out.println("\nAdded:");
            printBin(convertToBinary(addBin(x, y)));
           }
        else
           {
            System.out.println("ERROR: Numbers incorrect.");
           }
        
    }

}