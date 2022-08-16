#Latihan 3

Cik Putri merupakan akuntan di perusahaan dimana ia bekerja. Salah satu tugasnya adalah menghitung jumlah waktu bekerja untuk setiap karyawan (dalam jam, menit dan detik). Mari bantu Cik Putri untuk membuat menjumlahkan waktu bekerja per minggu untuk 2 minggu terakhir. 

Berikut luaran program yang diinginkan apabila anda memberikan masukan 20 jam 50 menit dan 45 detik untuk minggu pertama dan 10 jam 30 menit dan 30 detik.
```
31 jam 21 menit 15 detik
```

Apabila anda memberikan masukan 0 jam 60 menit dan 60 detik untuk minggu pertama dan kedua, luaran program ini adalah
```
2 jam 2 menit 0 detik
```

Gunakan template program di bawah untuk menuliskan jawaban anda. Anda hanya perlu menyelesaikan implementasi penambahan dua waktu dalam fungsi addTime. Fungsi ini menerima 6 masukan, yaitu:
- hr1, jumlah jam bekerja pada minggu pertama
- min1, jumlah menit bekerja pada minggu pertama
- sec1, jumlah detik bekerja pada minggu pertama
- hr2, jumlah jam bekerja pada minggu kedua
- min2, jumlah menit bekerja pada minggu kedua
- sec2, jumlah detik bekerja pada minggu kedua
Hasil penjumlahan harus dicetak di layar dalam format 31 jam 21 menit 15 detik

```
/**
 *  Nama   : 
 *  Kelas  : Konsep Pemrograman 
 *  Tanggal: 
 *
 *  Latihan 3: Program ini menjumlahkan dua waktu dalam satuan jam, menit dan detik
 */

public class TimeCalculation {

    public static void main(String[] args) {
        addTime(20,50,45, 10,30,30);
        addTime(0,60,60, 0,60,60);
    }
    
    /***
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
        //selesaikan implementasi fungsi ini
        
        System.out.println(allHour + " jam " + allMin + " menit " + allSec + " detik");

    }
}

```
Kumpulkan jawaban anda via CodePost](https://www.codepost.io/) dengan nama tugas: Penjumlahan dua waktu. Untuk menggunakan codePost, anda harus membuat akun dan dimasukkan dalam daftar kelas. Hubungi tisha[dot]melia[at]lecturer[dot]unri[dot]ac[dot]id untuk mendaftar.

Selamat Bekerja!

