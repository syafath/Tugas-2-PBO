import java.util.Scanner;

public class Bus {
    private String nomorBus;
    private String halteKeberangkatan;


    public String getNomorBus() {
        return nomorBus;
    }

    public void setNomorBus(String nomorBus) {
        this.nomorBus = nomorBus;
    }

    public String getHalteKeberangkatan() {
        return halteKeberangkatan;
    }

    public void setHalteKeberangkatan(String halteKeberangkatan) {
        this.halteKeberangkatan = halteKeberangkatan;
    }

    static void displayJadwal(){
        System.out.println("Nomor Bus");
        System.out.println("1. AB 1234 AK");
        System.out.println("2. AB 5678 BK");
        System.out.println("3. AB 9012 LP");
        System.out.println("4. AB 3456 RT");
        System.out.println("Halte Keberangkatan - Halte Tujuan");
        System.out.println("1. Terminal Jombor - Ambarukmo (5A)");
        System.out.println("2. Terminal Giwangan - Condong Catur (3A)");
        System.out.println("3. Terminal Giwangan - UGM (4B)");
        System.out.println("4. Perk Gamping - Stadion Kridosono (10)");
    }

}