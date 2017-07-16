public abstract class Mahasiswa {
  public String nama = "Hery Bian Firmansyah";
  public String nim = "10111006";
  public String kelas = "Prolan - 11";
  public String tahun = "2017";
          
  public String getNama() {
        return nama;
    }

public abstract void printNama();

public String getNim() {
        return nim;
    }

public abstract void printNim();

public String getKelas() {
        return kelas;
    }

public abstract void printKelas();

public String getTahun() {
        return tahun;
    }

public abstract void printTahun();
  
  abstract void kuliah();
  abstract void lulus();
  abstract void tidaklulus();
  abstract void dropout();
}