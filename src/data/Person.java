package data;

//syarat membuat Interface lambda
//1. Interfece yang ingin dijadikan lambda harus diberi annotation @FunctionalInterface.
//2. Interfece yang ingin dijadikan lambda maksimal mempunyai i method abstract.
@FunctionalInterface
public interface Person {
    abstract public String name(String name);
}
