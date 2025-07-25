/*
 * Given an integer N 
 * Print sum of its Digits 
 * 
 * Assume : N>0
 * input: 6531
 * output: 15
 */

package Loops;

public class Prog_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N= 7645;
		int sum= 0;
		
		while(N!=0) {
			int rem  = N%10;
		    sum = sum + rem;
		    N = N/10;
		}
            System.out.println(sum);
		
		/*while(N!=0) {
			int rem  = N%10;
		    sum = sum + rem;
		    N = N/10;
            System.out.println(sum);
		}*/
	}

}
