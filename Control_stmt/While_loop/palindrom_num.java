/*
 * Write a program to check whether the input is a palindrom number or not
 * input: 2332
 * output: 2332 is a paindrom number
 */
public class palindrom_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N= 2342;
		int temp= N;
		int rev =0;
		while(N!=0) {
			 int rem= N%10;
		     rev = rev*10+rem;
			 N=N/10;
		}
		
		if(temp==rev) {
			System.out.println("The number is palindrom");
		}else {
			System.out.println("The number is not palindrom");
		}
		
	}

}
