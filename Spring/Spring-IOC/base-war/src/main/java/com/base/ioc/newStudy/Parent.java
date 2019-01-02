package com.base.ioc.newStudy;

public class Parent {

    private String firstName;

    private String same = "parent";

    public String getSame() {
        return same;
    }

    public void setSame(String same) {
        this.same = same;
    }

    public Parent() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

}
