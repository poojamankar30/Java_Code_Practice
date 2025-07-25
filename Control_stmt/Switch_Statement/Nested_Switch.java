
public class Nested_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Prime vdo";
		System.out.println("before switch");
		
		switch(str) {
		
		case "Prime vdo":
			
			String str2= "Movies";
			switch(str2) {
			    case "Movies": 
			      	System.out.println("Hindi");
			        break;
		        case "Serial":
			        System.out.println("Marathi");
			        break;
		    }
		    break;
		case "Netflix":
			String str3= "Movie";
			switch(str3) {
			      case "Movie":
			    	  System.out.println("Hindi");
			    	  break ;
			      case "Tv shows":
			    	  System.out.println("Marathi");
			    	  break;
			}
	}
     System.out.println("After switch");
	}
}
