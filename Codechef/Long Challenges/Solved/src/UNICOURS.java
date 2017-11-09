import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UNICOURS {

	
	public static void main(String[] args) throws IOException
	{
		
		InputStreamReader input = new InputStreamReader(System.in); 
	    BufferedReader br = new BufferedReader(input);
	    int n=Integer.parseInt(br.readLine());
	    for(int i=0;i<n;i++)
	    {
	    	int l=Integer.parseInt(br.readLine());
	    	String line = br.readLine();
	    	//int a[]=new int[l];
		    String[] ar=line.trim().split(" ");
		    int f=0;
		    for(int j=0;j<l;j++)
		    {
		    	//a[j]=Integer.parseInt(ar[j]);
		    	int t=Integer.parseInt(ar[j]);
		    	if(t>f)
		    		f=t;
		    }
		    System.out.println(l-f);
	    }
	}

}
