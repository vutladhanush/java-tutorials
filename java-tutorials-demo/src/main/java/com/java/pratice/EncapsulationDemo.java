package com.java.pratice;

class Student{
    private String name;
    private String phoneNo;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString()
    {
        return  "name=" + name + ", phoneNo=" + phoneNo + ", email=" + email ;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Dhanush Vutla");
        s1.setPhoneNo("6938527410");
        System.out.println(s1);

    }
}
