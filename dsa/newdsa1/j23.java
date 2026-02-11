public class j23 {
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5};
        int key = 4;
        int ans = goo(arr, key);
        System.out.println(ans);
    }
    static int goo(int[] arr,int key){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(key==arr[i]){
                return i;
            }
        }
        return -1;
    }
}
