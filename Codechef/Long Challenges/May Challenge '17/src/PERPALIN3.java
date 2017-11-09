import java.util.Arrays;
import java.util.Scanner;
 
class PERPALIN3
{
    static int n,p;
    static String period;
    static Scanner fr=new Scanner(System.in);
    static StringBuilder sb=new StringBuilder();
    
    public static void main(String[] args)throws Exception
    {
        for(int tc=fr.nextInt();tc>0;tc--)
        {
            n=fr.nextInt();p=fr.nextInt();
            if(p<=1 || n%p!=0 || n<3)
            {
                sb.append("impossible\n");
                continue;
            }
            StringBuilder ans=new StringBuilder();
            if(!setPeriod())
            {
                sb.append("impossible\n");
                continue;
            }
            for(int i=0;i<n/p;i++)
                ans.append(period);
            sb.append(ans).append("\n");
        }
        System.out.print(sb);
    }
    static boolean setPeriod()
    {
        if(p<3)return false;
        char[] ar=new char[p];
        Arrays.fill(ar, 'b');
        if((p&1)==0)ar[p/2-1]=ar[p/2]='a';
        else ar[p/2]='a';
        period=String.valueOf(ar);
        return true;
    }
}