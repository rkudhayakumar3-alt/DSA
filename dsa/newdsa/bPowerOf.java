public class bPowerOf{
    public static void main(String args[]){
        int n = 4;
        int base = 2;
        int ans = 1;
        while(n>0){
            int a = n&1;
            n = n>>1;
            if(a!=0){
                ans = ans*base;
            }
            base = base*base;
        } 
      System.out.println(ans);
    }
}
