import java.util.*;

public class Arrays12
{

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int a[]=new int[3];

		int b[]=new int[3];

		int n[]=new int[2];

		for(int i=0;i<3;i++)

		    a[i]=sc.nextInt();

		for(int i=0;i<3;i++)

		    b[i]=sc.nextInt();

		n[0]=a[a.length/3];

		n[1]=b[b.length/3];

		for(int i=0;i<2;i++)

		    System.out.print(n[i]+" ");

	}

}
