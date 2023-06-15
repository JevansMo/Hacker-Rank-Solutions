package org.example;

import java.util.ArrayList;
import java.util.List;


class Result {

    /*
     * Complete the 'reverseArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static List<Integer> reverseArray(List<Integer> a) {
        // Write your code here
        List <Integer> result;
        result = new ArrayList<>();
        for (int i = 0; i < a.size(); i++)
            result.add(a.get(a.size() - (1+i)));
        return result;
    }

}
