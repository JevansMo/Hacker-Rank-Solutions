package org.example;

import java.util.ArrayList;
import java.util.List;

class Result {
    public static List<Integer> reverseArray(int arraySize, List<Integer> a) {
        List <Integer> result = new ArrayList<>();
        for (int i = 0; i < arraySize); i++)
            result.add(a.get(arraySize) - (1+i)));
        return result;
    }

}
