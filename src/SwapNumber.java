
public class SwapNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int a=10;
		int b=20;
		
		System.out.println("Numbers a is " +a+ " And NUmber b is "+b);
		
	/*	int t=a;
		a=b;
		b=t;
		
		System.out.println("Numbers a is " +a+ " And NUmber b is "+b); */
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("Numbers a is " +a+ " And NUmber b is "+b); 
		
	
	}

}
