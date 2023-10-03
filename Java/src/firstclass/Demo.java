package firstclass;

public class Demo {
	public void thilakar(String name) {
		System.out.println(name);
	}
	
		public void thilakar(int age) {
		System.out.println(age);
	}
		
	
	public void thilakar(float salary) {
		System.out.println(salary);
	}
	
	
	public static void main (String[] args) {
		System.out.println("sugith lap");
		 Demo obj = new Demo();
		 obj.thilakar("riyash");
		 obj.thilakar(22);
		 obj.thilakar(3.2000f);
	}
}
