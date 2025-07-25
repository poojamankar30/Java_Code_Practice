
/*
 * Take N as input.count all its factors and print count
 * input : 6   input: 24
 * output: 4   output: 8 
 */
public class Factor_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int N = 36;
		int count =0;
		
		for (int i = 1;i<=N; i++) {
			if(N%i==0) {
				count++;
			}
		}		
		System.out.println(count);
	}

}