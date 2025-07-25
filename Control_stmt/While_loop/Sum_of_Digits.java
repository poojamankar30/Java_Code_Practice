/*
 *given an integer N 
 * Print sum of its digits
 * 
 * input:-  6531
 * output:- 15 
 */

public class Sum_of_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N = 6321;
		int sum=0;
		
		while(N!=0) {
			
		int rem= N%10;
		sum=sum+rem;
		N=N/10;
		}
		System.out.print(sum);
	}

}
