/*
 * Program for multiplication of digits
 */
public class Mul_of_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N= 24;
		int mul=1;
		
		while(N!=0) {
			int rem=N%10;
			mul= mul*rem;
			N=N/10;
		}
		System.out.println(mul);
	}

}
