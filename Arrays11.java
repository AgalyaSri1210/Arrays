import java.util.*;

public class Arrays11
{

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();

		int arr[]=new int[n];

		for(int i=0;i<n;i++)

		    arr[i]=sc.nextInt();

		int flag=0;

		for(int i=0;i<n;i++)

		    if(arr[i]!=1 && arr[i]!=4)

		        flag++;

		if(flag>0)

		    System.out.println("false");

		else

		    System.out.println("true");

	}

}