//Write a prog to print the countdown of days to submit assignment

class countdown{

    public static void main(String[]args){

        int num=0;
       // int i=1;
        while(num>=0){
            if(num>=1)
            System.out.println(num-- +"days remaining");
            else{
                System.out.println("0 days assignment is overdue");
            }
            
        }
    }
} 