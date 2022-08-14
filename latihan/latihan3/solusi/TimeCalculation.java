/**
 *  Nama   : 
 *  Kelas  : Konsep Pemrograman 
 *  Tanggal: 
 *
 *  Latihan 3: Program ini menerima masukan sebuah bilangan bulat, kemudian
 *             akan menampilkan apakah bilangan tersebut ganjil atau genap
 */


/**
 *
 * @author tisha
 */
public class TimeCalculation {

    public static void main(String[] args) {
        addTime(20,50,45, 10,30,30);
        addTime(0,60,60, 0,60,60);
    }
    
    /**
     * Fungsi ini menambahkan dua waktu, dimana akan ditampilkan
     * dalam satuan jam, menit dan detik
     * @param hr1 jumlah waktu bekerja pada minggu pertama (jam)
     * @param min1 jumlah waktu bekerja pada minggu pertama (menit)
     * @param sec1 jumlah waktu bekerja pada minggu pertama (detik)
     * @param hr2 jumlah waktu bekerja pada minggu kedua (jam)
     * @param min2 jumlah waktu bekerja pada minggu kedua (menit)
     * @param sec2 jumlah waktu bekerja pada minggu kedua (detik)
     * 
     */
    public static void addTime(int hr1, int min1, int sec1, int hr2, int min2, int sec2){
        //jumlahkan detik
        int allSec = sec1 + sec2;
        //jumlahkan menit
        int allMin = min1 + min2 + (allSec/60);
        //Apabila lebih dari 60, hanya simpan sisa detik
        allSec = allSec % 60; 
        
        //jumlahkan jam
        int allHour = hr1 + hr2 + (allMin/60);
        //Hitung sisa menit
        allMin = allMin % 60;
        
        System.out.println(allHour + " jam " + allMin + " menit " + allSec + " detik");

    }
}
