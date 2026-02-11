public class bitwise2A {
    public static void main(String[] args) {
         int a = 20;
        int n = 3;
        System.out.println(ibit(a,n));
    }
    static int ibit(int a , int b){
        
        return a & (1<<(b-1) ) ;
    }
}
