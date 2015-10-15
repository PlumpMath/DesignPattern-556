package ex.picoEx;

import org.picocontainer.DefaultPicoContainer;
import org.picocontainer.MutablePicoContainer;
import org.picocontainer.injectors.SetterInjection;

public class Main {
	public static void main(String[] args) {
		
		MutablePicoContainer pico = new DefaultPicoContainer();
		pico.addComponent(Person.class);
		pico.addComponent(Sonata.class);
		
		Person p = pico.getComponent(Person.class);
	
		p.getCar().printCar();
	}
}
