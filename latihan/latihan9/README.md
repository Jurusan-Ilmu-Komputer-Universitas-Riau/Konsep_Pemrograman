#Latihan 9

Buatlah sebuah program untuk menghitung pajak penghasilan (PPh) pegawai tetap dengan ketentuan sebagai berikut: 
- Informasi yang diterima adalah: 
    1. Jumlah penghasilan kumulatif satu tahun (int)
    2. Status perkawinan (K/TK), K=Kawin dan TK=Tidak Kawin
    3. Jumlah tanggungan (0-3)
- Penghasilan Tidak Kena Pajak (PTKP) adalah nilai yang harus dikurang dari total penghasilan satu tahun sebelum dilakukan penghitungan pajak, dimana jumlahnya tergantung status perkawinan dan jumlah tanggungan sebagai berikut:

| Status Perkawinan  | Jumlah Tanggungan  | Jumlah PTKP |
| ------------------ | ------------------ | ------------|
| Tidak Kawin        | 0                  | 54.000.000  |
| Tidak Kawin        | 1                  | 58.500.000  |
| Tidak Kawin        | 2                  | 63.000.000  |
| Tidak Kawin        | 3                  | 67.500.000  |
| Kawin              | 0                  | 58.500.000  |
| Kawin              | 1                  | 63.000.000  |
| Kawin              | 2                  | 67.500.000  |
| Kawin              | 3                  | 72.000.000  |

- Setelah dikurang PTKP, penghasilan setahun menjadi Penghasilan Kena Pajak (PKP). Untuk menghitung besaran pajak, PKP dikalikan dengan tarif pajak seperti berikut:

| PKP (Penghasilan Setahun - PTKP)                     | Tarif Pajak |
| ---------------------------------------------------- | ----------- |
| Sampai dengan Rp 50.000.000                          | 5%          |           
| Di atas Rp 50.000.000 sampai dengan Rp 250.000.000   | 15%         |
| Di atas Rp 250.000.000 sampai dengan Rp 500.000.000  | 25%         |
| Di atas Rp 500.000.000                               | 30%         |

Berikut tiga contoh kasus perhitungan besar pajak:
- Jika penghasilan setahun Rp. 150.000.000, status tidak kawin dan tidak ada tanggungan, maka besar pajak adalah Rp. 14.400.000
- Jika penghasilan setahun Rp. 150.000.000, status tidak kawin dan ada 3 orang tanggungan, maka besar pajak adalah Rp. 12.375.000
- Jika penghasilan setahun Rp. 150.000.000, status kawin dan ada 3 orang tanggungan, maka besar pajak adalah Rp. 11.700.000


Gunakan template program di bawah untuk menuliskan jawaban anda. Anda hanya perlu menyelesaikan kode untuk menghitung besaran pajak melalui calculateTax. Fungsi ini menerima 3 masukan, yaitu:
- annualSalary, gaji dalam setahun 
- marriageStatus, status pernikahan: TK=Tidak Kawin atau K=Kawin
- dependentNum, jumlah tanggungan (minimum 0 dan maksimum 3)
Fungsi ini akan mengembalikan perhitungan besaran pajak yang harus dibayar

```
/**
 *  Nama   : 
 *  Kelas  : Konsep Pemrograman 
 *  Tanggal: 
 *
 *  Latihan 9: Program ini menghitung besaran pajak
 */

/**
 * Kelas ini digunakan untuk menghitung besaran pajak
 * 
 */
public class TaxCalculator {
    final static int ADDITION_PER_DEPENDENT = 4500000;
    final static int PTKP_NOTMARRIED = 54000000;
    final static int PTKP_MARRIED = 58500000;
    
    public static void main(String[] args) {
        
        //Penghitungan pajak kasus 1
        int tax = calculateTax(150000000, "TK", 0);
        System.out.println(tax);
        
        //Penghitungan pajak kasus 2
        tax = calculateTax(150000000, "TK", 3);
        System.out.println(tax);
        
        //Penghitungan pajak kasus 2
        tax = calculateTax(150000000, "K", 3);
        System.out.println(tax);
    }

    /**
     * Kode ini menghitung besaran pajak, dimana menerima masukan 3 variabel dan 
     * mengembalikan jumlah pajak yang harus dibayar
     * @param annualSalary gaji dalam setahun 
     * @param marriageStatus status pernikahan, TK=Tidak Kawin atau K=Kawin
     * @param dependentNum jumlah tanggungan, minimum 0 dan maksimum 3
     * @return Besaran pajak yang harus dibayar
     */
    public static int calculateTax(int annualSalary, String marriageStatus, int dependentNum){
        int tax = 0; //variabel untuk menghitung pajak
        
        //Selesaikan implementasi penghitungan besaran pajak

        return tax;
    }
}


```
Kumpulkan jawaban anda via CodePost](https://www.codepost.io/) dengan nama tugas: Hitung pajak. Agar dapat mengumpulkan latihan melalui autograder codepost, ikuti tutorial [berikut](https://github.com/Jurusan-Ilmu-Komputer-Universitas-Riau/Modul_Belajar_Pemrograman/tree/main/codepost).


Selamat Bekerja!

