package helper;

public class CheckUpperCase {
    //algorithm mengetahui terdapat huruf besar pada kalimat.
    public static boolean check(String data) {
        char[] dataConvert = data.toCharArray();
        for (char i : dataConvert) {
            if (Character.isUpperCase(i)) return true;
        }
        return false;
    }
}
