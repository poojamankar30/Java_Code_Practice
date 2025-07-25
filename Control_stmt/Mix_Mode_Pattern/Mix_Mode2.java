
public class Mix_Mode2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		int var=1;
		char ch='A';
		
		for (int i=1;i<=3;i++) {
			for(int j=1;j<=4;j++){
				if(j%2==1) {
					System.out.print(ch +" ");
				    ch++;
				}
				else {
						System.out.print(var+" ");
						var++;
				}
			}
			System.out.println();
		}
		
	}

}
