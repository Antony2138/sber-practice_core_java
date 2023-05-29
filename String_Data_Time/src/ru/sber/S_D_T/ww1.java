package ru.sber.S_D_T;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class ww1 {
    public static void main(String[] args) {
        String F = "Hello World";
        String[] stringarray = F.split("");

        Map<String , Long> map =  Arrays.stream(stringarray)
                .collect(Collectors.groupingBy(c -> c , Collectors.counting()));
        map.forEach( (k, v) -> System.out.println(k + " : "+ v)        );
    }
}