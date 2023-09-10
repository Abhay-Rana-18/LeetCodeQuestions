public class Ceiling_binarySearch {
    public static int CeilingBinary(int []arr, int target){
        //return equal to or smallest larger number[index].
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
//                if(target<arr[low]){
//                    return low;
//                }
            }
            else {
                high = mid -1;
//                if (target>arr[high]){
//                    return mid;
//                }
            }

        }
        return low;
    }

    public static void main(String[] args) {
        int [] arr = {0, 3, 8, 12, 23, 34, 48};
        int target = 19;
         int ans = CeilingBinary(arr, target);
        System.out.println(ans);
    }
}
