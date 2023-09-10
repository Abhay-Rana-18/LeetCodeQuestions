public class Peak_Index {
    static int peek(int []arr){
        int start = 0;
        int end = arr.length - 1;
        int mid;

        while(start<=end){
            mid = start + (end-start)/2;
            if (mid == 0){
                return mid;
            }
            else if(arr[mid-1]>arr[mid]){
                end = mid - 1;
            } else if(arr[mid+1] > arr[mid]){
                start = mid + 1;
            } else{
                return mid;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int [] arr = new int[] {10, 7, 6, 4, 3, 2, 1};
        int index = peek(arr);
        System.out.println(index);
    }
}
