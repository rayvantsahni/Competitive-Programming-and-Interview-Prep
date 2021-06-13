import java.util.*;

class Main
{
    public static boolean twoSum(int[] arr, int k) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            int required = k - arr[i];
            if (set.contains(required))
                return true;
            set.add(arr[i]);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {10, 15, 3, 7};
        int target = 17;
        System.out.println(twoSum(arr, target));
    }
}
