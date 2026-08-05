package has;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(BankConfig.class);
		
		Bank b1=(Bank) context.getBean("b");
		
		System.out.println(b1);
	}
	

}
