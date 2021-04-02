
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num=1234;
       String ch="abcd";
		
       System.out.println("Current  Num is="+num);
		StringBuilder sb=new StringBuilder();
		StringBuilder rev=sb.append(num);
		StringBuilder revnum=sb.reverse();
		
		System.out.println("Reverse Num is="+revnum);
		
		StringBuilder sb1=new StringBuilder();
		StringBuilder rev1=sb1.append(ch);
		StringBuilder revnum1=sb1.reverse();
		System.out.println("Reverse Num is="+revnum1);
		
		
		//reverse string using String Buffer
		
		StringBuffer sc=new StringBuffer(ch);
		System.out.println(sc.reverse());
		
		
		
	}

}
