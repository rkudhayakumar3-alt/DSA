public class recursion2FIBO {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fibo(n));
    }
    static int fibo(int n){
        if(n<2){
            return n;
        }
        // System.out.print(fibo(n-1)+" "+fibo(n-2));
        // System.out.println();
        return fibo(n-1)+fibo(n-2);
    }
}
