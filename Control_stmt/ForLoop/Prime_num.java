/*
 * Take N as input .print whether its prime or not
 * input: 5        input:8
 * output:Prime    output: Not prime
*/


public class Prime_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				
				int N = 7;
				int count= 0;
				
				for (int i = 1;i<=N;i++) {
					if(N%i==0){
						count++;
					}
				}
				
				if(count==2) {
					System.out.println("Number is Prime");
				}else {
					System.out.println("Number is not Prime");
				}
			}
		

	}

