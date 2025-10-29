import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int h=0;h<t;h++){
		    int n=sc.nextInt();
		    int x=sc.nextInt();
		    int s=0,p,b;
		    if(n>x){
		    int a=n-x+1;
		    for(int i=x;i<=n;i++){
		        s+=i;
		    }
		    b=x*a;
		    p=s-b;
		    System.out.println(p);
		    }
		    else{
		        System.out.println("0");
		    }
		}

	}
}
