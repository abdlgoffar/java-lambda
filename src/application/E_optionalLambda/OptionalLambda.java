package application.E_optionalLambda;

import java.util.Optional;

public class OptionalLambda {
    //optional lambda digunakan untuk menghindari error null pointer exception yang sering terjadi di program java,
    //caranya cukup convert object yang ingin dijadikan bisa null menjadi object Optional seperti contoh di bawah.
    //lihat contoh pembuatan optional di bawah.
    public static void main(String[] args) {
//       methodNotOptional(null);//error karena tidak di jadikan Optional.
//        methodOptional(null);//tidak error karena Optional.

        System.out.println(tryNumber(10L).get());
    }
    //method yang optional atau bisa null.
    public static void methodOptional(String name) {
        Optional<String> stringOptional = Optional.ofNullable(name);
        //method map() digunakan untuk memodifikasi object yang sudah dijadikan Optional nanti return nya Optioanl lagi seperti di bawah.
        Optional<String> stringOptional1 = stringOptional.map(data -> data.toUpperCase());
        //method ifPresent() digunakan untuk print out data di dalam oject optional apabila terdapat data di dalam nya.
        stringOptional1.ifPresent(data -> System.out.println(data));
    }
    //method yang tidak optional atau tidak bisa null.
    public static void methodNotOptional(String name) {
        System.out.println(name.toUpperCase());
    }
    public static  Optional<Long> tryNumber(Long data) {
        Optional<Long> longOptional = Optional.ofNullable(data);

       return longOptional;
    }
}
