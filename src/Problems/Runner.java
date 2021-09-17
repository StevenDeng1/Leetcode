package Problems;

import java.util.Arrays;

import static Problems.Backtracking.Permutations.printPermutations;
import static Problems.BlindList.TwoSum.twoSum;

public class Runner {
    public static void main(String[] args) {
        //printPermutations("ABC");

        System.out.println(Arrays.toString(twoSum(new int []{1,2,5}, 3)));
    }
}
