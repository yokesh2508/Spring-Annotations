package scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("s")
@Scope("prototype")
public class Student {

	public Student() {
		System.out.println("Student constructor");
	}

	void m1() {
		System.out.println("Hello world");
	}
}
