import java.util.Scanner;

class Fibinoci{
    public static void main(String[] args){
        int c,num1=0,num2=1,i=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to find series");
        c=sc.nextInt();
        sc.close();
        System.out.println("fibinoci series for the number"+c+"is");
        while(i<=c){
            System.out.println(num1);

            int sum=num1+num2;
            num1=num2;
            num2=sum;
            i++;
        }
    }
}