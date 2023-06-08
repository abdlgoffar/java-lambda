package application.B_interfaceHelperLambda;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateInterfaceHelper {
    //predicate adalah Interface helper untuk membuat lambda dengan satu parameter generic untuk method parameter nya,
    //dan return value nya boolean.
    //lihat contoh dibawah.
    public static void main(String[] args) {
        //membuat lambda manual.
        Predicate<Integer> check = new Predicate<Integer>() {
            @Override
            public boolean test(Integer number) {
                if (number > 10) return true;
                return false;
            }
        };
        System.out.println(check.test(15));

        //membuat lambda dengan kurung kurawal.
        Predicate<Integer> check1 = (number) -> {
            if (number > 10) return true;
            return false;
        };
        System.out.println(check1.test(5));

        //membuat lambda tanpa kurung kurawal.
        Predicate<Integer> check2 = (number) -> number > 10;
        System.out.println(check1.test(5));
    }
}
