import java.util.*;
import java.math.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Arrays;
import java.lang.Math;

class Result {

    /*
     * Complete the 'dynamicArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY queries
     */
    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        // Write your code here
        int lastAnswer = 0;
        n = queries.get(0).get(0);
        List<List<Integer>> queryAnswers = new ArrayList<>();
        List<Integer> answers = new ArrayList<>();
        for (int i = 0; i < n; i++)
            queryAnswers.add(new ArrayList<Integer>());
        for (List<Integer> query : queries) {
            if (!query.equals(queries.get(0))) {
                int x = query.get(1);
                int y = query.get(2);
                int idx = (x ^ lastAnswer) % n;
                if (query.get(0) == 1)
                    queryAnswers.get(idx).add(y);
                if (query.get(0) == 2) {
                    lastAnswer = queryAnswers.get(idx).get(y % (queryAnswers.get(idx).size()));
                    System.out.println(lastAnswer);
                    answers.add(lastAnswer);
                }
            }
        }
        return answers;
    }
}
