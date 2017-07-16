package mainquiz;
import java.util.Scanner;
/**
 *
 * @author Herybian
 */
public class MainQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Soal soal = new Soal();
        int banyakSoal = soal.getBykSoal();
        do {
            System.out.println("Kesempatan (" + soal.getKesempatan() + ")");
            System.out.println("SOAL KE - " + (soal.getSoalKe() + 1));
            System.out.println("Score: " + soal.getScore());
            System.out.println(soal.getSoal());
            soal.setJawab(input.nextLine().toString());
            System.out.println(soal.cekJawaban());
            System.out.println("");
            if (soal.getJ().equalsIgnoreCase("benar")) { banyakSoal--; }
            if (soal.getJ().equalsIgnoreCase("over")) { break; }
        } while (banyakSoal != 0);
 
        System.out.println("Score akhir: " + soal.getScore());
        if (soal.getKesempatan() == 2) {
            System.out.println("Perfect!");
        } else if ((soal.getKesempatan() == 0) && (soal.getScore() == 5)) {
            System.out.println("Berakhir dengan keberuntungan, he3..");
        } else if (soal.getJ().equalsIgnoreCase("over")) {
            System.out.println("Anda harus berlatih berhitung..");
        }
    }
}