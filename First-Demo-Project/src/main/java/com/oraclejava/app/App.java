package com.oraclejava.app;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oraclejava.model.Message;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Message message = context.getBean("message", Message.class);
        System.out.println("ID:" + message.getMessageId());
        System.out.println("Message:" + message.getMessage());
        
        ((AbstractApplicationContext) context).close();
        		
    }
}
