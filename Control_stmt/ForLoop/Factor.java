
/*Take N as input .Print all its factors
 * input : 6
 * output: 1 2 3 6
 */
public class Factor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N = 10;
		for (int i =1;i<=N;i++) {
			if(N%i==0) {
				System.out.println(i);
			}
		}
		
	
	}

}