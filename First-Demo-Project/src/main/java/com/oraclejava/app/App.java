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
        
        message.setMessageId(1002);
        message.setMessage("어벤져스");
        
        System.out.println(message.getMessageId() + "\t" + message.getMessage());
        
        Message message1 = context.getBean("message", Message.class);
        
        System.out.println(message1.getMessageId() + "\t" + message1.getMessage());
        
        ((AbstractApplicationContext) context).close();
        		
    }
}
