import java.util.Scanner;
public class kelompok117 {
    public static void main(String[] args) {
        Scanner sc17 = new Scanner (System.in);
        String nama;
        String [] dataAng = {"devita,syaqira,tika"};
        char jawab;
        int jml=0;

        do {
            System.out.print("Masukkan nama: ");
            nama = sc17.next();
            jml++;
            System.out.print("Apakah nama tersebut anggota vip (Y/t)? ");
            jawab = sc17.next().charAt(0);
        }while (jawab == 'Y' || jawab == 'Y');
        System.out.println("jumlah anggota sekarang = " + jml);
        
         
    }
}