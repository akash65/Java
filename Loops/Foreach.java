import java.util.Scanner;

class Foreach{
    public static void main(String[] args){
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n=sc.nextInt();
        System.out.println("enter the elements ");
        String[] str=new String[n];
        for(i=0;i<str.length;i++){
            str[i]=sc.nextLine();
            
        }
        for (String s : str) {
            System.out.println(s+",");
        }
        sc.close();
    }
}
    
