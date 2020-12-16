import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     public static void leftRotate(int[] arr, int n, int k){
         for(int i=0;i<k;i++)
         leftRotateByOne(arr, n);
         printIt(arr, n);
     }
     public static void leftRotateByOne(int[] arr, int n){
         int temp = arr[0];
         for(int i=0;i<n-1;i++){
             arr[i] = arr[i+1];
         }
         arr[n-1] = temp;
     }
     public static void printIt(int[] arr, int n){
         System.out.println("Array after rotation is :");
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
	         System.out.println("Enter number of rotations you need :");
	         int k = sc.nextInt();
	         int[] arr = new int[n];
	         System.out.println("enter array elements :");
	         for(int i=0; i<n; i++){
	             arr[i] = sc.nextInt();
	         }
	         
	         leftRotate(arr, n, k);
	     }  
	 }
 }
