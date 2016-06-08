package finddigits;

import java.util.Scanner;

/**
 *
 * @author Slava
 * 
 * Given an integer, N , traverse its digits (d1,d2,...,dn) 
 * and determine how many digits evenly divide N 
 * (i.e.: count the number of times N divided by each digit di has a remainder of 0). 
 * Print the number of evenly divisible digits.
 * 
 * Note: Each digit is considered to be unique, so each occurrence 
 * of the same evenly divisible digit should be counted (i.e.: for N=111, the answer is 3).
 *
 * Input Format
 * 2
 * 12
 * 1012
 * 
 * The first line is an integer, T , indicating the number of test cases. 
 * The T subsequent lines each contain an integer, N.
 * 
 * 
 * Output Format
 * For every test case, count and print (on a new line) the number of digits in N
 * that are able to evenly divide N.
 * 
 * 2
 * 3
 * 
 * For every test case, count and print (on a new line) the number of digits in  that are able to evenly divide .
* 
 */
public class FindDigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] inputArray = new int[t];
        
        for(int a0 = 0; a0 < t; a0++){
            inputArray[a0] = in.nextInt();
        }
        
        for(int i = 0; i < t; i++){
            System.out.println(getNumberOfDigitsContainedThatDivideInput(inputArray[i]));
        }
    }
    
    private static int getNumberOfDigitsContainedThatDivideInput(int n)
    {
        int nCopy = n;
        int result = 0;
        
        int i = 0;
        while (nCopy != 0) {
            if((nCopy%10 != 0) && n % (nCopy%10) == 0)
                result++;
            nCopy /= 10;
            i++;
        }
        
        return result;
    }
}
