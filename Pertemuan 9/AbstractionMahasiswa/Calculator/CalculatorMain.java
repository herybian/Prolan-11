
import java.util.Scanner;

public class CalculatorMain extends Subcalculator {
    public static void main (String[]args){
        double operan1,operan2;
        Subcalculator cal = new Subcalculator();
        
        Scanner input = new Scanner(System.in);
        operan1 = input.nextDouble();
        operan2 = input.nextDouble();
        
        System.out.print("Hasil penjumlahan adalah :");System.out.println(cal.hasiltambah(operan1, operan2));
        System.out.print("Hasil pengurnagan adalah :");System.out.println(cal.hasilkurang(operan1, operan2));
        System.out.print("Hasil perkalian adalah :");System.out.println(cal.hasilkali(operan1, operan2));
        System.out.print("Hasil pembagian adalah :");System.out.println(cal.hasilbagi(operan1, operan2));
        
        System.out.print("Apakah lebih besar dari :");System.out.println(cal.hasillebihbesardari (operan1, operan2));
        System.out.print("Apakah lebih kecil dari :");System.out.println(cal.hasillebihkecildari (operan1, operan2));
        System.out.print("Apakah lebih besarsamadengan dari :");System.out.println(cal.hasillebihbesarsamadengandari (operan1, operan2));
        System.out.print("Apakah lebih kecil sama dengan dari :");System.out.println(cal.hasillebihkecilsamadengandari (operan1, operan2));
        
        
    }
}