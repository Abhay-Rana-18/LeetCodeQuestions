import java.util.ArrayList;
import java.util.HashSet;

public class removeDuplicate__Array {
    static ArrayList<Integer> unique(int[] arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(arr[i])) {
                set.add(arr[i]);
                arrayList.add(arr[i]);
            }
        }

        return arrayList;
    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        ArrayList<Integer> arr2 = unique(arr);
        System.out.println(arr2); // Prints [0, 1, 2, 3, 4]
    }
}
