public class MainMahasiswa extends Bian {
   public static void main (String[] args) {
       Bian bi = new Bian();
       
       System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
       System.out.println("======================================================");
       System.out.println("Ini adalah biodata data anda di Universitas Komputer Indonesia");
       System.out.println("======================================================\n"); 
       
       System.out.print("Nama Anda        :      "); bi.printNama();
       System.out.print("NIM Anda         :      "); bi.printNim();
       System.out.print("Kelas Anda       :      "); bi.printKelas();
       System.out.print("Tahun masuk anda :      "); bi.printTahun();
       System.out.println("======================================================\n");
       System.out.println("Keterangan : ");
       
       
       
       bi.kuliah();
       bi.lulus();
       bi.tidaklulus();
       bi.dropout();
       System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
       }
}
    
