import java.util.Scanner;

/*class Single{
    public static void main(String[] args) {
        //int n=0;
        int[] arr=new int[8];
        
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<=arr.length-1;i++){
                arr[i]=sc.nextInt();
                        //arr[i]=(i+1)*2;
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
          }
    }
}*/
/*class Single{
    public static void main(String[] args){
        int x[]={2,3,76,5,90};
        for(int n:x){
            System.out.print(n);
        }
    }
}*/
/*
class Single{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size");
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);

        }
    }
    
}*/
/*
class Single{
    public static void main(String[] args){
        int arr[]={234,34,565,78,555};
        System.out.print(sum(arr));
    }
    public static int sum(int a[]){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        return sum;
    }
}*/

class Single{
    public static void main(String []args){
        int arr[]={32,345,43,567,98};
        int i;
        int max=arr[0];
        for(i=0;i<arr.length;i++){
            /*if(max>arr[i]){
                int temp=max;
                max=arr[i];
                arr[i]=temp;*/
                if(max<arr[i]){
                    max=arr[i];

            }
        }
        System.out.println(max);

    }
}