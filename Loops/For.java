import java.util.Scanner;

class For{
    public static void main(String[] args){
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        int n=sc.nextInt();
        System.out.println("enter the number of elements:");
        int a[]=new int[n];
        for( i=0;i<a.length;i++){
            a[i]=sc.nextInt();
            
    }
    for(i=0;i<a.length;i++){
        System.out.println(i+"index value is"+a[i]);}
        sc.close();
    }
}