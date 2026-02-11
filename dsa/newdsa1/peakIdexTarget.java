public class peakIdexTarget {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 6, 7, 2, 1, 0 };
        int target = 2;
        System.out.println(search(arr, target));
    }
    static int search(int[] arr , int target){
        int peak = peak(arr);
        if(arr[peak] == target){
            return peak;
        }
       
        int left = orderAgnosticBS(arr, target, 0, peak-1);
        if(left!=-1){
            return left;
        }
        return orderAgnosticBS(arr, target, peak+1,arr.length-1);
        
        
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end) {
                                                                                                //BIOTOMIC ARRAY
        boolean asc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (asc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    static int peak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return start;
    }
}
