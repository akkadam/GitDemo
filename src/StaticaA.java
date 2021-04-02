
public class StaticaA {
	
	String a="bh";
	public static String b="bhas";
	
	public static class Outer{
		
		public void getData() {
			System.out.println("Hi ak");
			System.out.println(b);
		}
		
		public static void getDataapp() {
			System.out.println("Hi akash");
			//System.out.println(b);
			//System.out.println(b);
		}
		
				
	}
	
	public void getData1() {
		System.out.println("Hi ak");
	}
	
	

	public static void main(String[] args) {
		StaticaA.Outer sd=new StaticaA.Outer();
		sd.getData();
		Outer.getDataapp();

	}

}
