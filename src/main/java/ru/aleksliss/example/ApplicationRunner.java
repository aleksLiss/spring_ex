package ru.aleksliss.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.aleksliss.example.database.pool.ConnectionPool;

public class ApplicationRunner {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        System.out.println(context.getBean("p11", ConnectionPool.class));
        context.getBean("p1", ConnectionPool.class)
                .getProperties()
                .forEach((k, v) -> System.out.println(v));
        context.close();
    }
}
