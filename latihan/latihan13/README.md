#Latihan 13

Menurut penelitian di sebuah universitas di Inggris, manusia masih dapat memahami sebuah teks yang hurufnya diacak selama huruf pertama dan terakhir masih sama. Apakah anda bisa membaca teks di bawah ini?

Munuret pneeiliatn di sabeuh uinevrsatis di Irniggs, msanuia msiah dpaat mheammai saubeh tkes ynag huufryna daiack slmeaa huurf pmatrea dan taerhikr msiah smaa. Apkaah adna bsia mcmabea tkes di bwaah ini?

Buatlah sebuah program dimana anda akan membaca sebuah file berisi teks dan anda mengacak setiap huruf dalam teks tersebut dengan ketentuan sebagai berikut:
- Huruf pertama dan terakhir haruslah dipertahankan. 
- Anda tidak boleh mengubah huruf besar ke huruf kecil, dan juga sebaliknya. 
- Anda mengacak kata dengan cara menukarkan huruf kedua dengan huruf ketiga, huruf keempat dengan huruf kelima, dan seterusnya.
- Apabila jumlah huruf dalam kata itu ganjil, maka dua huruf terakhir akan tidak diacak. 

Perhatikan contoh berikut, apabila kata yang dimasukkan adalah Buku, maka kata setelah diacak adalah:
```
Bkuu
```
Apabila kata yang dimasukkan adalah komputer, maka hasil kata yang diacak adalah
```
kmoupetr
```
Apabila kata yang dimasukkan adalah makan, maka hasil kata yang diacak adalah
```
mkaan
```

Fungsi untuk mengacak kata haruslah menggunakan nama berikut
```
String acakKata(String input)
```
Fungsi tersebut bernama acakKata, dimana menerima satu masukan yaitu kata yang perlu diacak (String). Kembalian fungsi ini adalah sebuah variabel bertipe String yang dimana hurufnya sudah diacak, kecuali huruf awal atau akhir


Gunakan template program di bawah untuk menuliskan jawaban anda. 

```
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
        
        String hasil;

        //Masukkan kodingan anda disini

        return hasil;
    }
}


```
Kumpulkan jawaban anda via CodePost](https://www.codepost.io/) dengan nama tugas: Acak Kata. Agar dapat mengumpulkan latihan melalui autograder codepost, ikuti tutorial [berikut](https://github.com/Jurusan-Ilmu-Komputer-Universitas-Riau/Modul_Belajar_Pemrograman/tree/main/codepost).


Selamat Bekerja!

