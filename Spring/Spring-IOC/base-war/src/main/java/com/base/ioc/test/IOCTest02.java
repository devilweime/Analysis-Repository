package com.base.ioc.test;


import com.base.ioc.bean.Person;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class IOCTest02 {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, InstantiationException {


        /**
         * 下面的代码描述了IOC初始化及构造的调用
         */
        ClassPathResource classPathResource = new ClassPathResource("spring/ioc-spring.xml");
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(classPathResource);

        Person person = (Person) factory.getBean("person");
        System.out.println(person);
    }
}
