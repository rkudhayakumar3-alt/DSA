public class findOutPowerOf2 {
    public static void main(String args[]){
        int n = 5;
        int b = 2;
        int a = 1<<(n-1);
        int ans = (int)(Math.log(a)/Math.log(b));
        System.out.println(ans);
    }

}
