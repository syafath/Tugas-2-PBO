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

        Penumpang psn = new Penumpang();
        psn.pesan();
        for(int i = 1; i <= 50; i++){
            System.out.print("=");
        }
        System.out.println("");

        Date date = new Date();
        // menampilkan waktu dan tanggal menggunakan toString()
        System.out.println("Tanggal : " + date.toString());
        for(int i = 1; i <= 50; i++){
            System.out.print("=");
        }
        System.out.println("");

        Struk st = new Struk();
        st.cetakStruk();
        for(int i = 1; i <= 50; i++){
            System.out.print("=");
        }
        System.out.println("");

        // membuat variabel dan scanner
        boolean running = true;
        int counter = 0;
        String jawab;

        while(running) {
            System.out.println("Apakah anda ingin keluar?");
            System.out.print("Jawab [ya/tidak] :  ");
            jawab = input.nextLine();
            if( jawab.equalsIgnoreCase("ya") ){
                running = false;
            }
            counter++;
        }
        System.out.println("Anda sudah melakukan perulangan sebanyak " + counter + "kali");

    }
}