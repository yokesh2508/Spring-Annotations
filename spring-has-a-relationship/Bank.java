package has;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("b")
public class Bank {

	@Value("SBI")
	private String name;
	@Value("chennai")
	private String loc;
	@Value("794561285")
	private String ifsc;

	@Autowired
	private Customer customer;

	@Override
	public String toString() {
		return "Bank [name=" + name + ", loc=" + loc + ", ifsc=" + ifsc + ", customer=" + customer + "]";
	}

}
