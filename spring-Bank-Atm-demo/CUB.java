package interfEx;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("c")
//@Primary
@Qualifier("b2")
public class CUB implements Bank {
	public void balance() {
		System.out.println("Your Balance is Rs:18000");
	}
}
