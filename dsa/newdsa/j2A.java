import java.util.*;
public class j2A {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total numbers to print: ");
        int total = sc.nextInt();  // total numbers you want, e.g. 15
        
        int number = 1;  // start from 1
        int row = 1;     // start with first row
        
        while (number <= total) {  // keep printing until all numbers printed
            for (int j = 1; j <= row && number <= total; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
            row++; // go to next row
        }
    }
}


