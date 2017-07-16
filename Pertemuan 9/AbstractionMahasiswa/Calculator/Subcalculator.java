public class Subcalculator extends Calculator {
    private boolean hasillebihbesardari;
    private boolean hasillebihkecildari;
    private boolean hasillebihbesarsamadengandari;
    private boolean hasillebihkecilsamadengandari;
    
    @Override
    public double hasiltambah (double x, double y){
        double hasil;
        hasil = x + y;
        return hasil;
    }
    @Override
    public double hasilkurang (double x, double y){
        double hasil;
        hasil = x - y;
        return hasil;
    }
    
    @Override
    public double hasilkali (double x, double y){
        double hasil;
        hasil = x * y;
        return hasil;
    }
    
    @Override
    public double hasilbagi (double x, double y){
        double hasil;
        hasil = x / y;
        return hasil;
    }

    
    @Override
    protected  boolean hasillebihbesardari (double x, double y) {
        double hasil;
        hasillebihbesardari = x > y;
        return hasillebihbesardari;
    }
    
    @Override
    protected  boolean hasillebihkecildari (double x, double y) {
        double hasil;
        hasillebihkecildari = x < y;
        return hasillebihkecildari;
    }
    
    @Override
    protected  boolean hasillebihbesarsamadengandari (double x, double y) {
        double hasil;
        hasillebihbesarsamadengandari = x >= y;
        return hasillebihbesarsamadengandari;
    }
    
   
    @Override
    protected  boolean hasillebihkecilsamadengandari (double x, double y) {
        double hasil;
        hasillebihkecilsamadengandari = x <= y;
        return hasillebihkecilsamadengandari;
    }
}
   
    