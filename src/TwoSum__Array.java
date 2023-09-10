import java.util.Arrays;
public class TwoSum__Array {
    public static int[] twoSum(int[] nums, int target) {
        for (int i=0; i<nums.length; i++){
            for (int j=0; j<nums.length; j++){

                if(nums[i] + nums[j] == target && i!=j){

                    return new int[] {i, j};
                }
            }
        }
        return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        int [] arr = {23, 2, 12, 9, 7};
        int target = 9;
        int [] sol = twoSum(arr, target);
        System.out.println(Arrays.toString(sol));
    }
}
