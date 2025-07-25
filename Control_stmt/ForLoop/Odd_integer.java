/*Take N as input print odd integers from 1 to N
 * input : 6
 * output: 1 3 6
 */


public class Odd_integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N = 10;
		int i;	
		for(i=1;i<=N;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
	}

}
