package com.base.ioc.test;

import com.base.ioc.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCTest04 {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, InstantiationException {

        /***
         *org.springframework.context.support.AbstractApplicationContext#finishBeanFactoryInitialization(org.springframework.beans.factory.config.ConfigurableListableBeanFactory)
         *
         * org.springframework.beans.factory.support.DefaultListableBeanFactory#preInstantiateSingletons()
         *    ---方法内if (!bd.isAbstract() && bd.isSingleton() && !bd.isLazyInit())、判断是否是懒加载
         *
         */
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/ioc-spring-lazy-init.xml");
        Person person = (Person) ctx.getBean("person");
        System.out.println("取出的bean"+person);
    }
}
