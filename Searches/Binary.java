import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

class Binary{
    public static  void main(String[] args){
        int i,arr[];
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of array");
        int n=sc.nextInt();
        arr=new int[n];

        System.out.print("enter the array elements");
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        System.out.print("enter the search element");
        int search=sc.nextInt();

        int first=0;
        int last=n-1;
        int middle=(first+last)/2;
        while(first<=last) 
        {
        if(arr[middle]<search)
            first=middle+1;
        
        else if( arr[middle] == search )
        {
            System.out.println(search+"location found in "+(middle+1));
            break;
        }
        else
            last=middle-1;
            middle=(first+last)/2;
    
    }
    if(first>last){
        System.out.println(search+"loaction not found");
    }
    }
}