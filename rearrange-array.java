import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     public static void arrangeArray(int[] arr, int n){
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i=0;i<n;i++)
            hs.add(arr[i]);
        for(int i=0;i<n;i++){
            if(hs.contains(i))
            arr[i] = i;
            else
            arr[i] = -1;
        }
        printIt(arr,n);
     
     }
      public static void printIt(int[] arr, int n){
         System.out.println("Array after re-arrangement is :");
         for(int i=0;i<n;i++)
         System.out.print(arr[i]+" ");
         System.out.println();
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
	         arrangeArray(arr,n);
	         
	     }  
	 }
 }
