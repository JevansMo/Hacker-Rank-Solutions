import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Result {

    /*
     * Complete the 'arrayManipulation' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY queries
     */

    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        // Write your code here
        List <Integer> manipulatedArray = IntStream.range(0, n).mapToObj(i -> 0).collect(Collectors.toList());
        int largestNum = manipulatedArray.get(0);
        for (List <Integer> query : queries) {
            if (!query.equals(queries.get(0))) {
                int a = query.get(0) - 1;
                int b = query.get(1);
                int k = query.get(2);
                for (int i = a; i < b; i++) {
                    int currentNum = manipulatedArray.get(i) + k;
                    if (currentNum > largestNum)
                        largestNum = currentNum;
                    manipulatedArray.set(i, currentNum);
                }
            }
        }
        return largestNum;
    }

}
