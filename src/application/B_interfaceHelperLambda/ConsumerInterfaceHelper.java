package application.B_interfaceHelperLambda;

import java.util.function.Consumer;

public class ConsumerInterfaceHelper {
    //consumer adalah Interface helper untuk membuat lambda dengan satu parameter generic untuk method parameter nya,
    //dan return value nya void.
    //lihat contoh dibawah.
    public static void main(String[] args) {
        //membuat lambda manual.
        Consumer<String> person = new Consumer<String>() {
            @Override
            public void accept(String name) {
                System.out.println(name);
            }
        };
        person.accept("abdul goffar");

        //membuat lambda dengan kurung kurawal.
        Consumer<String> person1 = (name) -> {
            System.out.println(name);
        };
        person1.accept("abdul goffar");

        //membuat lambda tanpa kurung kurawal.
        Consumer<String> person2 = (name) -> System.out.println(name);
        person2.accept("abdul goffar");
    }
}
