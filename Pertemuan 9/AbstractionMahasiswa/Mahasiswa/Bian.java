public class Bian extends Mahasiswa {
    
 
     @Override
    public  String getNama() {
        return super.getNama();
    }

    @Override
    public void printNama() {
        System.out.println(getNama());
}
    
    
     @Override
    public String getNim() {
        return super.getNim();
    }

    @Override
    public void printNim() {
        System.out.println(getNim());
        }
    
    
    @Override
    public String getKelas() {
        return super.getKelas();
    }

    @Override
    public void printKelas() {
        System.out.println(getKelas());
        }
    
    @Override
    public String getTahun() {
        return super.getTahun();
    }

    @Override
    public void printTahun() {
        System.out.println(getTahun());
        }
    
    
    @Override
    void kuliah() {
        System.out.println("Anda boleh tidak hadir kuliah maksimal 4x dalam satu mata kuliah per satu semester !!! "); 
    }

    @Override
    void lulus() {
        System.out.println("Anda lulus jika IPK diatas 2.50 ... "); 
    }

    @Override
    void tidaklulus() {
        System.out.println("Anda tidak lulus jika ada nilai grade 'E' diatas 3 mata kuliah !!!"); 
    }
    
    @Override
    void dropout() {
        System.out.println("Jika anda tidak mengikuti/mentaati peraturan, anda akan di cutikan atau di Do (DropOut) dari Universitas ini !!!"); 
    }
    
}
