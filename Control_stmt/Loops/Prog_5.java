/*Given an integer N 
 * print all its digit
 * input : 6543
 * output: 3
 *         4
 *         5
 *         6  
 */


package Loops;

public class Prog_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int N = 4325;
		while(N!=0) {
			System.out.println(N%10);
			N = N /10;
		}
		
	}

}
