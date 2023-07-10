import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'matchingStrings' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY stringList
     *  2. STRING_ARRAY queries
     */

    public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
        // Write your code here
        List <Integer> result = new ArrayList<>();
        for (String query : queries) {
            int matchingInstances = 0;
            for (String string : stringList) {
                if (string.equals(query))
                    matchingInstances += 1;
            }
            result.add(matchingInstances);
        }
        return result;
    }

}
