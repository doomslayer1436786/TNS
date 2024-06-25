//Program to demonstrate static
package tns_25_06_2024_day05;

//class Employee
public class staticprograms {
	//instance variable
	private String name;
	private int id;
	
	
	public static String companyName = "TNSIF";
	
	public staticprograms(String name,int id) {
		super();
		this.name=name;
		this.id=id;
	}

	@Override
	public String toString() {
		return "staticprograms [name=" + name + ", id=" + id + "]";
	}
	
	
	
	
}
