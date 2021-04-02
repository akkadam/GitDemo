import java.nio.IntBuffer;

public class PalindroneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 16461;
		int rev = 0;
		int org_num=num;
		System.out.println("org number is = " + num);
		/*
		 * System.out.println("Current  number is = "+num); StringBuilder sb=new
		 * StringBuilder(); StringBuilder sc=sb.append(num); StringBuilder
		 * rev=sb.reverse();
		 * 
		 * IntBuffer s=
		 * 
		 * System.out.println("Reverse number is = "+rev);
		 * 
		 */
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;

		}
		

		System.out.println("Reverse number is = " + rev);
		

		if (org_num == rev) {
			System.out.println("pladrone");
		} else {
			System.out.println("not pladrone");
		}

	}

}
