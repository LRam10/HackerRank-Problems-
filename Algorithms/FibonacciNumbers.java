//Luis Ramirez

public class FibonacciNumbers {
	static int fibonacci(int n) {
	if(n<=0)
		return 0;
	else if(n==1)
			return 1;
	else
		return fibonacci(n-1)+fibonacci(n-2);
	}
	//Memoization technique
	static int fibonacciMemo(int n,int memo[]) {
		 if(n<=0)
				return 0;
		else if(n==1)
				return 1;
		 // check if value of memo[n]is bigger than 0 and it returns it
		else if(memo[n]>0)
			return memo[n];
		 memo[n] = fibonacciMemo(n-1,memo)+fibonacciMemo(n-2,memo);
		 return memo[n];
			
	}
	// O(n^2)
	public static void main(String[]args) {
		int n =40;
		int[]arr =new int[n+1];
		System.out.println(fibonacci(n));
		System.out.println(fibonacciMemo(n,arr));
	}

}
