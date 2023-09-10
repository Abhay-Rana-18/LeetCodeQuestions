import java.util.Arrays;
public class first_last_repeated {
    static int [] repeated(int [] arr, int target){
        int i, j;
        int start = 0;
        int end = arr.length - 1;
        int mid;
        while (start<=end){
            mid = start + (end-start)/2;
            if (target<arr[mid]){
                end = mid - 1;
            }
            else if (target>arr[mid]){
                start = mid + 1;
            }
            else{
                i = mid;
                j = mid;
                for (int m=i; arr[m]==target; m++){
                    j++;
                }
                for (int m=i; arr[m]==target; m--){
                    i--;
                }
                return new int[]{i+1, j-1};
            }
        }

        return new int []{-1, -1};
    }
    public static void main(String[] args) {
        int []arr = {5, 7, 7, 8, 8, 8, 10};
        int target = 8;
        int [] ans = repeated(arr, target);
        System.out.println(Arrays.toString(ans));
    }
}
