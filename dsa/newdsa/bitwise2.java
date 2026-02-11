public class bitwise2 {
    public static void main(string args[]){
        int a = 17;
        int n = 3;
        System.out.println(ibit(a,n));
    }
    static int ibit(int a , int b){
        
        return a & 1<<(b-1)  ;
    }
}
