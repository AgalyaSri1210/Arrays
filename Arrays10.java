import java.util.*;

public class Arrays10
{

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();

		int arr[]=new int[n];

		for(int i=0;i<n;i++)

		    arr[i]=sc.nextInt();

		int b[]=new int[n];

		int j=0;

		for(int i=0;i<n;i++){

		    if(arr[i]%2 ==0){

		        b[j]=arr[i];

		        j++;

		    }

		}

		for(int i=0;i<n;i++){

		    if(arr[i]%2 !=0){

		        b[j]=arr[i];

		        j++;

		    }

		}

		for(int k=0;k<n;k++)

		    System.out.print(b[k]+" ");

	}

}
