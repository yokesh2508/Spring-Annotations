package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Config {
	
	@Bean
	@Qualifier("p1")
	public Map<Integer, String> m1(){
//		HashMap<Integer, String> p1=new HashMap<Integer, String>();
		LinkedHashMap<Integer, String> p1=new LinkedHashMap<Integer, String>();
		p1.put(1, "Laptop");
		p1.put(2, "Mobile");
		p1.put(3, "Tablet");
		p1.put(4, "Camera");
		
		return p1;
	}
	
	@Bean
	@Qualifier("p2")
	public Map<Integer, String> m2(){
//		HashMap<Integer, String> p2=new HashMap<Integer, String>();
		LinkedHashMap<Integer, String> p2=new LinkedHashMap<Integer, String>();
		p2.put(5, "Speaker");
		p2.put(6, "Tri-pad");
		p2.put(7, "Fridge");
		p2.put(8, "Vaccum-Cleaner");
		
		return p2;
	}
}
