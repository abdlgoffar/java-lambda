package application.C_methodReference;

import helper.CheckUpperCase;

import java.util.function.Predicate;

public class MethodReference {
    //method reference adalah cara untuk lebih mempersingkat cara pembuatan lambda.
    public static void main(String[] args) {
        //menggunakan lambda biasa.
        Predicate<String> checkUpper =  (data) -> CheckUpperCase.check(data);
        System.out.println(checkUpper.test("ABDUL goffar")) ;//true
        System.out.println(checkUpper.test("abdul goffar")) ;//false


        //menggunakan lambda method reference.
        //syarat menggunakan lambda method reference, parameter method dan return method di lambda nya dan method referensinya harus sama.
        //contoh di bawah terdapat lambda yang mempunyai method referensi CheckUpperCase::check.
        Predicate<String> checkUpper1 = CheckUpperCase::check;
        System.out.println(checkUpper1.test("ABDUL goffar")) ;//true
        System.out.println(checkUpper1.test("abdul goffar")) ;//false

    }
}
