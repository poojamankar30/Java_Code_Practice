// Write a program to print the sum of all even number and multiplication of odd number between 1 to 10.

class sum_mul{

    public static void main(String[]args){

        int i=1;
        int mul=1;
        int sum= 0;
        while (i<=10){
        
        if(i%2==1){
            mul= i*mul;
        }else{
            sum=sum+i;
        }
        i++;
        }
        System.out.println("Sum of even numbers between 1 to 10 is: "+ sum);
        System.out.println("Multiplication of odd numbers between 1 to 10 is: "+mul);
    }
}

//Sum of even numbers between 1 to 10 is: 30
//Multiplication of odd numbers between 1 to 10 is: 945
