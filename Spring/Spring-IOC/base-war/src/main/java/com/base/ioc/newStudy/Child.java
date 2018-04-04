package com.base.ioc.newStudy;

public class Child extends  Parent {


    private String lastName;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static void main(String[] args) {

        /**
         * 子类使用父类的属性
         */

        Child child = new Child();
        child.setFirstName("吴");
        child.setLastName("光炜");
        System.out.println("fullname:"+child.getFirstName()+child.getLastName());
    }


}
