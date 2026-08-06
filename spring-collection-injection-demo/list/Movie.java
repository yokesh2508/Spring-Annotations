package list;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("m")
public class Movie {

	@Value("1")
	private int id;
	@Value("GBU")
	private String name;
	@Value("4.7")
	private double rating;
	@Value("2026")
	private int yofRelease;

	@Autowired
	@Qualifier("c1")
	private List<String> CastCrew1;
	
	@Autowired
	@Qualifier("c2")
	private List<String> CastCrew2;

	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", rating=" + rating + ", yofRelease=" + yofRelease
				+ ", CastCrew1=" + CastCrew1 + ", CastCrew2=" + CastCrew2 + "]";
	}

	

}
