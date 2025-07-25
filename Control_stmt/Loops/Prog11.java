/*WAP to check weather the no is a palindrom or not.
 * input: 2332
 * output: 2332
 */

package Loops;

public class Prog11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int N = 2332;
		int rev = 0;
		int temp = N ;
		
		while(N!=0) {
			int rem= N %10;	
		    rev= rev*10 + rem;
		    N = N/10;
	}
		System.out.println(rev);
		if (temp == rev) {
			System.out.println("The number is palindrom");
		}else {
			System.out.println("The number is not palidrome");
		}
		
	}
}
