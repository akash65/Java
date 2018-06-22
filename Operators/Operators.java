import java.util.Scanner;

class Operators{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num1=sc.nextInt();
        System.out.println("Enter a number:");
        int num2=sc.nextInt();
        
        /*System.out.println("enter key to do operation");
        int num3=sc.nextInt();
        switch (num3) {
            case 1:
                //int num4=num1+num2;
                System.out.println(num1+num2);
                break;
            case 2:
                //int num4=num1-num2;
                System.out.println(num1-num2);
                break;
            case 3:
                //int num4=num1*num2;
                System.out.println(num1*num2);
                break;
        
            default:
            System.out.print("enter numerical value");
                break;
        }*/
        System.out.print(num1>num2?num1:num2);
    }
    
}