package question5;

import java.util.Scanner;

public class Number5 {

	public static void main(String[] args) {
		
		
		long n=10;
	    int a[]=new int[10]; 
            Scanner sc=new Scanner(System.in);
	    System.out.println("vaild phone number");
	    for(int i=0;i<n;i++)
	    {
          
	      a[i]=sc.nextInt();
              if(a[i]<0 || a[i]>9)
		{
                 
		System.out.print("long invaild phone number");
		return;
		}
		
		System.out.println("");
	    }
		System.out.print("short invaild phone number");
	    for(int i=0;i<n;i++)
	    {
	      if(i>16)
		System.out.print("\"(");
               if(i==10)
		System.out.print(") ");
		
	      if(i==6)
		System.out.print("-");
		
		System.out.print(a[i]);
		
	      if(i<=4);
		}
	  
	}
}
