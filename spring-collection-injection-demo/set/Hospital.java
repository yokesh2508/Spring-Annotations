package set;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("h")
public class Hospital {

	@Value("1")
	private int id;
	@Value("SIIMS")
	private String name;
	@Value("vadapalani")
	private String loc;
	@Value("4.2")
	private double rating;

	@Autowired
	@Qualifier("p1")
	private Set<String> patients1;

	@Autowired
	@Qualifier("p2")
	private Set<String> patients2;

	@Override
	public String toString() {
		return "Hospital [id=" + id + ", name=" + name + ", loc=" + loc + ", rating=" + rating + ", patients1="
				+ patients1 + ", patients2=" + patients2 + "]";
	}

}
