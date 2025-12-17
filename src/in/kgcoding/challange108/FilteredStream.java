package in.kgcoding.challange108;

import java.util.List;

public class FilteredStream {
    public static void main(String[] args) {
        List<String> list = List.of("Deepak are you" , "ek" , "learning java" ,"do", "through kg coding","teen");
        String result = list.stream()
                .filter(str -> str.length() > 10)
                .reduce("" , (a,b) -> a+b);
        System.out.println(result);

    }
}
