package interf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(AnimalConfig.class);
		
		Zoo z=(Zoo) context.getBean("z");
		
		z.getAnimalSound();
	}

}
