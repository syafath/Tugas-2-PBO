import java.util.Scanner;
public class Pemesanan {
    protected int jumlahTiket;
    protected int total;
    private String nomorBus;
    private int jamBerangkat;
    private String user;

    public int getJumlahTiket() {
        return jumlahTiket;
    }

    public void setJumlahTiket(int jumlahTiket) {
        this.jumlahTiket = jumlahTiket;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int bayarMember(){
        return 0;
    }

    public int bayarNonMember(){
        return 0;
    }

    public void pesan(){
        Scanner in = new Scanner(System.in);

        System.out.print("Nomor Bus : ");
        String nomorBus = in.nextLine();
        System.out.print("Halte Keberangkatan (Tulis Kode) : ");
        String halteKeberangkatan = in.nextLine();
    }

    final static void Pemesanan(){
        Scanner in = new Scanner(System.in);
        Pemesanan psn = new Pemesanan();
        System.out.println("Member atau Non Member : " );
        String user = in.nextLine();
        psn.getUser();
    }

}
