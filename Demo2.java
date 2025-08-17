
 
 /*class Demo2{
	 public static void main(String args[]){
		 byte var1=18;
		 byte var2=18;
		 
		 System.out.println(var1 );
		 System.out.println(var2);
		 
		 var1= var1+var2;                       //ERROR cannot convert from int to byte(added value is of integer data type and we store it into byte)
	 }
 }*/

/*class Demo2{
	public static void main(String []args) {
	short var1=10;
	short var2=20;
	
	System.out.println(var1);
	System.out.println(var2);
	System.out.println(var1+var2);             // not storing in other variable so no error 
	}
}*/


class Demo2{
	 public static void main(String args[]) {
		 short var1= 10;
		 short var2= 20;
		 
		 System.out.println(var1);
		 System.out.println(var2);
		 
		 int var3= var1 +var2;                   //no error 
		 
		 System.out.println(var1);
		 System.out.println(var2);
		 System.out.println(var3);
	 }
 }