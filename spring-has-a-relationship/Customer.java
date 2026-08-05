package has;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Customer {

	@Value("789456123")
	private long ano;
	@Value("arun")
	private String name;
	@Value("male")
	private String gender;

	@Override
	public String toString() {
		return "Customer [ano=" + ano + ", name=" + name + ", gender=" + gender + "]";
	}

}
