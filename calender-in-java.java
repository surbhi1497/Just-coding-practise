import java.util.*;
import java.lang.*;
import java.io.*;
import java.time.*;

class GFG
 {
	public static void main (String[] args)
	 {
	  LocalDate date = LocalDate.now();
	  int month = date.getMonthValue();
	  int today = date.getDayOfMonth();
	  //set to start of days
	  date = date.minusDays(today-1);
	  DayOfWeek weekday = date.getDayOfWeek();
	  int value = weekday.getValue();//1->monday......7->sunday
	  
	  System.out.println("Mon Tues Wed Thu Fri Sat Sun");
	  for(int i=1;i<value;i++)
	    System.out.print("  ");
	  while(date.getMonthValue()==month){
	      Sytem.out.printf("%3d", date.getDayOfMonth());
	      if(date.getDayOfMonth()==today)
	        System.out.print("*");
	      else
	        System.out.print(" ");
	      date = date.plusDays(1);
	      if(date.getDayOfWeek().getValue()==1)
	        System.out.println();
	  }
	  if(date.getDayOfWeek().getValue()!=1)
	    System.out.println();
	 }
 }
