/*
 *Given an integer N
 *Print all its digit 
 *
 * input:- 6531
 * output:- 1
 *          3
 *          5
 *          6
 */

public class Print_digit {

	public static void main(String[] args) {
		
		int N= 6531;
		while(N!=0) {
			System.out.println(N%10);
			N=N/10;
		}
    }
}