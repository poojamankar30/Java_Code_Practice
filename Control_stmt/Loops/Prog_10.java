/* Write a program to reverse the given number 
 * input: 94325611
 * output: 11652349
 */


package Loops;

public class Prog_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N = 9843761;
		int rev = 0; 
		
		while(N!=0) {
			int rem = N % 10;
			rev = rev*10+ rem ;
			N = N /10;
		}
		System.out.println(rev);
	}

}
