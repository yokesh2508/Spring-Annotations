package interfEx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(BankConfig.class);

		Atm a1 = (Atm) context.getBean("a");

		a1.bankBalance();
	}

}
