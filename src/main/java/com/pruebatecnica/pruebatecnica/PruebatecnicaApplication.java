package com.pruebatecnica.pruebatecnica;

import com.pruebatecnica.pruebatecnica.bean.MyBean;
import com.pruebatecnica.pruebatecnica.bean.MyBeanWithDependency;
import com.pruebatecnica.pruebatecnica.bean.MyBeanWithProperties;
import com.pruebatecnica.pruebatecnica.component.ComponentDependency;
import com.pruebatecnica.pruebatecnica.pojo.UserPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PruebatecnicaApplication implements CommandLineRunner {

	@Autowired
	private MyBeanWithProperties myBeanWithProperties;
	private ComponentDependency componentDependency;
	@Autowired
	private MyBean myBean;
	private UserPojo userPojo;

	private MyBeanWithDependency myBeanWithDependency;
	public PruebatecnicaApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependency, MyBean myBean, UserPojo userPojo, MyBeanWithDependency myBeanWithDependency){
		this.componentDependency = componentDependency;
		this.myBean= myBean;
		this.userPojo = userPojo;
		this.myBeanWithDependency= myBeanWithDependency;

	}
	public static void main(String[] args) {
		SpringApplication.run(PruebatecnicaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		componentDependency.saludar();
		myBean.print();
		myBeanWithDependency.printWithDependency();
		System.out.println(myBeanWithProperties.function());
		System.out.println(userPojo.getEmail()+userPojo.getPassword());
	}
}
