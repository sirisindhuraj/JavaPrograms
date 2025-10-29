import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int h=0;h<t;h++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a!=b){
                System.out.println(a+b);
            }
            else{
                System.out.println(a+b-1);
            }
        }
	}
}
