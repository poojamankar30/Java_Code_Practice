
public class Mix_Mode1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(int i= 1; i<=3;i++) {
			
			int var= 1;
			char ch = 'A';
			for(int j=1;j<=4;j++) {
	           if(j%2==1)
	        	 System.out.print( ch++ + " ");
	           else
	        	 System.out.print(var++ + " ");
	        }
			System.out.println();

       }

    }
}