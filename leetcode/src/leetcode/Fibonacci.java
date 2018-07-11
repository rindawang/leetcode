package leetcode;

public class Fibonacci {
	public static int fib(int n){

		if(n <=2){
			return 1;
		}
		
		int fn1 = 1, fn2 = 1, temp;
		for(int i =3;  i <= n; i++){
			temp = fn1 + fn2;
			fn1 = fn2;
			fn2 = temp;
		}
		return fn2;
	}
	
	public static void main(String[] args){
		System.out.println(fib(6));
	}

}
