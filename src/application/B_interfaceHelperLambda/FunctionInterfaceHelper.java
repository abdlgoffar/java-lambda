package application.B_interfaceHelperLambda;

import java.util.List;
import java.util.function.Function;

public class FunctionInterfaceHelper {
    //function adalah Interface helper untuk membuat lambda dengan dua parameter generic, parameter pertama untuk method parameter nya,
    //dan parameter kedua untuk return value nya.
    //lihat contoh dibawah.
 
    public static void main(String[] args) {
        //membuat lambda manual.
        Function<Integer, Integer> amount = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer number) {
                return number;
            }
        };
        System.out.println(amount.apply(1000));

        //membuat lambda dengan kurung kurawal.
        Function<Integer, Integer> amount1 = (number) -> {
            return number;
        };
        System.out.println(amount1.apply(2000));

        //membuat lambda tanpa kurung kurawal.
        Function<Integer, Integer> amount2 = (number) ->  number;
        System.out.println(amount2.apply(3000));


    }
}
