package com.horstmann.corejava;

import java.time.LocalDate;
import java.util.Random;

/**
 * @Author: zhanghan
 * @Date: 2020/4/5 16:09
 * @Description:
 */
public class Employee {

    private String name;
    private double salary;
    private LocalDate hireDay;


    /**
      * three overloaded construtors
      * @author zhanghan
      * @createTime 2020-04-09 20:21:45
     * @param null
      * @return 
      * @throws ManagerException
    **/


    public Employee(String name,double salary,int year,int month,int day){
        this.name = name;
        this.salary = salary;
        hireDay = LocalDate.of(year,month,day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent){
        double raise = salary * byPercent /100;
        salary += raise;
    }
}
