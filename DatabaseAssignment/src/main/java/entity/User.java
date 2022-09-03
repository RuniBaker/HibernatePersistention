package entity;

import java.io.Serializable;

public class User extends ActiveUser implements Serializable {
    private int id;
    private String name;
    private String last_name;
    private int age;
    private String adress;
    private double income;


    public User() {

    }

    public User(int id, String name, String last_name, int age, String adress, double income) {
        this.id = id;
        this.name = name;
        this.last_name = last_name;
        this.age = age;
        this.adress = adress;
        this.income = income;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    @Override
    public String toString() {
        return "id=" + id + "\n" +
                ", name='" + name + "\n" +
                ", last_name='" + last_name + "\n" +
                ", age=" + age + "\n" +
                ", adress='" + adress + "\n" +
                ", income=" + income + "\n" + "\n\n";
    }
}
