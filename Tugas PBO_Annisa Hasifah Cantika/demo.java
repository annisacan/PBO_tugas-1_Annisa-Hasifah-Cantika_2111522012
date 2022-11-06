public class demo{
    
    public static void main(String[] args) {
        int total_waktusibuk;
        guruPL a = new guruPL("Tati", 5, 3);
        guru b = new guru("Firman", 7);
        murid c = new murid("Nisa", 12); 
        guruPL d = new guruPL("Lli", 4, 4);
        guru e = new guru("Wahyu", 4);
        murid f = new murid("Rijjal", 12); 
        
    

        a.mailCheck();
        b.mailCheck();
        c.mailCheck();
        d.mailCheck();
        e.mailCheck();
        f.mailCheck();

        total_waktusibuk = a.waktuSibuk+b.getWaktuSibuk()+c.waktuSibuk+d.waktuSibuk+e.getWaktuSibuk()+f.getWaktuSibuk();
        System.out.println("Total jam sibuk di sekolah ini adalah "+ total_waktusibuk + " jam");


    }
}
