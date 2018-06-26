import java.util.Scanner;

class Rnumber{
    public static void main(String[] args){
        int num=0,reverse=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number you want to reverse:");
        num=sc.nextInt();
        sc.close();
    
        while(num!=0){
            reverse=reverse*10;
            reverse=reverse+num%10;
            num=num/10;
        }
        System.out.println("enter the number you want to reverse:"+reverse);
    }
}