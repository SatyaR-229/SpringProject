package org.example;

import org.example.entity.Address;
import org.example.entity.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import spring.example.entity.Student;

/**
 * Hello world!
 *
 */
@Configuration
@ComponentScan
public class App 
{
    public static void main( String[] args )
    {
        //using xml configuration
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
//        Employee employee = (Employee) applicationContext.getBean("emp1");
//        System.out.println(employee);
        // without using xml configuration
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(App.class);
        Employee e1 = (Employee) applicationContext.getBean("employee");
        Address add1 = (Address) applicationContext.getBean("address");
        add1.setArea("shivaiNagar");
        add1.setCountry("india");
        add1.setMobileNo(987678689l);
        add1.setPincode("345748");
        add1.setState("maharashtra");


        e1.setAddress(add1);
        e1.setName("satya");
        e1.setRollNo(234);
        e1.setSurname("rajbhar");
        System.out.println(e1);





    }
}
