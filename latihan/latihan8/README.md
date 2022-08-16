#Latihan 8

Aan, Budi, Caca, Dodi dan Edo masing masing mempunyai kelereng, dan ingin mengetahui siapa yang mempunyai kelereng yang paling banyak dan paling sedikit. Buatlah program untuk menyelesaikan hal tersebut! Perhatikan luaran program di bawah

Apabila kelereng Aan, Budi, Caca, Dodi dan Edo adalah 5, 2, 1, 7 dan 5, Maka nilai maksimum adalah 7 dan nilai minimum adalah 1.

Gunakan template program di bawah untuk menuliskan jawaban anda. Anda hanya perlu menyelesaikan implementasi mencari nilai maksimum dalam fungsi findMax. Fungsi ini menerima 5 masukan, yaitu:
- input1, angka 1 untuk dicari nilai maksimum
- input2, angka 2 untuk dicari nilai maksimum
- input3, angka 3 untuk dicari nilai maksimum
- input4, angka 4 untuk dicari nilai maksimum
- input5, angka 5 untuk dicari nilai maksimum
Fungsi ini akan mengembalikan nilai maksimum di antara 5 nilai di atas

Kemudian gunakan juga template program di bawah untuk menyelesaikan implementasi fungsi mencari nilai minimum dalam fungsi findMin. Fungsi ini menerima 5 masukan, yaitu:
- input1, angka 1 untuk dicari nilai minimum
- input2, angka 2 untuk dicari nilai minimum
- input3, angka 3 untuk dicari nilai minimum
- input4, angka 4 untuk dicari nilai minimum
- input5, angka 5 untuk dicari nilai minimum
Fungsi ini akan mengembalikan nilai minimum di antara 5 nilai di atas

```
/**
 *  Nama   : 
 *  Kelas  : Konsep Pemrograman 
 *  Tanggal: 
 *
 *  Latihan 8: Program ini menemukan angka maksimum dan minimum dari 5 angka
 */

public class Marble {

    public static void main(String[] args) {
        int result = findMax(2,4,1,10,2);
        System.out.println("maksimum: " + result);
        result = findMin(2,4,1,10,2);
        System.out.println("minimum: " + result);
        
        result = findMax(2,2,2,2,2);
        System.out.println("maksimum: " + result);
        result = findMin(2,2,2,2,2);
        System.out.println("minimum: " + result);
        
        result = findMax(-4,-2,-8,-1,-9);
        System.out.println("maksimum: " + result);
        result = findMin(-4,-2,-8,-1,-9);
        System.out.println("minimum: " + result);
    }
    
    /**
     * Fungsi untuk mencari nilai maksimum dari 5 angka yang diterima
     * 
     * @param input1 angka pertama
     * @param input2 angka kedua
     * @param input3 angka ketiga
     * @param input4 angka keempat
     * @param input5 angka kelima
     * @return nilai maksimum dari lima angka yang diterima
     */
    public static int findMax(int input1, int input2, int input3, int input4, int input5){
        int max;    //variabel penyimpan nilai maksimum
        //Selesaikan implementasi koding disini

        return max; //mengembalikan nilai maksimum
    }
    
    /**
     * Fungsi untuk mencari nilai minimum dari 5 angka yang diterima
     * 
     * @param input1 angka pertama
     * @param input2 angka kedua
     * @param input3 angka ketiga
     * @param input4 angka keempat
     * @param input5 angka kelima
     * @return nilai minimum dari lima angka
     */
    public static int findMin(int input1, int input2, int input3, int input4, int input5){
        int min;    //variabel penyimpan nilai minimum
        //Selesaikan implementasi koding disini

        return min; //mengembalikan nilai minimum
    }
}


```
Kumpulkan jawaban anda via CodePost](https://www.codepost.io/) dengan nama tugas: Maksimum dan minimum. Untuk menggunakan codePost, anda harus membuat akun dan dimasukkan dalam daftar kelas. Hubungi tisha[dot]melia[at]lecturer[dot]unri[dot]ac[dot]id untuk mendaftar.

Selamat Bekerja!

