import java.util.*;

public class Arrays13{

	public static void main(String[] args) {

		if(args.length ==4){

		    System.out.println("The given array is :");

		    for(int i=0;i<args.length;i+=2)
		        						System.out.println(args[i]+" "+args[i+1]);

		    System.out.println("The reverse of the array is :");

		    for(int i=args.length-1;i>0;i-=2)
		        						System.out.println(args[i]+" "+args[i-1]);

		}else{

		    System.out.println("Please enter 4 integer numbers");
					}

	}

}
