package scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context =new AnnotationConfigApplicationContext(Config.class);
		
		Student s1=(Student)context.getBean("s");
		Student s2=(Student)context.getBean("s");
		
		System.out.println(s1);
		System.out.println(s2);
		
	}

}
