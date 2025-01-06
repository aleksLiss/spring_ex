package ru.aleksliss.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.aleksliss.example.database.pool.ConnectionPool;
import ru.aleksliss.example.database.repository.CompanyRepository;

public class ApplicationRunner {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        System.out.println(context.getBean("p11", ConnectionPool.class));


        CompanyRepository companyRepository = context.getBean("companyRepository", CompanyRepository.class);
        System.out.println(companyRepository);
    }
}