package rajesh.kumar.springboot;

import org.springframework.core.io.FileSystemResource;

public class Springmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hare krishna");
		Beanfactory factory= new XmlBeanfactory(new FileSystemResource("spring.xml"));
		
	}
	


}
