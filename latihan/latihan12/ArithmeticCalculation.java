/**
 *  Nama   : 
 *  Kelas  : Konsep Pemrograman 
 *  Tanggal: 
 *
 *  Latihan 12: Program ini untuk menghitung bilangan berpangkat
 */


public class ArithmeticCalculation {

    public static void main(String[] args) {
        System.out.println(hitungPangkat(5, 0));
        System.out.println(hitungPangkat(5, 2));
        System.out.println(hitungPangkat(5, -2));
        System.out.println(hitungPangkat(5, -1));
    }
    
    public static double hitungPangkat(int bilPokok, int bilPangkat){
        double hasil = 1.0;
        int bilPangkatAbsolut = Math.abs(bilPangkat);
        
        for(int i = 0; i< bilPangkatAbsolut; i++){
            hasil *= bilPokok;
        }
        
        if(bilPangkat < 0){
            hasil = 1.0/hasil;
        }
        return hasil;
    }
}
