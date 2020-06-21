import java.util.*;

public class Arrays3
{

	public static void main(String[] args) {

		int arr[]={1,4,34,56,7};

		Scanner sc=new Scanner(System.in);

		int search=sc.nextInt();

		int res=Arrays.binarySearch(arr,search);

		if(res <0)

		    System.out.println("-1");

		else

		    System.out.println(res);

	}

}