public abstract class Calculator{
    
    protected abstract double hasiltambah (double x, double y);
    protected abstract double hasilkurang (double x, double y);
    protected abstract double hasilkali (double x, double y);
    protected abstract double hasilbagi (double x, double y);
    
    protected boolean hasillebihbesardari(double x, double y) {return true;}
    protected boolean hasillebihkecildari(double x, double y) {return true;}
    protected boolean hasillebihbesarsamadengandari(double x, double y) {return true;}
    protected boolean hasillebihkecilsamadengandari(double x, double y) {return true;}
    
    
    
    
}