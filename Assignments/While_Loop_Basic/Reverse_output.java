//write a prog that takes a number if the number is even print that number in reverse order,
//or if number is odd print that no in reverse order ny diff two.

class reverse{

    public static void main(String[]args){

        int num= 7;

            if(num%2==0){
                while(num>=1){
                    System.out.println(num--);  
                }
            }
        
            else{
                while(num>=1){
                  System.out.println(num);
                  num=num-2;
                }    
            }  

        
    }
}