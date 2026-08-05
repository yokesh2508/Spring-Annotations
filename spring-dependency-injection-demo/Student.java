package pack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("s")
public class Student {

	@Value("1")
	int id;
	@Value("tom")
	String name;
	@Value("23")
	int age;
	@Value("chennai")
	String loc;
	@Autowired
	Course c;

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", loc=" + loc + ", c=" + c + "]";
	}

}
