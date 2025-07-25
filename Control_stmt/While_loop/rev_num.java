/*
 * 	Write a Program to reverse the given numbers 
 * 
 * input:- 942111423
 * output:- 324111249
 */
public class rev_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N = 987654321;
		int rev=0;
		
		while(N!=0) {
			
			int rem= N%10;
		    rev= rev*10+rem;
			N=N/10;
		}
		System.out.println(rev);
	}

}
