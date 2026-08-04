package interfEx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("a")
public class Atm {
	@Autowired
	@Qualifier("b1")
	Bank b1;

	@Autowired
	@Qualifier("b2")
	Bank b2;

	public void bankBalance() {
		b1.balance();
		b2.balance();
	}

}
