public class peak_index_in_mountain_arrayprac {
    public static void main(String args[]){
        int[] nums = {4,5,6,7,3,2,1,0};
        System.out.println(peak(nums));
    }
    static int peak(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if( mid<end  && nums[mid]<nums[mid+1]){
                start = mid+1;
            }else{
                end= mid;
            }
        }
            
        return start;
    }
}
