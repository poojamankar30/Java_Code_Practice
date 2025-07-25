//Program for multiplication of digits

package Loops;

public class Prog_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int N = 432;
		int mul = 1;
		int rem ;
		
		while(N!=0) {
		   rem = N%10;
		   mul = mul *rem;
		  N=  N/10;	
		}
		System.out.println(mul);
	}

}
