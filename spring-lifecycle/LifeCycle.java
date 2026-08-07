package lifeCycle;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component("l")
public class LifeCycle {

	@PostConstruct
	public void m1() {
		System.out.println("I am init method");
	}

	@PreDestroy
	public void m2() {
		System.out.println("I am destroy method");
	}

	public void save() {
		System.out.println("Save");
	}
}
