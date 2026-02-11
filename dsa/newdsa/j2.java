// import java.util.*;
// public class j2 {
//     public static void main(String[] args) {
//         int number = 1;
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=1; i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(number+" ");
//                 number++;
//             }
//             System.out.println();
//         }
        
//     }
// }
import java.util.*;
public class j2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = 1;
        int n = sc.nextInt();
        for(int i=1;i<=n; i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ") ;
                num++;
            }
         System.out.println();
        }
    }
}