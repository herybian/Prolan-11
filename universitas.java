public class universitas{
	public static void main(String[] args) {
		mahasiswa mhs = new mahasiswa();

		System.out.println("\n\t============= DATA MAHASISWA UNIVERSITAS KOMPUTER INDONESIA =============\n");
		mhs.data_mahasiswa();
		System.out.println("\n\t=========================================================================\n");
	}
}

class mahasiswa{
	private String nim,nama,tmp_lhr;
	private char jk;

	public void data_mahasiswa(){
		nim = "10111006";
		nama = "Hery Firmansyah";
		tmp_lhr = "Jakarta";
		jk = 'L';

		System.out.println("\tNIP \t\t: "+nim);
		System.out.println("\tNama \t\t: "+nama);
		System.out.println("\tTempat Lahir \t: "+tmp_lhr);
		System.out.println("\tJenis Kelamin \t: "+jk);
	
	}

}