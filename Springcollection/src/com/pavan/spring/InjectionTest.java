package com.pavan.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class InjectionTest {
	public static void main(String[] args) {
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource("src/com/test/collection injection.xml"));
		
		Student st=factory.getBean("student",Student.class);
		System.out.println(st);
}

}
