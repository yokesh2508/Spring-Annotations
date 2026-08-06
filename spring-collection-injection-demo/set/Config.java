package set;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Config {

	@Bean
	@Qualifier("p1")
	public Set<String> m1() {
		HashSet<String> h1 = new HashSet<String>();
		h1.add("arun");
		h1.add("karan");
		h1.add("rian");
		h1.add("pradeep");

		return h1;
	}

	@Bean
	@Qualifier("p2")
	public Set<String> m2() {
		HashSet<String> h1 = new HashSet<String>();
		h1.add("dhilip");
		h1.add("praveen");
		h1.add("saran");
		h1.add("madhan");

		return h1;
	}
}
