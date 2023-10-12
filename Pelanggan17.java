import java.util.Scanner;
public class Pelanggan17 {
    public static void main(String[] args){
        Scanner sc17 = new Scanner(System.in);
        String nama;
        char jawab;
        int jml = 0;
        do{
            System.out.print("Masukkan Nama Pelanggan: ");
            nama = sc17.nextLine();
            jml ++;
            System.out.print("Apakah Anda Ingin Memasukkan Nama Pelanggan Baru( Y/T)?");
            jawab = sc17.nextLine(). charAt(0);
        } while (jawab == 'y'|| jawab == 'Y');
        System.out.println("Jumlah Pelanggan Yang Anda Masukkan = " + jml);

}
}