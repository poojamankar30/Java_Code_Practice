//Write program to check whether the number is a palindrome number or not

class palindrome{

    public static void main(String[]args){

        int num=2332;
        int temp=num;
        int rev=0;

        while(num!=0){
            int rem=num%10;
            rev= rev*10+rem;
            num=num/10;
        }
        if(temp==rev){
            System.out.println("Number is palindrom.");
        }else{
            System.out.println("Number is not palindrome.");
        }

    }
}