//Write a program to print count digits of given number

class CountOfDig{

    public static void main(String[]args){
    
    int num=345683;
    int count=0;
    while(num!=0){
     count++;  
     num=num/10;
     }
     System.out.println(count);

    }
}
