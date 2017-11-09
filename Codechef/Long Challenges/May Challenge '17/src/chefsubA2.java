import java.util.Scanner;
import java.util.StringTokenizer;
class ChefSubA1
{
    long []ar;
    long p,max=-1,sum0=0;int n,k,c0=0,pos=0;boolean flag=false;
    public static void main(String[] args)
    {
        ChefSubA1 cs=new ChefSubA1();
        Scanner br=new Scanner(System.in);

        int i;String s="";

        StringTokenizer st1=new StringTokenizer(br.nextLine());
        StringTokenizer st2=new StringTokenizer(br.nextLine());
        cs.n=Integer.parseInt(st1.nextToken());
        cs.k=Integer.parseInt(st1.nextToken());
        cs.p=Long.parseLong(st1.nextToken());


        if(cs.k>cs.n)cs.k=cs.n;

        cs.ar=new long[cs.n];

        for(i=0;i<cs.n;i++)
        {
            cs.ar[i]=Integer.parseInt(st2.nextToken());
            if(i<cs.k)cs.sum0+=cs.ar[i];
        }

        s=br.nextLine();

        for(i=0;i<cs.p;i++)
        {
            switch(s.charAt(i))
            {
                case '!':
                if(cs.n>cs.k)
                {

cs.sum0+=cs.ar[cs.c0=cs.stabilise(cs.c0-1)]-cs.ar[cs.stabilise(cs.c0+cs.k)];
                    cs.check();
                }
                break;

                case '?':
                if(cs.n==cs.k)System.out.println(cs.sum0);
                else if(!cs.flag)
                    System.out.println(cs.Count());
                else System.out.println(cs.max);
                break;
            }
        }
    }
    void check()
    {
        int ep=stabilise(c0-1),s=stabilise(pos-k+1);
        if(!flag || s==pos)return;
        if((c0>ep && (s<=ep|| s>pos) && pos>=c0) || (c0<ep && s>pos))flag=false;
        if(flag && sum0>max)max=sum0;
    }
    long Count()
    {
        int i;long counter=0,t;
        max=-1;pos=0;
        for(i=c0,t=1;;i++,t++)
        {
            i%=n;
            counter+=ar[i];
            if(t>=k)
            {
                if(t>k)counter-=ar[stabilise(i-k)];
                if(counter>max)
                {
                    max=counter;
                    pos=i;
                }
            }
            if(i==stabilise(c0-1))break;
        }
        flag=true;
        return max;
    }
    int stabilise(int x)
    {
        while(x<0)x=(x+(9*n))%n;
        return x%n;
    }
}