import java.util.Date;

public class Petugas {
    private int idTiket;
    private int totalBayar;

    public int getTotalBayar() {
        return totalBayar;
    }

    public void setTotalBayar(int totalBayar) {
        this.totalBayar = totalBayar;
    }

    public int getIdTiket() {
        return idTiket;
    }

    public void setIdTiket(int idTiket) {
        this.idTiket = idTiket;
    }

    public void cetakStruk(){
        System.out.println("Id Tiket : ");
        System.out.println("Total Pembayaran : ");
    }
}