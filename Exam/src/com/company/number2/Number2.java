package com.company.number2;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



public class Number2 {
    ArrayList<Integer> even = new ArrayList<>();
    public int squareSum(int @NotNull ... p) {
        int evenSquareSum = 0;
        for(int i = 0; i < p.length; i++) {
            if(p[i]%2 == 0) {
                even.add(p[i]);
            }
        }
        List<Integer> evenSquare = even.stream()
                .map(x -> x*x)
                .collect(Collectors.toList());
        for(int i = 0; i < evenSquare.size(); i++) {
           evenSquareSum = evenSquareSum + evenSquare.get(i);
        }
        return evenSquareSum;
    }

}
