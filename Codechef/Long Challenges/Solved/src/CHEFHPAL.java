

import java.util.Scanner;


class CHEFHPAL 
{
	public static void main(String[] args) throws Exception
    {
		String arr[]= {"1 a","1 ab","2 abb","2 aabb","3 aaabb","3 aaabbb","3 aaababb","3 bbbabaaa"};
		String sampler="bbabaa";
		Scanner sc=new Scanner(System.in);
		StringBuilder fin=new StringBuilder();
	    
		for(int i=sc.nextInt();i>0;i--)
	    {

	    	
	    	int n=sc.nextInt();
	    	int a=sc.nextInt();
	    	StringBuilder sb=new StringBuilder();
	    	if(a!=2)
	    	{
	    		
	    		for(int k=0;k<n;k++)
	    		{
	    			
	                sb.append((char)('a'+k%a));
	    		}
	            if(a>2)
	            	{
	            	sb.insert(0, "1 ");
	            	}
	            else
	            	{
	            	sb.insert(0,n+" ");
	            	}
	            fin.append(sb.toString()).append("\n");
	    		
	    	}
	    	else if(n>8)
	    	{
	    		sb.append("4 ");
	    		for(int k=0;k<n;k++)
	    		{
	    		sb.append(sampler.charAt(sampler.length()));
	    		}
	    		fin.append(sb.toString()).append("\n");
	    		
	    	}
	    	else
	    	{
	    		
	    		sb.append(arr[n-1]);
	    		fin.append(sb.toString()).append("\n");
	    	}
	    	
	    	
	    	
	    	}
	    System.out.print(fin);
	    sc.close();
	    }
    }

