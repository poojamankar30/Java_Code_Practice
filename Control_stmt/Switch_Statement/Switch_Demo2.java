
public class Switch_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x= 2;
	    int a;
    	int b;  
		switch (x) {
		/*case 'A':
			  System.out.print("1");   
			  break;      
		case 65:
			System.out.println("2");
	      	break; */                          //error:Duplicate case
		
		/*case a+b:                            //Constant expression required
			System.out.println("7");               
		    break;*/                             
		
		case 3:
			System.out.println("3");
			break;
		case 4:
			System.out.println("4");
			break;
		
		default:
			System.out.println("none");
			break;
		}
	}

}
