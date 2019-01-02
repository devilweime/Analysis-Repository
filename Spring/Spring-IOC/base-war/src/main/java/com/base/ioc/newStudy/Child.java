package com.base.ioc.newStudy;

public class Child extends  Parent {


    private String lastName;

    @Override
    public String getSame() {
        return same;
    }

    @Override
    public void setSame(String same) {
        this.same = same;
    }

    private String same = "child";

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

        System.out.println("父子类相同字段:"+child.getSame());

        //转型
        Parent parent = (Parent)child;

        System.out.println("父子类相同字段:"+parent.getSame());

    }


}
