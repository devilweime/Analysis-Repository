package com.base.ioc.test;

import com.base.ioc.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCTest03 {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, InstantiationException {

        /***
         * 使用idea一步步debug，发现他们的关系
         */
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/ioc-spring.xml");
        Person person = (Person) ctx.getBean("person");
        System.out.println("取出的bean" + person);


        /**
         *ApplicationContext的关闭和销毁
         */
       // ((ClassPathXmlApplicationContext) ctx).close();
       // ((ClassPathXmlApplicationContext) ctx).destroy();
    }
}
