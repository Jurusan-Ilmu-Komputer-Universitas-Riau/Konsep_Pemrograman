/**
 *  Nama   : 
 *  Kelas  : Konsep Pemrograman 
 *  Tanggal: 
 *
 *  Latihan 2: Program ini menerima masukan sebuah bilangan bulat, kemudian
 *             akan menampilkan apakah bilangan tersebut ganjil atau genap
 */



/**
 *
 * @author tisha
 */
public class NumberTest {

    public static void main(String[] args) {
        checkEvenOdd(5);
        checkEvenOdd(10);
        checkEvenOdd(0);
        checkEvenOdd(-2);
    }
    
    public static void checkEvenOdd(int input){
        Boolean isEven = (input % 2) == 0;
        System.out.println(input + " adalah genap: " + isEven + ", ganjil: " + !isEven);
    }
}


