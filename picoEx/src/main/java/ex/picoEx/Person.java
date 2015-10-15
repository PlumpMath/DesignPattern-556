package ex.picoEx;


public class Person {
	
	private String name;
	private int age;
	
	private Car car;
	
	public Person(){
		name = "Jam";
	}
	
	public Person(String n){
		name = n;
	}
	
	public Person(Car c){
		this.car = c;
	}
	
	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
