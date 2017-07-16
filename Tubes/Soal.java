package mainquiz;

/**
 *
 * @author Herybian
 */
public class Soal {
    int kesempatan;
    String jawab;
    int score;
    int soalKe;
    int bykSoal;
    String j;
    Soal() { start(); }
    public void setJawab(String jawab) { this.jawab = jawab; }
    private Quiz quiz[] = {
        new Quiz("Berapakah 1 + 1: ", "2"),
        new Quiz("Berapakah 5 x 20: ", "100"),
        new Quiz("Berapakah 9 x 12: ", "108"),
        new Quiz("Berapakah 7 x 7 x 7: ", "343"),
        new Quiz("Berapakah 3 x 5 x 9: ", "135")
    };
    public void start() {
        kesempatan = 2;
        score = 0;
        soalKe = 0;
        bykSoal = quiz.length;
    }
    public int getBykSoal() { return bykSoal; }
    public int getKesempatan() { return kesempatan; }
    public String getSoal() {
        return quiz[soalKe].getSoal();
    }
    public int getScore() { return score; }
    public int getSoalKe() { return soalKe; }
    public String cekJawaban() {
        j = "";
        if (quiz[soalKe].cocokanJawaban(jawab)) {   // if true (boolean)
            score++;
            soalBerikut();
            j = "benar";
            return "Benar..!";
        } else {
            if (kesempatan == 0) {
                j = "over";
                return "===Game over===";
            } else {
                kesempatan--;
                j = "salah";
                return "Salah..! Silahkan menjawab lagi..";
            }
        }
    }
    private void soalBerikut() { soalKe++; }
    public String getJ() { return j; }
}
