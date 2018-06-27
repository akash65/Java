import java.util.Scanner;

class Floddangle{
    public static void main(String[] args){
        int num=1,rows,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows:");
        rows=sc.nextInt();
        sc.close();
        for(i=1;i<=rows;i++){
            for(j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
       
    }
}