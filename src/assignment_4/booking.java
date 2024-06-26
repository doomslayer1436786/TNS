package assignment_4;

import tns_25_06_2024_day05.tickets;

public class booking {
	public static void main(String []args) {
	tickets ob = new tickets(1);
	tickets.nooftickets--;
	System.out.println(ob);
	System.out.println("number of tickets left: "+tickets.nooftickets);

}

}
