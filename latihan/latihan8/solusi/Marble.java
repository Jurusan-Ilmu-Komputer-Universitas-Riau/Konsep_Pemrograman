/**
 *  Nama   : 
 *  Kelas  : Konsep Pemrograman 
 *  Tanggal: 
 *
 *  Latihan 4: Program ini menemukan angka maksimum dari 5 angka
 */


/**
 *
 * @author tisha
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
        int max = input1; //inisialisasi nilai maksimum sebagai angka 1
        max = max < input2 ? input2 : max; //cek apakah angka 2 lebih besar dari maksimum
        max = max < input3 ? input3 : max; //cek apakah angka 3 lebih besar dari maksimum
        max = max < input4 ? input4 : max; //cek apakah angka 4 lebih besar dari maksimum
        max = max < input5 ? input5 : max; //cek apakah angka 5 lebih besar dari maksimum
        
        return max;
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
        int min = input1; //inisialisasi nilai minimum sebagai angka 1
        min = min > input2 ? input2 : min; //cek apakah angka 2 lebih kecil dari minimum
        min = min > input3 ? input3 : min; //cek apakah angka 3 lebih kecil dari minimum
        min = min > input4 ? input4 : min; //cek apakah angka 4 lebih kecil dari minimum
        min = min > input5 ? input5 : min; //cek apakah angka 5 lebih kecil dari minimum
        
        return min;
    }
}
