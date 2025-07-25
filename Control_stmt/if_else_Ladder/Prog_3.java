package if_else_Ladder;

public class Prog_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 15;
		
		if (num%3==0 && num%5==0) {
			System.out.println("Fizz-Bizz");
		}else if(num%3==0) {
			System.out.println("Fizz");
		}else {
			System.out.println("Bizz");
		}
	}

}
