package assignment_7;

public class ConstructorOverloading {
	
	ConstructorOverloading(){
		System.out.println("Non parameterized constructor");
		
	}
	ConstructorOverloading(String s){
		System.out.println("Parametirized Constructor with String parameter "+ s);
		
	}
	ConstructorOverloading(String s, int q){
		System.out.println("Parametirized Constructor with multiple parameters with String and Integer  "+ s + q);
		
	}

}
