
public class Mix_Mode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int var = 1;
		char ch ='A';
		
		for(int i = 1;i<=3;i++) {
	
			for(int j = 1;j<=4;j++) {
				if(j%2==0)
				   System.out.print(var+ " ");
				else
					System.out.print(ch+" ");
			}
			System.out.println();
		}
	}

}
