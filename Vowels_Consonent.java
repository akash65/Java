import java.util.Scanner;

class Vowels_Consonent{
    public static void main(String[] args){
        boolean isval=false;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the character to check whether vowel or consonent");
        char ch=sc.next().charAt(0);
        sc.close();
        switch(ch)
        {
            case'a':
            case'e':
            case'i':
            case'o':
            case'u':
            case'A':
            case'E':
            case'I':
            case'O':
            case'U':
                    isval=true;
        }
        if(isval==true){
            System.out.println(ch+ "character is vowel");
        }
        else{ 
            if((ch>='a'&&ch<='z') || (ch>='A'&&ch<='Z'))
                    System.out.println(ch+ " is consonent");
            
        else 
                System.out.println("please enter charater");
            
        }
    }
}
