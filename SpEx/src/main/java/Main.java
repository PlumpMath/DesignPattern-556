
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ImportResource("classpath:beans.xml")
public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Person p = context.getBean(Person.class);
		p.getCar().printCar();

		context.close();
	}
}
