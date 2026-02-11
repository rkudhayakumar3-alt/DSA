public class recursion3 {
    public static void main(String args[]){
        int n = 5;
        p1rev(n);
    } 
    static void p1rev(int n ){
        if(n==0){
            return ;
        }
         p1rev(n-1);
        System.out.println(n);
    }
}
