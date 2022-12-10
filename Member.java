public class Member extends Pemesanan{
    private int hargaMember = 2500;

    public int getHargaMember() {
        return hargaMember;
    }

    public void setHargaMember(int hargaMember) {
        this.hargaMember = hargaMember;
    }

    @Override
    public int bayarMember() {
        return total = hargaMember * jumlahTiket;
    }
}
