public class FloorNum_BinarySearch {
    public static int FloorBinary(int []arr, int target){
        //return equal to or greatest smaller number[index].
        int low = 0;
        int high = arr.length - 1;
        int mid;
        while (low<=high){
            mid = low + (high-low)/2;
            if (arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                low = mid + 1;
            }
            else {
                high = mid -1;
            }

        }
        return high;
    }

    public static void main(String[] args) {
        int [] arr = {0, 3, 8, 12, 23, 34, 48};
        int target = 47;
        int ans = FloorBinary(arr, target);
        System.out.println(ans);
    }
}
