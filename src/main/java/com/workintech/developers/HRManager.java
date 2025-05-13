package com.workintech.developers;

public class HRManager extends Employee {
    private String JuniorDeveloper[];
    private String MidDeveloper[];
    private String SeniorDeveloper[];


    public HRManager(long id, String name, double salary){
        super(id, name, salary);
    }

    public void addEmployee(){

    }



    @Override
    public void setSalary(double salary) {
        super.setSalary(salary);
    }

    @Override
    public void work(){
        System.out.println("HRManager starts to working");
    }
}
