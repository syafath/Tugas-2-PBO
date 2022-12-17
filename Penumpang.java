import java.util.Scanner;

public class Penumpang implements Harga {

    @Override
    public void pesan() {
        Scanner in = new Scanner(System.in);

        System.out.print("Nomor Bus : ");
        String nomorBus = in.nextLine();
        System.out.print("Halte Keberangkatan (Tulis Kode) : ");
        String halteKeberangkatan = in.nextLine();
    }
}
