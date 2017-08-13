package com.hjt.testng;

/**
 * Created by hua on 2017/8/13.
 */
public class TesOne {
    public static void main(String[] args) throws Exception {
        Person person = new Person();

        System.out.println(person);
        Person person1 = (Person) Class.forName("com.hjt.testng.Person").newInstance();
        System.out.println(person1);

    }
}
class Person{
    private String name;
    private Integer age ;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
