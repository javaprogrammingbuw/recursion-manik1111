
public class Fibonacci {
	//todo: The Fibonacci sequence is a sequence where the current number is the sum of the previous numbers. You can read it up here:
	//https://en.wikipedia.org/wiki/Fibonacci_number
	//Write an iterative method fib which takes an integer as parameter. This integer corresponds to the position in the Fibonacci sequence.
	//fib should return the fibonacci number at this position. For example, fib(4) should return 3.
	//Now, write a second methond fibRek. fibRek does exactly the same like fib, but it works recursive.
	public static void main(String[] args){
		
		System.out.println(fibonacci(4));
		System.out.println(fibonacciRecursive(6));


	}
	public static int fibonacci(int num){
		int num1 = 0;
		int num2 = 1;
		int sum = 0;
		for (int i=1;i<num;i++){
			sum=num1 + num2;
			num1=num2;
			num2=sum;

		}
		return sum;
	}
	public static int fibonacciRecursive(int num){

		if(num<2){
			return num;
		}else{
			return fibonacciRecursive(num-2 ) + fibonacciRecursive(num-1);

		}

	}
}


