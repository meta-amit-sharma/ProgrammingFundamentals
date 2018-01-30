/*
 * Class name-BinaryToOctal 
 * 
 * 
 */

package binaryToOctal;
/**
 * A class to convert a given binary number to 
 * its equivalent octal number.
 * @version 1.0
 * @author Amit Sharma
 */

public class BinaryToOctal {
	
	/**
	 * Below function converts the input binary number to octal equivalent number.
	 * The function works by splitting the input binary number in the groups of 3,
	 * then the groups thus obtained are converted to their respective decimal equivalent.
	 * Lastly these results are merged together to obtain the final octal number
	 * It is assumed that user will not enter negative value.
	 */
	public int convertBinaryToOctal(int n){
		String octal = "" ;						//to store the final Octal number
        while ( n > 0 ) {
        	int temp = n % 1000 ;			 	//to get the last 3 digits of the input binary number
            int octalTemp = 0 ; 				//to hold the octal equivalent of the binary number we got in above instruction
            int c = 0 ;  						// to keep the track of powers of 2
            while ( temp > 0 ) {
                int temp1 = temp % 10;			//to get the last digit of the 3-pair binary number
                if ( temp1 != 0 && temp1 != 1 ) {	//just to check if the number dosen't contain any digits other than 0 or 1
                	return -1;
                }
                octalTemp += temp1 * ( Math.pow (2, c++) );
                temp /= 10;
            }
            octal = octalTemp + octal;			//merging with final result 
            n /= 1000;
        }
        return Integer.parseInt(octal);			//returns final octal value
    }
	
}
