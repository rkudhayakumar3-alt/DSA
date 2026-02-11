// import java.util.*;
// public class j3 {
//     public  static void main(String args[]) {
//         int n = 3;
//         int num = 1;
        
//         for(int i=n;i>=1;i--){
//             // for(int j=1;j<=(n-i);j++){
//             //     System.out.print(" ");
//             // }
        
//             for(int j=1;j<=i;j++){
//                 System.out.print(num+" ");
//                 num++;
//             }
//             System.out.println();
//         }
//     }
// }
import java.util.*;
public class j3{
    public static void main(String args[]){
        int row = 3;
        int num = 1;
        for(int i=row;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(num+ " ");
                num++;
            }
            System.out.println();
        }
    }
}