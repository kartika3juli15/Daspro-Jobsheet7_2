import java.util.Scanner;

public class DeretBilangan17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int i = 1;

        do {
            if(i % 3 != 0) {
                System.out.print(i + " ");
            }
            i++;
        } while(i <= 50);
    }
}