package com.base.ioc;

import java.lang.reflect.Field;

public class ClassUtils {


    public  static  Object getField(Class<?> clazz,String name) throws NoSuchFieldException, IllegalAccessException, InstantiationException {

        Field field = clazz.getDeclaredField(name);
        field.setAccessible(true);
        Object instance = clazz.newInstance();

        return field.get(instance);
    }

    public  static  Object getField(Object object,String name) throws NoSuchFieldException, IllegalAccessException {
        Class<?> clazz = object.getClass();
        Field[] declaredFields = clazz.getDeclaredFields();
        Field field = clazz.getDeclaredField(name);
        field.setAccessible(true);
        return  field.get(object);
    }


    public  static <T>  T getField(Object object,String name,Class<T> clatt) throws NoSuchFieldException, IllegalAccessException, InstantiationException {
        Class<?> clazz = object.getClass();
        Field field = clazz.getDeclaredField(name);
        field.setAccessible(true);
        //T t = clatt.newInstance();
        return  (T) field.get(object);
    }


    public  static  Object getFieldValueOfParent(Object object,String name) throws NoSuchFieldException, IllegalAccessException {

        Field field = getFieldOfParent(object, name);
        field.setAccessible(true);
        return field.get(object);

    }

    public  static Field getFieldOfParent(Object object, String name) throws NoSuchFieldException {

        Class<?> clazz = object.getClass();
        for (;clazz != Object.class; clazz = clazz.getSuperclass()){
            try {
                return clazz.getDeclaredField(name);
            }catch (Exception e){
               //什么也不做保持循环
            }
        }
        return null;
    }



}
