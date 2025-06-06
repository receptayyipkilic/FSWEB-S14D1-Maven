package com.workintech.developers;

public class SeniorDeveloper extends Employee {



    public SeniorDeveloper(long id, String name, double salary){
        super(id, name, salary);
    }

    @Override
    public void setSalary(double salary) {
        super.setSalary(salary);
    }

    @Override
    public void work(){
        System.out.println("SeniorDeveloper starts to working");
    }
}
