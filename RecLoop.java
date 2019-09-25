import java.util.Scanner;

public class RecLoop{

	//todo: Look at the given code and try to understand the methods.
	//The first method euklidRek uses recursion to compute the euclidean algorithm.
	//You can look up the algorithm here: https://en.wikipedia.org/wiki/Euclidean_algorithm
	//Add another method euclidIterative that computes the euclidean algorithm iterative.
	//The second method powIterative computes the the base to the power of n in a iterative way.
	//Add another method powRek which does exactly the same, but by using recursion.
	public static void main(String[] args){
		System.out.println(euclidIterative(20,20));
		System.out.println(powRecursive(4.0,2.0));
	}

	/* public static int euclidRec(int a, int b) {
		if (a == b) {
			return a;
		} else if (b > a) {
			int temp = a;
			a = b;
			b = temp;
			return euclidRec(a, b);
		} else {
			return euclidRec(a - b, b);

		}*/
	

	public static int euclidIterative(int a, int b){
		if (a==b){
			return a;
		}else if(a>b){
			for(int i=1;i<=b;i++){
				b=a-i;
				
			}
			return b;
		}else{
			for(int i=1;i<=a;i++){
				a=b-i;
			}
			return a;
		}
	}

   /* public static double powIterative(final double base, final int n) {
		if (n < 0) {
			System.out.println("(Our version of) power is undefined for negative numbers.");
			return -1;
		} else {
			double result = 1; 

			for (int i = n; i > 0; --i) {
				result = result * base;
			}
			return result;
		}
	}*/

	public static double powRecursive(final double base,final double n){
    	if(n<0){
    		System.out.println("(Our version of) power is undefined for negative numbers.");
			return -1;
    	}
    	if(n==0){
    		return 1;
    	}else {

    		return base*powRecursive(base,n-1);
    	}
	}

}
