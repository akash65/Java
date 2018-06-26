import java.util.Scanner;

class Rstring{
    
    /*
    public static void main(String[] args){
        int i;
        String str,reverse=" ";
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the string");
        str=sc.nextLine();
        sc.close(); 
        int len=str.length();
        for(i=len-1;i>=0;i--){
            reverse=reverse+str.charAt(i);
            System.out.println("reversed string is"+reverse); 

        }
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
            System.out.println("enter the string:");
            StringBuffer str=new StringBuffer();

            str.append(sc.nextLine());
            sc.close();
            //String s=str.reverse();
            System.out.println(str.reverse());
        
    }
*/
//PALINDROME IS SAME AS STRING REVERSE
public static void main(String[] args){
     int i;
    String str,reverse="";
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the string to check palindrome");
    str=sc.nextLine();
    sc.close();
    int len=str.length();
    for(i=len-1;i>=0;i--)
        reverse=reverse+str.charAt(i);
        System.out.println(reverse);
    
    if(str.equals(reverse)){
        System.out.println("palindrome");
    }
    else 
    System.out.println("not palindrome");

}

}

