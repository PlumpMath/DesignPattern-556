
public class Main {
	public static void main(String[] args) {
		Person p = new Person();
		Car c = new Car();
		p.buyCar(c);
		c.fillGas(new GasPump());
		c.fillGas(new GasPump());

	}
}
