import java.util.Scanner;

//import com.sun.org.apache.xpath.internal.operations.String;

class Exceptions{
    /*public static void main(String[] args){
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
    }*/
    public static void main(String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array:");
        n=sc.nextInt();
        //String lang[]=new String[n];
        String lang[]={"java","python","c","node","html"};
        System.out.println("enter the number of strings:");
        //lang[n]=sc.nextLine();
        try{
            for(int i=1;i<=n;i++){
                //lang[i]=sc.nextLine();
                System.out.println(lang[i]);
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
          }
        
        finally{
            System.out.println("exception is succesfully executed");
        }
        sc.close();
    }
}