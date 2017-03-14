/*-----------------------
Nama : Hery Firmansyah
Nim  : 10111006
-----------------------*/

public class BelajarKonstruktor {

    String judul, penulis, penerbit;
    int thnproduksi, edisi;

public BelajarKonstruktor(String a, String b, String c, int d, int e)
{
    judul = a;
    penulis = b;
    penerbit = c;
    thnproduksi = d;
    edisi = e;
}

    public void CetakKonstruktor() {
        System.out.print("Judul "+judul+" Penulis "+penulis+" Penerbit "+penerbit);
        System.out.println(" Tahun "+thnproduksi+" Edisi "+edisi);
    }
    
}
