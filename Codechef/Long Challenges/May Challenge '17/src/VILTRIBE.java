import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class VILTRIBE
{
	public static void main(String[] args) throws IOException
    {
		InputStreamReader input = new InputStreamReader(System.in); 
	    BufferedReader br = new BufferedReader(input);
	    int n=Integer.parseInt(br.readLine());
	    for(int i=0;i<n;i++)
	    {
	    	
	    	String s = br.readLine();
	    	int sl=s.length();
	    	int ac=0,bc=0;
	    	int count=0;
	    	for(int j=0;j<sl;j++)
	    	{
	    		char c = s.charAt(j);
	    		
	    		
	    		if(c=='A' || c=='a')
	    		{
	    			ac++;
	    			if(count!=0)
	    			{
	    				ac=ac+count;
	    				count=0;
	    			}
	    			
	    			for(int k=j+1;k<sl;k++)
	    			{
	    				if(s.charAt(k)=='.')
	    				{
	    					count++;
	    				}
	    				else if(s.charAt(k)=='A' || s.charAt(k)=='a')
	    				{
	    					j=k-1;
	    					break;
	    				}
	    				else if(s.charAt(k)=='B' || s.charAt(k)=='b')
	    				{
	    					j=k-1;
	    					count=0;
	    					break;
	    				}
	    			}
	    		
	    		}
	    		
	    		if(c=='B' || c=='b')
	    		{
	    			bc++;
	    			if(count!=0)
	    			{
	    				bc=bc+count;
	    				count=0;
	    			}
	    			
	    			for(int k=j+1;k<sl;k++)
	    			{
	    				if(s.charAt(k)=='.')
	    				{
	    					count++;
	    				}
	    				else if(s.charAt(k)=='B' || s.charAt(k)=='b')
	    				{
	    					j=k-1;
	    					break;
	    				}
	    				else if(s.charAt(k)=='A' || s.charAt(k)=='a')
	    				{
	    					j=k-1;
	    					count=0;
	    					break;
	    				}
	    			}
	    		
	    		}
	    		
	    		
	    	}
	    	
	    	System.out.println(ac+" "+bc);
	    	
	    }
        
	}
}