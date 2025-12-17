package in.kgcoding.challange106;

import java.util.List;
import java.util.function.BinaryOperator;

public class LambdaMultiplication {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5);
          BinaryOperator<Integer> multi = (a,b) -> a * b;
//        int ans = multi.apply(2,3);
//        System.out.println(ans);
        int ans = list.stream()
                .reduce(1,multi);
        System.out.println(ans);



    }
}
