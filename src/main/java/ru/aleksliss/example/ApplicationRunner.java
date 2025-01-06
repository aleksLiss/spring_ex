package ru.aleksliss.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.aleksliss.example.database.pool.ConnectionPool;

public class ApplicationRunner {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        System.out.println(context.getBean("p11", ConnectionPool.class));


        context.close();
    }
}
