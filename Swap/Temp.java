import java.util.Scanner;

class Temp{
    /*public static void main(String[] args){
        int num1,num2;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number:");
        num1=sc.nextInt();
        System.out.println("enter the second number:");
        num2=sc.nextInt();
        System.out.println("before swap:"+num1+" "+num2);
        int temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("after swap:"+num1+" "+num2);

    }*/
    public static void main(String[] args){
        String str1,str2,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first string:");
        str1=sc.nextLine();
        System.out.println("enter the second number:");
        str2=sc.nextLine();
        System.out.println("before swap:"+str1+" "+str2);
        temp=str1;
        str1=str2;
        str2=temp;
        System.out.println("before swap:"+str1+" "+str2);
    sc.close();
    }

}