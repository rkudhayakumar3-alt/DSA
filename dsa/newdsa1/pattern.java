public class pattern {
    public static void main(String[] args) {
      pat();
        System.out.println();
    }
    static void pat(){
        for(int i=0;i<6;i++){
            for(int j=0;j<i*2;j++){
                System.out.print("  ");
            }
             
            System.out.println("*");
        }
    }
}
