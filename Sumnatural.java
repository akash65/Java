import java.util.Scanner;

class Sumnatural{
    public static void main(String[] args){
        int count=1,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numbers want to sum");
        int num=sc.nextInt();
        sc.close();
        while(count<=num){
        
            sum=sum+count;
            count++;
        }
        System.out.println("sum is"+sum);

    }
}