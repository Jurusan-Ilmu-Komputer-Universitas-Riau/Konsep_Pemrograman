/**
 *  Nama   : 
 *  Kelas  : Konsep Pemrograman 
 *  Tanggal: 
 *
 *  Latihan 11: Program ini memeriksa apabila sebuah bilangan merupakan bilangan prima atau tidak
 */


public class Number {

    public static void main(String[] args) {
        //cek bilangan prima
        System.out.println(checkPrime(10));
        System.out.println(checkPrime(5));
        System.out.println(checkPrime(2));
        System.out.println(checkPrime(1));
    }
    
    /**
     * Fungsi ini memeriksa apabila sebuah bilangan merupakan bilangan prima atau tidak
     * @param input bilangan masukan
     * @return true apabila benar bilangan masukan adalah bilangan prima dan false apabila
     * bukan bilangan prima
     */
    public static boolean checkPrime(int input){

        //Cek apabila bilangan dapat dibagi dengan 2-(bilangan masukan-1)
        for(int i = 2; i<input; i++){
            if(input % i == 0){
                return false; //dapat habis dibagi selain 1 dan bilangan tersebut
                             //sehingga bukan bilangan prima
            }
        }
        return true; //bilangan prima
    }
}
