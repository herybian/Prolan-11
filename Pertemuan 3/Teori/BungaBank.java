/*-----------------------
Nama : Hery Firmansyah
Nim  : 10111006
-----------------------*/

import java.util.Scanner;

public class BungaBank {

    public static void main(String[] args) {
        /* Deklarasi */
        Scanner x=new Scanner(System.in);
            int lama;
            double hutang, angsur, angsur1;
            double bunga, bunga1, sisa, sisa1;
            double total=0, totbunga, bayar;
        System.out.println("========================================");
        System.out.println("Program Hitung Angsuran Peminjaman Uang");
        System.out.println("========================================");
        System.out.println("Berapa Nominal yang akan anda pinjam = ");
        hutang=x.nextDouble();
        System.out.println("Berapa kali anda akan mengangsur (bulan) = ");
        lama=x.nextInt();
        System.out.println();
        System.out.println("**** BUNGA AKAN TERUS NAIK TIAP BULAN ***");
        System.out.println();
        System.out.println("=========== Rincian Angsuran ===========");
        for(int a=1;a<=lama;a++){
            angsur=hutang/lama;
            sisa=hutang-angsur*a;
            bunga=hutang/(sisa+angsur);
            bunga1=bunga*3/100*hutang;
            bayar=bunga1+angsur;
            total+=bayar;
        System.out.println("Bulan ke-"+a);
        
        System.out.println("========================================");
        System.out.printf("Suku bunga = %.2f",bunga);
        System.out.println(" persen");
        System.out.printf("Besar Bunga = %.2f",bunga1);
        System.out.println(" Rupiah");
        System.out.printf("Bayar      = %.2f",bayar);
        System.out.println(" Rupiah");
        System.out.printf("Sisa Pinjaman = %.2f",sisa);
        System.out.println(" Rupiah");
        
        System.out.println("=========================================");
        }
        
        System.out.println("=========================================");
        System.out.println("Pinjaman Awal = "+hutang+" Rupiah");
        System.out.printf("Total Pengembalian (pinjaman awal+bunga dari bulan 1 - "+lama+") = %.2f",total);
        System.out.println(" Rupiah");
        System.out.println("=========================================");
    }
}