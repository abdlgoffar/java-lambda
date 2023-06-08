package application.D_lazyParameterLambda;

import java.util.function.Supplier;

public class LazyParameterLambda {
    //lazy parameter adalah parameter yang hanya akan dibuat atau dieksekusi jika parameter itu terpakai oleh method nya.
    public static void main(String[] args) {
        //contoh method yang parameternya tidak lazy, dimana parameter name nya tetap dibuat atau dieksekusi meski parameter name
        //itu tidak terpakai.
        methodNotLazyParameter(20, name("goffar"));


        //contoh method yang parameternya lazy, dimana parameter name nya tidak akan dibuat atau dieksekusi, apabila parameter name
        //itu tidak terpakai.
        //untuk membuat method yang parameternya lazy cukup jadikan parameter nya Lambda Supplier Interface, seperti contoh di bawah.
        methodLazyParameter(19, () -> name("goffar"));
    }
    public static void methodLazyParameter(Integer score, Supplier<String> name) {
        if (score > 55) {
            System.out.println("score: " + score + " anda lulus " + name.get() );
        } else {
            System.out.println("score: " + score + " anda tidak lulus ");
        }
    }

    public static void methodNotLazyParameter(Integer score, String name) {
        if (score > 55) {
            System.out.println("score: " + score + " anda lulus " + name );
        } else {
            System.out.println("score: " + score + " anda tidak lulus ");
        }
    }
    public static String name(String name) {
        System.out.println("ANDA BUKAN METHOD LAZY PARAMETER");
        return name;
    }
}
