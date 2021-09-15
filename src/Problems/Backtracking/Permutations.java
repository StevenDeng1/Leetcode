package Problems.Backtracking;

import org.jetbrains.annotations.NotNull;

public class Permutations {
    public static void printPermutations(@NotNull String str){
        int length = str.length()-1;
        permute(str,0 ,length);
    }

    private static void permute(String str, int left, int right){
        if(left == right) {
            System.out.println(str);
        }
        else {
            for(int i=left; i<=right; i++){
                str = swap(str,left,i);
                permute(str,left+1, right);
                str = swap(str,left, i);
            }
        }
    }

    private static String swap(String str, int i, int j){
        char [] strCharArray = str.toCharArray();
        char temp = strCharArray[i];
        strCharArray[i] = strCharArray[j];
        strCharArray[j] = temp;
        return String.valueOf(strCharArray);

    }
}
