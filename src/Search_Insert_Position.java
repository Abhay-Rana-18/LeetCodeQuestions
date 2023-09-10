public class Search_Insert_Position {
    static int searchInsert_pos(int [] arr, int target){

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
        return high+1;
    }

    public static void main(String[] args) {
        int [] arr = {0, 3, 8, 12, 23, 34, 48};
        int target = 1;
        int ans = searchInsert_pos(arr, target);
        System.out.println(ans);
    }
}
