package com.company;

import java.util.Arrays;

public class Main {

    private static Person person;

    public static void main(String[] args) {

        int a = 33;
        changeValue(a);
        System.out.println(a);

        Integer b = 33;
        changeValue(b);
        System.out.println(b);
        Integer[] values = new Integer[]{3, 4};
        changeValue(values);
        System.out.println(Arrays.toString(values));
        changeValueOfFirst(values);
        System.out.println(Arrays.toString(values));

        Person person = new Person("Anton"," Semechkov");
        changePerson(person);
        System.out.println(person.name + person.surname);

        changePersonByFields(person);
        System.out.println(person.name + person.surname);
    }

    private static void changeValue(int value) {
        value = 22;
    }

    private static void changeValue(Integer value) {
        value = 22;
    }
    private static void changeValue(Integer[] values) {values = new Integer[] {1,2};}

    private static void changeValueOfFirst(Integer[] values) {values[0]= 99;}

    private static void changePerson(Person person){
        new Person("Ilya", " Lagutenko");
    }

    private static void changePersonByFields(Person person) {
        person.name = "Ilya";
        person.surname = " Lagutenko";
    }
    public static class Person {
        String name;
        String surname;

        public Person(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        public String getName() {return this.name;
        }
        public String getSurname() {return this.surname;
        }
    }
}
