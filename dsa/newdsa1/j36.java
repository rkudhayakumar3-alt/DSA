public class j36 {
    public static void main(String args[]){
        int[] arr = {2,4,5,6,8};
        int target = 7;
        System.out.println(goo(arr,target));
    }
    static int goo(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target==arr[mid]){
                return arr[mid];
            }else if(target<arr[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        // if(start < arr.length){
        //     System.out.println((start+end)/2.0);
        //     int a = (arr[start] +arr[end])/2;
        //     return a;
        // }else{
        //     return -1;
        // }
        return arr[start];
    }
}
