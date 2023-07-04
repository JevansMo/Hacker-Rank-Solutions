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

    public static int currentSum(List<Integer> nums) {
        Integer sum = 0;
        for (Integer num : nums)
            sum += num;
        return sum;
    }


    public static int hourglassSum(List<List<Integer>> arr) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i < 3 ; i++) {
            List <Integer> tempList = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                tempList.add(j);
                tempList.add(arr.get(i+2).get(j));
                if (j == 1)
                   tempList.add(arr.get(i+1).get(j));
            }
            sum += currentSum(tempList);
        }
        return sum;
    }
}
