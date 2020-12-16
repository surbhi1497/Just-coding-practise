import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     public static boolean findPair(int[] arr, int n, int sum){
        int l,r;
        Arrays.sort(arr);
        l=0;
        r=n-1;
        while(l<r){
            if(arr[l]+arr[r] == sum)
            return true;
            else if(arr[l]+arr[r]<sum)
            l++;
            else
            r--;
        }
        return false;
     
     
     }
   
	public static void main (String[] args)
	 {
	     Scanner sc = new Scanner(System.in);
	     System.out.println("Enter number of test cases :");
	     int t = sc.nextInt();
	     while(t-->0){
	         System.out.println("Enter size of array : ");
	         int n = sc.nextInt();
	         System.out.println("Enter sum of pair you need :");
	         int sum = sc.nextInt();
	         int[] arr = new int[n];
	         System.out.println("enter array elements :");
	         for(int i=0; i<n; i++){
	             arr[i] = sc.nextInt();
	         }
	         if(findPair(arr,n,sum))
	         System.out.println("yes exist");
	         else
	         System.out.println("no, sorry doesn't exist");
	     }  
	 }
 }
