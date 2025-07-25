
/*
 * Take N as input .Print whether N is Armstrong no or not
 * input: 23                     input :153
 * output:Not an Armstrong no    output: Armstrong no
 */

//By considering 3 digits number
public class Armstrong_no_3digit {

	public static void main(String []args) {
		
		int sum = 0;
		int N = 153;
		int temp=N;
		
		while(N!=0) {
		int rem =N%10;
		sum=sum+(rem*rem*rem);
        N= N/10;
		}
		if(sum==temp) {
			System.out.println("The Number is Armstrong");
		}else {
			System.out.println("The No is NOT Armstrong");
		}
		
	}
}
   
/*
  
public class AramStrong_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N = 153; 
		int temp1=N;
		int temp2= N;
		int count = 0;
		
		while(temp1!=0) {
			count++;
			temp1=temp1/10;
		}
		
		int sum = 0;
		while (N!=0) {
		int	rem= N%10;
		int mul = 1;
			
		for(int i=0;i<count;i++) {
			mul= mul *rem;
		}
		sum= sum+mul;
		N= N/10;
		}
		
		if(sum == temp2) {
			System.out.println("The Number is Armstrong");
		}else {
			System.out.println("The No is NOT Armstrong");
		}
	}

}
*/