/*
 * Take an integer N as input
 * print Multiples of 4 till N
 * 
 * input:- 22
 * output:- 4 8 12 16 20
 */
public class Mul_of_N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N= 15;
		int i = 1;
		
		while(i<=N) {
			if(i%4==0) {
				System.out.println(i);
			}
				i++;
			}
		}
	}


