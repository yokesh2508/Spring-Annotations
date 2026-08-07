package lifeCycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		LifeCycle l1 = (LifeCycle) context.getBean("l");

		l1.save();
		
		context.close();
	}

}
