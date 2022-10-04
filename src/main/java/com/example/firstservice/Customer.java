package com.example.firstservice;

public class Customer {
    private String ID;
    private String name;
    private boolean sex;
    private int age;

    Customer(){
        this("", null, "female", 0);
    }
    Customer(String ID, String n, String s, int a){
        if(s.equals("Male") || s.equals("male")){
            this.sex = true;
        }
        else if (s.equals("Female") || s.equals("female")){
            this.sex = false;
        }
        this.ID = ID;
        this.name = n;
    }

    public void setAge(int age) {
        if (age < 0){
            this.age = 0;
        }
        else{
            this.age = age;
        }
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getID(){
        return ID;
    }

    public boolean getSex(){
        return sex;
    }

}
