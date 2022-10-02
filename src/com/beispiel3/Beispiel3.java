package com.beispiel3;

import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class Beispiel3 {

    public static void main(String[] args) {
        final Predicate<Integer> isEven = (n) -> (n%2 == 0);
        final IntPredicate isPositive = (n) -> (n > 0);

        Scanner s = new Scanner(System.in);
        int input = 0;
        do {
            System.out.println("Gib eine Zahl ein");
            System.out.println("1: Beenden");
            input = s.nextInt();
            if(isEven.test(input)){
                System.out.println("Ist Gerade");
            } else System.out.println("ist nicht gerade");
            if(isPositive.test(input)){
                System.out.println("Ist Positiv");
            } else System.out.println("ist nicht positiv");

            System.out.println("Beides gemeinsam getestet: ");
            if(isEven.and(n -> n>0).test(input)){
                System.out.println("Gerade und positiv");
            } else System.out.println("ist nicht gerade und negativ");

            System.out.println("Negate benutzt:");
            if(!(isEven.negate().test(input))){
                System.out.println("Ungerade und negativ");
            } else System.out.println("gerade und positiv");
        }while(input!=1);
    }
}
