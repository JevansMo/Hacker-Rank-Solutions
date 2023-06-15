package org.example;

import java.util.ArrayList;
import java.util.List;

class Result {
    public static List<Integer> reverseArray(List<Integer> a) {
        List <Integer> result;
        result = new ArrayList<>();
        for (int i = 0; i < a.size(); i++)
            result.add(a.get(a.size() - (1+i)));
        return result;
    }

}
