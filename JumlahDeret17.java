import java.util.Scanner;
public class JumlahDeret17 {
    public static void main(String[] args) {
        Scanner sc17 = new Scanner(System.in);

        int hasil = 0;
        int i = 25;

       while (i >= 1) {
        hasil += i;
        i--;
       }
       System.out.println("Hasil penjumlahan deret bilangan 25 sampai dengan 1 adalah: " + hasil);
     }
}
    