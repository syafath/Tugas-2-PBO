import java.util.Scanner;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Bus.displayJadwal();
        for(int i = 1; i <= 50; i++){
            System.out.print("=");
        }
        System.out.println("");

        Pemesanan psn = new Pemesanan();
        psn.pesan();
        for(int i = 1; i <= 50; i++){
            System.out.print("=");
        }
        System.out.println("");

        Petugas tugas = new Petugas();
        tugas.cetakStruk();
        Date date = new Date();
        // menampilkan waktu dan tanggal menggunakan toString()
        System.out.println("Tanggal : " + date.toString());
        for(int i = 1; i <= 50; i++){
            System.out.print("=");
        }
        System.out.println("");

        tugas.cetakStruk();
        for(int i = 1; i <= 50; i++){
            System.out.print("=");
        }
        System.out.println("");
    }
}