import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
 
class PERPALIN2
{
    static int len,box;
    static String seq;
    
    static StringBuilder sb=new StringBuilder();
    
    
    
    public static void main(String[] args)throws Exception
    {
    	InputStreamReader input = new InputStreamReader(System.in); 
        BufferedReader br = new BufferedReader(input);
    	int tc=0;
        for(tc=Integer.parseInt(br.readLine());tc>0;tc--)
        {
        	String s=br.readLine();
        	StringTokenizer st=new StringTokenizer(s," ");
	    	int len=Integer.parseInt(st.nextToken());
	    	int box=Integer.parseInt(st.nextToken());
            
            if(box<=1 || len%box!=0 || len<3)
            {
            	  sb.append("impossible\n");
                  continue;
            }
            StringBuilder fin=new StringBuilder();
            if(!solver())
            {
            	sb.append("impossible\n");
                continue;
            }
            for(int i=0;i<len/box;i++)
                fin.append(seq);
            sb.append(fin).append("\n");
        }
        System.out.print(sb);
    }
    static boolean solver()
    {
        if(box<3)return false;
        char[] ar=new char[box];
        Arrays.fill(ar, 'b');
        if((box&1)==0)ar[box/2-1]=ar[box/2]='a';
        else ar[box/2]='a';
        seq=String.valueOf(ar);
        return true;
    }
}
