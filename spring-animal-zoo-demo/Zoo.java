package interf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("z")
public class Zoo {
	
	@Autowired
	@Qualifier("monkey")
	Animal a1;
	
	@Autowired
	@Qualifier("leo")
	Animal a2;
	
	void getAnimalSound() {
		a1.sound();
		a2.sound();
	}
}
