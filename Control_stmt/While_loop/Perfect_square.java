/*
 * Take an input N as input 
 * Print perfect square till N 
 * Perfect square :An integer whose square root is integer 
 * 
 * 25->5    : yes
 * 81->9    : yes
 * 10->13.13: No
 * 
 * 	input: 30
 *  output: 1 4 9 16 25 
 */


public class Perfect_square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int N= 30;
		int i=1;
		while(i*i<=N) {

			System.out.println(i*i);
			i++;
		}
	}

}
