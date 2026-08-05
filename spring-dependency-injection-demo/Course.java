package pack;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("c")
public class Course {

	@Value("1")
	int cid;
	@Value("java")
	String cname;
	@Value("7000")
	double fees;

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", fees=" + fees + "]";
	}

}
