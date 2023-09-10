public class element_in_infinite_array {
    static int infinte(int [] arr, int target){
        int start = 0;
        int end = 5;
        int mid;

        while (target>arr[end]){
            start = end + 1;
            end = end + 5;
        }
        System.out.println(end);


        while (start<=end){
            mid = start + (end - start)/2;
            if (target<mid){
                end = mid - 1;
            }
            else if(target > mid){
                start = mid + 1;
            }
            else{
                return mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 20, 29};
        int target = 12;
        int index = infinte(arr, target);
        System.out.println(index);
    }
}
