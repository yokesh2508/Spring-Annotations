package map;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("p")
public class Products {

	@Value("1")
	private int id;
	@Value("DMart")
	private String name;
	@Value("Kodambakkam")
	private String loc;
	@Value("3.9")
	private double rating;

	@Autowired
	@Qualifier("p1")
	private Map<Integer, String> products1;

	@Autowired
	@Qualifier("p2")
	private Map<Integer, String> products2;

	@Override
	public String toString() {
		return "Products [id=" + id + ", name=" + name + ", loc=" + loc + ", rating=" + rating + ", products1="
				+ products1 + ", products2=" + products2 + "]";
	}

}
