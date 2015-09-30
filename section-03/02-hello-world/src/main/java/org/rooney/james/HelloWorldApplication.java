package org.rooney.james;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.hibernate.Session;

import org.rooney.james.util.HibernateUtil;
import org.rooney.james.entity.Message;

//@SpringBootApplication
public class HelloWorldApplication {

    /*public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication.class, args);
    }*/

    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Message message = new Message( "Hello World with Hibernate & JPA Annotations" );

        session.save(message);

        session.getTransaction().commit();
        session.close();

    }
}
