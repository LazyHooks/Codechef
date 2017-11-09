import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CLRL {

	public static void main(String[] args) throws IOException
    {
		InputStreamReader input = new InputStreamReader(System.in); 
	    BufferedReader br = new BufferedReader(input);
	    int n=Integer.parseInt(br.readLine());
	    for(int i=0;i<n;i++)
	    {
	    	String s=br.readLine();
	    	StringTokenizer st=new StringTokenizer(s," ");
	    	int t=Integer.parseInt(st.nextToken());
	    	int r=Integer.parseInt(st.nextToken());
	    	String s2=br.readLine();
	    	StringTokenizer st2=new StringTokenizer(s2," ");
	    	
	    	int ub=0,lb=0;
	    	int count=0;
	    	
	    	for(int j=0;j<t-1;j++)
	    	{
	    		int cv=Integer.parseInt(st2.nextToken());
	    		if(ub==0 && cv>r)
	    		{
	    			ub=cv;
	    		}
	    		if(lb==0 && cv<r)
	    		{
	    			lb=cv;
	    		}
	    		if(cv>r)
	    		{
	    			if(cv>ub)
	    			{
	    				count++;
	    				break;
	    			}
	    			if(cv<ub)
	    			{
	    				ub=cv;
	    			}
	    		}
	    		if(cv<r)
	    		{
	    			if(cv<lb)
	    			{
	    				count++;
	    				break;
	    			}
	    			if(cv>lb)
	    			{
	    				lb=cv;
	    			}
	    		}
	    	}
	    	if(count==0)
	    	{
	    		System.out.println("YES");
	    	}
	    	else
	    	{
	    		System.out.println("NO");
	    	}
	    }
	}
}
