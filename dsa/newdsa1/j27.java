import java.util.*;
public class j27 {
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        System.out.print("rows:");
        int rows= sc.nextInt();
        System.out.print("cols:");
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        System.out.print("target");
        int target = sc.nextInt();
        // System.out.println(goo(arr, rows, cols,target));
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(goo(arr, rows, cols, target,sc)));
    }
    static int[] goo(int[][] arr, int rows, int cols,int target,Scanner sc){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]  = sc.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    // System.out.println("found"+"["+i+" "+j+"]");
                    return new int[] {i,j};

                }
            }
        }
        return new int[] {-1,-1};
        
    }
}
