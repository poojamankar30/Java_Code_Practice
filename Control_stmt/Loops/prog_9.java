/*
 * Take an integer N as input
 * Print multiplies of 4 till N
 * input: 22
 * output: 4 8 12 16 20 
 */


package Loops;

public class prog_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int N = 22;
        int i = 1;
		
		while(i<=N){
			if (i%4==0) {
		System.out.println(i);
		
		}i++;
	}
	}
}
