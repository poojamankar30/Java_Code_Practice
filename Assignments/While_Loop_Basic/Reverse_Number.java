//write a program to reverse given number

class reverse_number{

    public static void main(String []args){

        int num= 687654;
        int rev=0;

        while(num!=0){
            int rem= num%10;
            rev= rev*10+rem;
            num=num/10;

        }
         System.out.println(rev);

    }
}