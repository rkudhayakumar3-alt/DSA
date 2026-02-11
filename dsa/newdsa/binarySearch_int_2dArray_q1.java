import java.util.*;
public class binarySearch_int_2dArray_q1 {
    public static void main(String args[]){
        int[][] arr = {{10,20,30,40},
                      {15,25,35,45},
                      {28,29,37,49},
                      {33,34,38,50}};
             
        System.out.println(Arrays.toString(goo(arr,  29)));          

    }
    static int[] goo(int[][] arr,int target){
        int row =0;
        int col = arr[0].length-1;
        int[] fal = {-1,-1};
        while(row<arr.length && col>=0){

            if(arr[row][col]==target){
                return new int[] {row,col};
            }
            if(arr[row][col]<target){
                row++;
            }else {
                col--;
            }
        }
        return fal;
    }
}
