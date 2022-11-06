public class murid extends element{

    private int jumlahMapel;
    public int waktuSibuk;

    public murid(String nama, int jumlahMapel) {
        super(nama);
        waktuSibuk = jumlahMapel;
        //TODO Auto-generated constructor stub
    }

    
    
    public void mailCheck() {
        System.out.println(getnama() + "sehari memiliki waktu pembelajaran selama " + getWaktuSibuk() + " jam");       
    }

    public int getWaktuSibuk() {
        return waktuSibuk;        
    }
}
