package com.beispiel3;

import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class Beispiel3 {

    public static void main(String[] args) {
        final Predicate<Integer> isEven = (n) -> (n%2 == 0);
        final IntPredicate isPositive = (n) -> (n > 0);
        final Predicate<Integer> isZero = (n) -> (n == 0);
        final Predicate<Integer> isNull = n -> (n == null);

        final Predicate<String> isShortWord = n -> (n.length() < 4);

        System.out.println("Gerade?");
        System.out.println(isEven.test(11));
        System.out.println(isEven.test(10));
        System.out.println("Positive?");
        System.out.println(isPositive.test(-10));
        System.out.println(isPositive.test(10));
        System.out.println("0?");
        System.out.println(isZero.test(0));
        System.out.println(isZero.test(10));
        System.out.println("Null?");
        System.out.println(isNull.test(null));
        System.out.println(isNull.test(0));
        System.out.println("<4 buchstaben");
        System.out.println(isShortWord.test("Valentin"));
        System.out.println(isShortWord.test("Zah"));
        System.out.println("mit and Methode");
        System.out.println(isEven.and(n -> n > 0).test(10));
        System.out.println(isEven.and(n -> n > 0).test(11));
        System.out.println(isEven.and(n -> n > 0).test(-10));
        System.out.println("mit methode negate");
        System.out.println(isEven.negate().test(11));
        System.out.println(isEven.negate().test(10));

    }
}
