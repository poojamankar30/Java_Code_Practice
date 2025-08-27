class AssignNo6{

    public static void main(String[]args){

        int num1=12;
        int num2=13;
        int num3=13;

        if(num1<num2){
            if(num2<num3){
                System.out.println(num3+" is the maximum between "+ num1 + "and"+ num2);
            }
            else{
                System.out.println(num2+ " is maximum between"+num1+"and"+num3);
            }
        }
        else {
            System.out.println(num1+" is maximum between"+num2+"and"+num3);
        }
    }
}