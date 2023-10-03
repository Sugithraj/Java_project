package firstclass;

public class loading {
	
	public  void loading_game( String name) {
		System.out.println(name);
	}
    public  void loading_game(int age) {
		System.out.println(age);
	}
    public  void loading_game(float salary) {
	    System.out.println(salary);
}
	
	public static void main (String[] args) {
		
		loading game= new loading();
		 game.loading_game("Sugith");
		 game.loading_game(23);
		 game.loading_game(85550.5f);
	}

}
