package practice;

public class Factorial {

	public static void main(String[] args) {
		
		
		fact(5);

	}

	static void fact(int num) {
		
		int  i;
		int fact =1 ;
		for (i =1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
		
		
		
	}
	
	
	
}
