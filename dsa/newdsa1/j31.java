import java.util.*;
public class j31 {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 22;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    static int[] twoSum(int[] nums, int target){
          for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                  if(nums[i]+nums[j]==target){
                    System.out.println("the index is ");
                    return new int[] {i,j};
                  }
            }
        }
        return new int[] {-1,-1};
    }
}
