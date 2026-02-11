public class j39partA {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,4,4,5,6};
        int target = 4;
        int left = leftBound(arr, target);
        int right = rightBound(arr, target);
        System.out.println("(" +left+" "+right+ ")");
    }
    static int leftBound(int[] arr, int target){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                ans = mid;
                end=mid-1;
            }else if(arr[mid]<target){
                start = mid +1;
            }else{
                end=mid-1;
            }

        }
        return ans;
    }
    static int rightBound(int[] arr, int target){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                ans = mid;
                start=mid+1;
            }else if(arr[mid]<target){
                start = mid +1;
            }else{
                end=mid-1;
            }

        }
        return ans;
    }

}
