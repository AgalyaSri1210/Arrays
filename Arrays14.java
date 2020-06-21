import java.util.*;

public class Arrays14
{

	public static void main(String[] args) {

		if(args.length ==9){

		    System.out.println("The given array is :");

		    for(int i=0;i<args.length;i+=3)

		        System.out.println(args[i]+" "+args[i+1]+" "+args[i+2]);

		    Arrays.sort(args);

		    System.out.println("The biggest number in the given array is : "+args[args.length-1]);

		}else{

		    System.out.println("Please enter 9 integer numbers");

		}

	}

}
