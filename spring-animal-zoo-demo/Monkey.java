package interf;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("m")
//@Primary
@Qualifier("monkey")
public class Monkey implements Animal {

	public void sound() {
		System.out.println("oo--oo--ah--ah");
	}
}
