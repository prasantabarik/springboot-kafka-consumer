package com.tcs.example.springbootKafkaConsumer.model;

public class Employee {

    private Double id;
    private String name;
    private String dept;

    public Employee(Double id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    public Double getId() {
        return id;
    }

    public void setId(Double id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
