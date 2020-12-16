import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     public static int findMin(int[] arr, int low, int high){
        if(high<low)
        return arr[0];
        if(high==low)
        return arr[low];
        int mid = (low+high)/2;
        if(mid<high && arr[mid+1]<arr[mid])
        return arr[mid+1];
        if(mid>low && arr[mid]<arr[mid-1])
        return arr[mid];
        if(arr[high]>arr[mid])
        return findMin(arr, low, mid-1);
        return findMin(arr, mid+1, high);
     
     }
    
	public static void main (String[] args)
	 {
	     Scanner sc = new Scanner(System.in);
	     System.out.println("Enter number of test cases :");
	     int t = sc.nextInt();
	     while(t-->0){
	         System.out.println("Enter size of array : ");
	         int n = sc.nextInt();
	        
	         int[] arr = new int[n];
	         System.out.println("enter array elements :");
	         for(int i=0; i<n; i++){
	             arr[i] = sc.nextInt();
	         }
	         
	         System.out.println(findMin(arr, 0,n));
	     }  
	 }
 }
