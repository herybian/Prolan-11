package laporanmethod;

/**
 *
 * @author Herybian
 */
public class methodtiga {
    public double Luas () {
    int sisi_a = 10 , sisi_b = 15 , t = 8;
    return ( sisi_a + sisi_b * t / 2 );
}
    public static void main (String [] args ){
        methodtiga input = new methodtiga ();
        System.out.println("Luas trapesium =");
        System.out.println(input.Luas());
    }
}
