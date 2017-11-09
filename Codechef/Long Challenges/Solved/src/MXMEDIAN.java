import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MXMEDIAN {

	public static void main(String args[]) throws IOException
	{
		InputStreamReader input = new InputStreamReader(System.in); 
	    BufferedReader br = new BufferedReader(input);
	    int n=Integer.parseInt(br.readLine());
	    for(int i=0;i<n;i++)
	    {
	    	int l=Integer.parseInt(br.readLine());
	    	int m=(l+1)/2;
	    	m=m+l;
	    	String line = br.readLine();
	    	String[] ar=line.trim().split(" ");
	        int a[]=new int[2*l];
	        int tl=2*l;
	    	for(int j=0;j<tl;j++)
	    	{
	    		a[j]=Integer.parseInt(ar[j]);
	    	}
	    	quickSort(a,0,tl-1);
	    	System.out.println(a[m-1]);
	    	for(int j=0;j<l;j++)
	    	{
	    		System.out.print(a[j]+" "+a[l+j]+" ");
	    	}
	    	System.out.println();;
	    	}
		    
		    
	    }
	
public static void quickSort(int[] arr, int low, int high) {
if (arr == null || arr.length == 0)
return;
if (low >= high)
return;
// center
int middle = low + (high - low) / 2;
int pivot = arr[middle];
//right > pivot +make left < pivot 
int i = low, j = high;
while (i <= j) {
while (arr[i] < pivot){
i++;
}
while (arr[j] > pivot){
j--;
}
if (i <= j){
int temp = arr[i];
arr[i] = arr[j];
arr[j] = temp;
i++;
j--;
}
}
// recursion
if (low < j)
quickSort(arr, low, j);
if (high > i)
quickSort(arr, i, high);
}

}

