/*
 * Take N as input print its factorial
 * input: 5        input:  4
 * output:120     output:24
 */


public class Factorial_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N = 4;
		int fact=1;
		for(int i = 1; i<=N;i++) {
			fact= fact*i;
		}
		System.out.println(fact);
	}

}
