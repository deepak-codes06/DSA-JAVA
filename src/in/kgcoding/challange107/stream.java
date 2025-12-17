package in.kgcoding.challange107;

import java.util.List;

public class stream {
    public static void main(String[] args) {
        List<String> str = List.of("Deepak" , "Kumar" , "learning java");
        str.stream()
                .forEach(a -> System.out.print(a));
    }
}
