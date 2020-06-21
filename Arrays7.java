import java.util.*;

public class Arrays7
{

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();

		int arr[]=new int[n];

		for(int i=0;i<n;i++)

		    arr[i]=sc.nextInt();

		int len=arr.length;

		for(int i=0;i<len;i++){

		    for(int j=i+1;j<len;j++){

		        if(arr[i]==arr[j]){

		            arr[j]=arr[len-1];

		            len--;

		            j--;

		        }

		    }

		}

		int a[]=Arrays.copyOf(arr,len);

		Arrays.sort(a);

		for(int i=0;i<a.length;i++)

		    System.out.print(a[i]+" ");

	}

}