import java.util.*;

public class Arrays8
{

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();

		int arr[]=new int[n];

		for(int i=0;i<n;i++)

		    arr[i]=sc.nextInt();

		int sum=0;

		for(int i=0;i<n;i++){

		    if(arr[i]==6 && i<n-1){

		        do{

		            i++;

		        }while(arr[i]!=7);

		    }else

		        sum+=arr[i];

		}

		System.out.println(sum);

	}

}
