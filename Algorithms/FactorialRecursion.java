//Luis Ramirez
public class FactorialRecursion {
	static int factorial(int n) {
	if (n<0)
		return 0;
	else if(n==1) 
		return 1;
	else
	return n*factorial(n-1);// time O(n)
	}
	/*
	       factorial(4)
	 	/	          \
4*facorial(4-1)	
     /
3*facorial(3-1)
    /
2*factorial(2-1)
	 */

	public static void main(String[]args) {
		int n = factorial(4);
		System.out.println(n);
	}
}
