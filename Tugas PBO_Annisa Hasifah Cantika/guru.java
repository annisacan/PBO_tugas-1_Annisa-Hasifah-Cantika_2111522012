public class guru extends element {
    private int jumlahHariKerja;
    private int waktuSibuk;

    public guru (String nama, int jumlahHariKerja) {
        super(nama);
        waktuSibuk = jumlahHariKerja * 6;
    }

    public int getWaktuSibuk() {
        return waktuSibuk;
    }

    public void mailCheck() {
        System.out.println(getnama() + "memiliki jam kerja selama " + getWaktuSibuk() + " jam");
    }
}
