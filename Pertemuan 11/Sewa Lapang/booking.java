public class booking {
    int nomerbooking;
    String namapenyewa;
    int lapangisi;
    String tglbooking;
    int totallapang;
    
    booking(){
        
    }

    booking(int nomerbooking, String namapenyewa, int lapangisi, String tglbooking, int totallapang) {
        this.nomerbooking = nomerbooking;
        this.namapenyewa = namapenyewa;
        this.lapangisi = lapangisi;
        this.tglbooking = tglbooking;
        this.totallapang = totallapang;
    }
    
    public int getLapangisi() {
        return lapangisi;
    }

    public void setLapangisi(int lapangisi) {
        this.lapangisi = lapangisi;
    }

    public String getNamapenyewa() {
        return namapenyewa;
    }

    public void setNamapenyewa(String namapenyewa) {
        this.namapenyewa = namapenyewa;
    }

    public int getNomerbooking() {
        return nomerbooking;
    }

    public void setNomerbooking(int nomerbooking) {
        this.nomerbooking = nomerbooking;
    }

    public int getTotallapang() {
        return totallapang;
    }

    public void setTotallapang(int totallapang) {
        this.totallapang = totallapang;
    }

    public String getTglbooking() {
        return tglbooking;
    }

    public void setTglbooking(String tglbooking) {
        this.tglbooking = tglbooking;
    }

    public void lapangterisi(){
        System.out.println("Total Lapang yang terisi  : "+getLapangisi());
    }

    public void lapangkosong(){
        System.out.println("Lapang yang tersisa = "+(getTotallapang()+ " - "+getLapangisi())+" = "+(getTotallapang()-getLapangisi()));
    }
}