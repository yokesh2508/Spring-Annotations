package list;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan
public class ListConfig {

	@Bean
	@Qualifier("c1")
	public List<String> m1() {
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Ajith");
		a1.add("arjundas");
		a1.add("sunil");
		a1.add("prasanna");

		return a1;
	}
	@Bean
//	@Primary
	@Qualifier("c2")
	public List<String> m2() {
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("kings lee");
		a1.add("prabhu");

		return a1;
	}
}
