
public class Factorial {
	//todo: implement a recursive functions whicht gives you the factorial value of a given number
	public static void main(String[] args){
       System.out.println("Factorial:"+factorial(5));
	}
	public static int factorial(int num){
		
		if(num<=1){
          return 1;
		}else{
			
			return num*factorial(num-1);
		}
	}
}

