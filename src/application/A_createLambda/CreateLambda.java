package application.A_createLambda;

import data.Person;

public class CreateLambda {
    //cohtoh cara pembuatan lambda.
    //lambda berasal dari sebuah Interface.
    //lihat package data, Interface Person.
    public static void main(String[] args) {
        //membuat lambda manual.
        Person person = new Person() {
            @Override
            public String name(String name) {
                return name;
            }
        };
        System.out.println(person);

        //membuat lambda dengan kurung kurawal.
        Person person1 = (name) -> {
            return name;
        };
        System.out.println(person1.name("abdul goffar"));

        //membuat lambda tanpa kurung kurawal, cara ini yang paling sering digunakan.
        Person person2 = (name) -> name;
    }
}
