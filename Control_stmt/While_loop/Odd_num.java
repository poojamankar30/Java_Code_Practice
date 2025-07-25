/* Take an integer N as input
 * Print odd integers from 1 to N using Loop
 * input :- 10
 * output:-1 3 5 7 9 
 */


public class Odd_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i= 1;
		int N = 11;
	    while(i<=N) {
	    	if(i%2!=0) {
	    		System.out.println(i);
	    	}
	    i++;
	    }
		
	}

}
