public class j30 {
    public static void main(String args[]){
        int max = Integer.MIN_VALUE;
        int[][] arr ={{1,2,3},
                       {2,2,2},
                       {4,5,6}};
    System.out.println(goo(arr, max));
    }
    static int goo(int[][] arr, int max){
        int index =0;
         for(int i=0; i<arr.length;i++){
            int count = 0;
            for(int j=0; j<arr[i].length;j++){
                 count = count + arr[i][j];
                 //  return count;
                }
                System.out.println("tot array of "+i+" is  "+count);
            if(count>max){
                max = count;
                index =i;
            }
            
        }
        System.out.print(  "in the index of  "+ index+" the maximum is ");
        return max;

    }
}
