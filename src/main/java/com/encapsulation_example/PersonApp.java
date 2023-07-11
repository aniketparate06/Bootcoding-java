package com.encapsulation_example;

import java.util.Scanner;

public class PersonApp {
    public static void main(String[] args)  {
        Scanner scanner=new Scanner(System.in);
        Person[] person=new Person[2];
        for (int i = 0; i < person.length; i++) {
            person[i]=new Person();
        }
        for (int i = 0; i < person.length ; i++) {
            System.out.println("Enter name and age");
            String name=scanner.nextLine();
            int age=Integer.parseInt(scanner.nextLine());
            person[i].setName(name);
            person[i].setAge(age);
         }
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].getName());
            System.out.println(person[i].getAge());
        }

//        Person person1=new Person();

//        person.setAge(20);
//        person.setName("lalit");
//        person1.setAge(19);
//        person1.setName("lal");
//        System.out.println(person);
//        System.out.println(person1);


    }
}
