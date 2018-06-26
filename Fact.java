import java.util.Scanner;

class Fact{
    /*for largest numbers
    public static void main(String[] args){
        int fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to find factorial:");
        int num=sc.nextInt();
        if(num<0){
            System.out.println("enter only positive number");
            
        }
        else if(num==0){
            System.out.println("1");
        }
        else{
            for(int i=1;i<=num;i++){
                fact=num*(num-1);
            }
            System.out.println("value is"+fact);

        }
    }*/
//using functions
    public static void main(String[] args){
        int fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to find factorial:");
        int num=sc.nextInt();
        fact=fact(num);
        System.out.println("value is"+fact);
        sc.close();
        
    }
    static int fact(int n){    
        if (n == 0)    
          return 1;    
        else    
          return(n * fact(n-1));    
       }  
    
}
