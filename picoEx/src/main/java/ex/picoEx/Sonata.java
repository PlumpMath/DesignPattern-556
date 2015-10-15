package ex.picoEx;

public class Sonata implements Car {
	
	private String name;
	
	public Sonata(){
		this.name = "default Sonata";
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void printCar() {
		System.out.println(name + "!!");
	}

}
