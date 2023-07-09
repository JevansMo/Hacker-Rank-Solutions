import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


class Result {

    /*
     * Complete the 'hourglassSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */


    public static int hourglassSum(List<List<Integer>> arr) {
        // Write your code here
        int greatestHourglassSum = 0;
        greatestHourglassSum = arr.get(0).get(0) + arr.get(0).get(1) + arr.get(0).get(2);
        greatestHourglassSum += arr.get(1).get(1);
        greatestHourglassSum += arr.get(2).get(0) + arr.get(2).get(1) + arr.get(2).get(2);
        for (int i = 0; i < 4; i++) {
            List <Integer> currentTopRow = arr.get(i);
            List <Integer> secondRow = arr.get(i+1);
            List <Integer> thirdRow = arr.get(i+2);
            for (int j = 0; j < 4; j++) {
                int currentHourglassSum = 0;
                currentHourglassSum += currentTopRow.get(j) + currentTopRow.get(j+1) + currentTopRow.get(j+2);
                currentHourglassSum += secondRow.get(j+1);
                currentHourglassSum += thirdRow.get(j) + thirdRow.get(j+1) + thirdRow.get(j+2);
                if (currentHourglassSum > greatestHourglassSum)
                    greatestHourglassSum = currentHourglassSum;
            }
        }
        return greatestHourglassSum;
    }
}
