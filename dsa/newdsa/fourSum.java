import java.util.*;
public class fourSum {
    public static void main(String[] args) {
        int[] arr = {1,0,-1,0,-2,2};
        int target = 0;
        System.out.println(foursum(arr, target));

    }
    static List<List<Integer>> foursum(int[] nums,int target){
        Set<List<Integer>> basket = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++){
            
            for(int j=i+1;j<nums.length-2; j++){
                int f = j+1;
                
                int l = nums.length-1;
                while(f<l){
                    int sum = nums[i]+nums[j]+nums[f]+nums[l];
                    if(sum==target){
                        basket.add(Arrays.asList(nums[i],nums[j],nums[f],nums[l]));
                    }
                    if(sum<target){
                        f++;
                    }else{
                        l--;
                    }
                    
                }
                
            }
        }
            return new ArrayList<>(basket);
    }
}
