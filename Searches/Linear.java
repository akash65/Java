
import java.util.Scanner;

class Linear{
    
    public static void main(String[] args){
        int i, n, search, ar[];  
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the index value:");
        n=sc.nextInt();
        ar=new int[n];
        System.out.println("enter the elemnets");
        for( i=0;i<n;i++)
            ar[i]=sc.nextInt();
        
        System.out.println("enter the search element:");
            search=sc.nextInt();
            for( i=0;i<n;i++){
                if(ar[i] == search){
                    System.out.println("the index value is"+(i+1));
                }
            }
        }
        
    }


/*
class Linear{
    public static void main(String args[]){
        int arr[]={23,4,233,56,78};
        int target=233;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("index value is"+i);
            }
        }
    }
}
*/