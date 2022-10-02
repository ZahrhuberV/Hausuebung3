package com.beispiel4;

import java.util.stream.IntStream;

public class Beispiel4 {

    public static void main(String[] args) {
        final int result = IntStream.of(1,2,3,4,5,6,7,8,9,10).filter(n -> (n%2 != 0)).map(n -> n*n).reduce(0, Integer::sum);
        System.out.println(result);
    }
}
