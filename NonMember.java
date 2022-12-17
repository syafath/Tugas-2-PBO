public class NonMember extends Pemesanan{
    private int hargaNonMember = 7500;

    public int getHargaNonMember() {
        return hargaNonMember;
    }

    public void setHargaNonMember(int hargaNonMember) {
        this.hargaNonMember = hargaNonMember;
    }

    @Override
    public int bayarNonMember() {
        return total = hargaNonMember * jumlahTiket;
    }

    // tidak bisa di overriding karena berupa final
//    final static void Pemesanan(){
//
//    }

    // static tidak bisa di override
//    @Override
//    static void awal(){}
}
