package mainquiz;

/**
 *
 * @author Herybian
 */
public class Quiz {
    private String soal;
    private String jawab;
    public Quiz(String soal, String jawab) {
        this.soal = soal;
        this.jawab = jawab;
    }
    public boolean cocokanJawaban(String jawab) {
        return this.jawab.equalsIgnoreCase(jawab);
    }
    public String getJawab() {
        return jawab;
    }
    public String getSoal() {
        return soal;
    }
}