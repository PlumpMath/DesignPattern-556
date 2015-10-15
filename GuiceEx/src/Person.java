
public class Person {
	private Car owns;

	public void buyCar(Car c) {
		this.owns = c;
	}
	public Car getCar() {
		return this.owns;
	}
}
