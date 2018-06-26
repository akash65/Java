import java.util.Scanner;

class Exception{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first number");
        int num1=sc.nextInt();
        System.out.println("enter the second number");
        int num2=sc.nextInt();
        try{
            int val=num1/num2;
            System.out.println("the value is"+val);
        }
        catch(ArithmeticException e){
            System.out.println("divide by zero"+e);

        }
        sc.close();
    }
}