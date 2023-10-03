package riyas;

public class Myaccount extends Finance {
public void salary(){ 
	System.out.println("ten thousand");}

public void account() {
	System.out.println("MD.riyash");
}
public void expences() {
	System.out.println("accroding to my wife");
}
public static void main(String[]args) {
	Myaccount on = new Myaccount();
	on.account();
	on.expences();
	on.salary();
			
}

}
