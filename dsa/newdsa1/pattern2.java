public class pattern2 {
    public static void main(String[] args) {
        pat();

    }
    static void pat(){
        for(int i=6-1;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
