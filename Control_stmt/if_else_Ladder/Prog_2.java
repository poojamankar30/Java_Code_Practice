package if_else_Ladder;

public class Prog_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float temp = 98.6f;
		//float temp = 98.2f;
		 
		if (temp>98.8f) {
			System.out.println("Temp is high"); 
		}
		else if(temp<98.4f) {
			System.out.println("Temp is low ");
		}else {
			System.out.println("Temp is Normal");
		}
		
			
	}

}
