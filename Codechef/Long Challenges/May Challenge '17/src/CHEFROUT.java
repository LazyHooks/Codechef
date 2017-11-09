import java.util.Scanner;
import java.io.PrintStream;
public class CHEFROUT 
{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			String s = sc.next();
			int c=0;
			for(int j=0;j<s.length()-1;j++)
			{
				if(s.charAt(j)=='E')
					if(s.charAt(j+1)=='C')
						c++;
				if(s.charAt(j)=='S')
					if(s.charAt(j+1)=='E' || s.charAt(j+1)=='C')
						c++;
			}
			if(c==0)
				System.out.println("yes");
			else
				System.out.println("no");
		}
		sc.close();
	}

	
}
