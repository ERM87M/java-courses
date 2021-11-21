package org.example;

import configuration.MyConfig;
import org.example.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;


public class App 
{
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication",Communication.class);

//        List<Employee> allEmployees=communication.getAllEmployees();
//        System.out.println(allEmployees);
//        Employee empByID = communication.getEmployee(1);
//        System.out.println(empByID);
//        Employee emp=new Employee("Sveta","Sokolova","HR",1900);
//        emp.setId(24);
//        communication.saveEmployee(emp);
        communication.deleteEmployee(24);
    }
}

