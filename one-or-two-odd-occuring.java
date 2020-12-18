import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	     Scanner sc = new Scanner(System.in);
	     System.out.println("Enter the number of test cases : ");
	     int t = sc.nextInt();
	     while(t-->0){
	         System.out.println("Enter the number of elements :");
	         int n = sc.nextInt();
	         System.out.println("Enter the elements now :");
	         int[] arr = new int[n];
	         for(int i=0;i<n;i++)
	            arr[i] = sc.nextInt();
	         int res = 0;
	         for(int i=0;i<n;i++)
	            res = res^arr[i];
	           
	         
	         System.out.println("the one odd occuring element is :" +res);
	         
	     }
	 }
 }
 
 -----------------------------------------------------------------------------------------------------------------------------
 -----------------------------------------------------------------------------------------------------------------------------
 // two odd occuring elements 
 
 import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	     Scanner sc = new Scanner(System.in);
	     System.out.println("Enter the number of test cases : ");
	     int t = sc.nextInt();
	     while(t-->0){
	         System.out.println("Enter the number of elements :");
	         int n = sc.nextInt();
	         System.out.println("Enter the elements now :");
	         int[] arr = new int[n];
	         for(int i=0;i<n;i++)
	            arr[i] = sc.nextInt();
	         int xor=0,res1=0,res2 = 0;
	         for(int i=0;i<n;i++)
	            xor = xor^arr[i];
	         int grp = xor&~(xor-1);// right most bit
	         for(int i=0;i<n;i++)
	         {
	             if((arr[i] & grp)!=0)
	                res1 = res1^arr[i];
	             else
	                res2 = res2^arr[i];   
	         }
	         System.out.println("the two odd occuring element is :" +res1+" and "+res2);
	         
	     }
	 }
 }
 
 
