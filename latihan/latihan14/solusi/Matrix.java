/**
 *  Nama   : 
 *  Kelas  : Konsep Pemrograman 
 *  Tanggal: 
 *
 *  Latihan 14: Program ini akan mencetak angka yang berada pada dan di atas garis diagonal
 */

public class Matrix {

    public static void main(String[] args) {
        //Deklarasikan array 2 dimensi
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        //Cetak array (diagonal atas)
        upperDiagonal(arr);
    }
    
    public static void upperDiagonal(int input[][]){
        
       for(int i = 0; i < input.length; i++){ //mengunjungi tiap baris
           for(int j = 0; j < (input[i].length - i); j++){ //mengunjungi kolom sampai diagonal
               System.out.println(input[i][j]);
           }
       }
       
    }
}
