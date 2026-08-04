package interf;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("l")
@Qualifier("leo")
public class Lion implements Animal {

	public void sound() {
		System.out.println("Roaringgg");
	}
}
