import java.util.Scanner;

class Bubble{
    public static void main(String []args){
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size:");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("enter the array elements:");
        for( i=0;i<n;i++)
        arr[i]=sc.nextInt();
        for( i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]<arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
            for(i=0;i<n;i++){
                System.out.println(arr[i]);

            }
        }
        
    }



    }