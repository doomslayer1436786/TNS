package assignment_4;

public class tickets {
private int person;
	
	public static int nooftickets = 5;
	
	public tickets(int person) {
		
		this.person = person;
		
	}

	@Override
	public String toString() {
		
		return "tickets [person number=" + person + "]";
	}
	

}
