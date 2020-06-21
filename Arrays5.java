import java.util.*;

public class Arrays5
{

	public static void main(String[] args) {

		int arr[]={65,77,33,99,108,113};

		Arrays.sort(arr);

		System.out.println("smallest 2 nos : "+arr[0]+" "+arr[1]);

		System.out.println("largest 2 nos : "+arr[arr.length-1]+" "+arr[arr.length-2]);

	}

}