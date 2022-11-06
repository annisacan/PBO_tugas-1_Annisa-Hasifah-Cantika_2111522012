public class guruPL extends murid {
    private int jamNgajarPL;

    public guruPL(String nama, int jumlahMapel, int jamNgajarPL) {
        super(nama, jumlahMapel);
        waktuSibuk = waktuSibuk + jamNgajarPL; 
        //TODO Auto-generated constructor stub
    }

   

    public void mailCheck() {
        System.out.println(getnama() + " menghabiskan waktu disekolah selama " + getWaktuSibuk() + " jam");
    }
    
    public int getWaktuSibuk() {
        return waktuSibuk;
    }
}
