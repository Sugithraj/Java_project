package firstclass;

public class Abs_implement extends Banking {

	public void atm_card() {
		System.out.println("Atm card issued");
		
	}

	public void passbook() {
		System.out.println("passbook not printed");
		
	}

	public void savingsacc() {
		System.out.println("Savings Account");
		
	}
	
	public static void main (String[]args) {
		Abs_implement object = new Abs_implement();
		object.atm_card();
		object.passbook();
		object.savingsacc();
	}

}
