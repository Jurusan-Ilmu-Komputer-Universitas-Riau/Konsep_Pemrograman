/**
 *  Nama   : 
 *  Kelas  : Konsep Pemrograman 
 *  Tanggal: 
 *
 *  Latihan 13: Program ini digunakan untuk mengacak kata, dimana huruf pertama 
 *              dan terakhir tidak boleh diacak
 */


public class Word {

    public static void main(String[] args) {
        System.out.println(acakKata("Buku"));
        System.out.println(acakKata("komputer"));
        System.out.println(acakKata("makan"));
    }
    
    public static String acakKata(String input){
        
        String hasil = input.substring(0, 1); //Huruf awal tidak boleh dipindah
        int jumlahHuruf = input.length();
        
        int i;
        for(i = 1; i < (jumlahHuruf-2); i=i+2){
            
            String pertama = input.substring(i, (i+1)); //karakter pertama
            String kedua = input.substring((i+1), (i+2)); //karakter kedua
            hasil = hasil.concat(kedua); //acak dengan menggunakan karakter kedua dulu
            hasil = hasil.concat(pertama); //acak dengan menggunakan karakter pertama
        }
        
        //Tambahkan karakter terakhir
        String terakhir = input.substring(i, jumlahHuruf);
        hasil = hasil.concat(terakhir);
        return hasil;
    }
}



