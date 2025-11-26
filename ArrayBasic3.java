//take array of 5 also take input from user and print using for loop

package Array;
import java.util.*;

public class ArrayBasic3 {
 
	public static void main(String[]args) {
	
		Scanner sc= new Scanner(System.in);
	    int arr[]=new int[5];
	 
	    arr[0]=sc.nextInt();
	    arr[1]=sc.nextInt();
	    arr[2]=sc.nextInt();
	    arr[3]=sc.nextInt();
	    arr[4]=sc.nextInt();
	    
	    for(int i=0;i<5;i++) {
	    	System.out.println(arr[i]);
	    }
	    
	    for(int x=0;x<5;x++) {
	    	arr[x]=sc.nextInt();	    
	}	
	    
	}
}
