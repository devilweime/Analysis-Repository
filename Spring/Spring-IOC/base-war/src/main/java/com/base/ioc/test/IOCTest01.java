package com.base.ioc.test;

import com.base.ioc.ClassUtils;
import com.base.ioc.bean.Person;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.beans.factory.support.AbstractBeanFactory;

import java.util.Map;

public class IOCTest01 {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, InstantiationException {

        /***
         * 使用idea一步步debug，发现他们的关系
         */
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/ioc-spring.xml");
        Person person = (Person) ctx.getBean("person");

        ConfigurableListableBeanFactory beanFactory = ((ClassPathXmlApplicationContext) ctx).getBeanFactory();//得到org.springframework.beans.factory.support.DefaultListableBeanFactory
        Person person2 = (Person) beanFactory.getBean("person");//得到org.springframework.beans.factory.support.AbstractBeanFactory#getBean(java.lang.String)

        AbstractBeanFactory abstractBeanFactory =  (AbstractBeanFactory)beanFactory;
        BeanDefinition beanDefinition = abstractBeanFactory.getMergedBeanDefinition("person");//获得bean定义信息
        System.out.println("bean的定义信息"+beanDefinition);

        //abstractBeanFactory.mergedBeanDefinitions;// 存放name和BeanDefinition的map
        Map<String,BeanDefinition> mergedBeanDefinitions =(Map<String,BeanDefinition>) ClassUtils.getFieldValueOfParent(abstractBeanFactory, "mergedBeanDefinitions");
        System.out.println("mergedBeanDefinitions:"+mergedBeanDefinitions);




        System.out.println("取出的bean"+person2);
    }
}
