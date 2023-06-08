package application.B_interfaceHelperLambda;

import java.util.function.Function;
import java.util.function.Supplier;

public class SupplierInterfaceHelper {
    //supplier adalah Interface helper untuk membuat lambda dengan satu parameter generic untuk return value nya.
    //lihat contoh dibawah.
    public static void main(String[] args) {
        //membuat lambda manual.
        Supplier<String> person = new Supplier<String>() {
            @Override
            public String get() {
                return "goffar";
            }
        };
        System.out.println(person.get());

        //membuat lambda dengan kurung kurawal.
        Supplier<String> person1 = () -> {
            return "goffar";
        };
        System.out.println(person1.get());

        //membuat lambda tanpa kurung kurawal.
        Supplier<String> person2 = () -> "goffar";
        System.out.println(person2.get());
    }


}
