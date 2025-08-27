class AssignNo3{
    public static void main(String[]args){

     int Num= -6;
     if(Num>=0 && Num<=5){
        if(Num==0)
           System.out.println("Zero");
        else if(Num==1)
           System.out.println("One");
        else if(Num==2)
           System.out.println("Two");
        else if(Num==3)
           System.out.println("Three");
        else if(Num==4)
           System.out.println("Four");
        else
            System.out.println("Five");
     }
     else if(Num<0){
        System.out.println("Number is less than 0");
     }
     else{
        System.out.println("Number is greater than 5");
     }
    }
}