package firstclass;

public class Interface_imple implements Banking_interface {

    public void atm_card() {
		System.out.println(1);
		
	}

	
	public void passbook() {
		
		System.out.println(2);
	}

	
	public void savingsacc() {
		
		System.out.println(3);
	}
	
	public static void main(String[] args) {
		
		Interface_imple obj = new Interface_imple();
		
		obj.atm_card();
		obj.passbook();
		obj.savingsacc();

	}

	
	

}
