package interfEx;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("s")
@Qualifier("b1")
public class SBI implements Bank{
	
	public void balance() {
		System.out.println("Your Balance is RS:25000");
	}
}
