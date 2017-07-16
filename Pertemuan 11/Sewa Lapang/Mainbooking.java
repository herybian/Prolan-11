public class Mainbooking {
    public static void main(String[] args) {
        lapang sewa = new lapang();
        sewa.setNomerbooking(17);
        sewa.setNamapenyewa("Herybian");
        sewa.setLapangisi(4);
        sewa.setTotallapang(8);
        sewa.setNamalapang("Kabau Sirah");
        sewa.setJenislapang("Sintetic Grass");
        sewa.setKettahundibangun(2011);
		System.out.println("====================================");
        System.out.println("Bukti Tanda Booking Lapangan Futsal:");
		System.out.println("====================================");
		System.out.println("====================================");
        System.out.println("Nomor Booking              : "+sewa.getNomerbooking());
        System.out.println("Nama Penyewa Lapangan      : "+sewa.getNamapenyewa());
        System.out.println("Nama Lapangan              : "+sewa.getNamalapang());
        System.out.println("Jenis Lapangan             : "+sewa.getJenislapang());
        System.out.println("Tahun Berdiri Lapangan     : "+sewa.getKettahundibangun());
        sewa.lapangkosong();
        System.out.println("Total Lapang Tersedia      : "+sewa.getTotallapang());
        sewa.lapangkosong();
		System.out.println("====================================");
		System.out.println("====================================");
    }
}