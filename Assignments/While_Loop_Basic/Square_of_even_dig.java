//Write program to print square of even digit of given no

class Square{

    public static void main(String []args){

        int num=23;

        while(num!=0){
            int rem = num%10;
            if(rem%2==0){
                System.out.print(rem*rem+" ");
            }
            num=num/10;
        }
        System.out.println("\n");
    }
}