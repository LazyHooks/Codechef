import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//import java.util.Scanner;
public class CHEFSUBA 
{

	
 public static void main(String args[]) throws IOException
 { 
	 try{
	 //Scanner sc=new Scanner(System.in);
		 int start=0,end=0;
	 InputStreamReader input = new InputStreamReader(System.in); 
	    BufferedReader br = new BufferedReader(input);
        String line = br.readLine();
	    line.trim();
	    StringTokenizer nkp=new StringTokenizer(line," ");
	 int n=Integer.parseInt(nkp.nextToken());
	 
	 int k=Integer.parseInt(nkp.nextToken());
	 long p=Integer.parseInt(nkp.nextToken());
	 int a[]=new int[3*n];
	  String line2=br.readLine();
	  line2.trim();
	  StringTokenizer are=new StringTokenizer(line2," ");
	 for(int i=0;i<n;i++)
	 {
		 a[i]=Integer.parseInt(are.nextToken());
		 a[n+i]=a[i];
	 }
	 start=n;
	 end=2*n;
	 
	 String p2=br.readLine();
	 long ct=0;
	 
	 while(ct<p)
	 {
		if(p2.charAt((int)ct)=='!')
		{
			start--;
			end--;
		}
		else if(p2.charAt((int)ct)=='?')
		{
			 int fmax=0,f=0;
			 int i=0;
             if(k>=n)
             {
            	 for(int i2=0;i2<n;i2++)
            	 fmax = fmax + a[i2];
             }
             else
             {
			 for(int i2=start;i2<start+k;i2++)
			 {
				 fmax=a[i2]+fmax;
			 }
			 
			 f=fmax;
			 
			 for(i=start+k;i<end;i++)
			 {
				 
				 f=f+a[i]-a[i-k];
				
				 
				 if(f>fmax)
					 fmax=f;
			 }
             }
			 System.out.println(fmax);
		 }
		ct++;
		}
	 }
	 catch(IOException e)
	 {
		 return;
	 }
	 catch(ArrayIndexOutOfBoundsException e)
	 {
		 return;
	 }
	 //sc.close(); 
 }
 
 
	 
 }
 
/*
 static void framecapture(int n,int k)
 {
	 int fmax=0,f=0;
	 for(int i=0i<n-k;i++)
	 {
		 f=0;
		 for(int j=i;j<i+k;j++)
		 {
			 f = f + a[j];
		 }
		 
		 if(f>fmax)
			 fmax=f;
	 }
	 System.out.println(fmax);
 }
 
 static void dogshift(int n)
 {
	 int b[] = new int[n];
	 b[0]=a[n-1];
	 for(int i=0;i<n-1;i++)
	 {
		 b[i+1]=a[i];
	 }
	 
	 for(int i=0;i<n;i++)
	 {
		 a[i]=b[i];
	 }
 }

}
*/
