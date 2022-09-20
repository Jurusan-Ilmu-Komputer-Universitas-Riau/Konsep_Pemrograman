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
import java.util.Scanner;

public class TaxCalculator {
    final static int ADDITION_PER_DEPENDENT = 4500000;
    final static int PTKP_NOTMARRIED = 54000000;
    final static int PTKP_MARRIED = 58500000;
    
    public static void main(String[] args) {
        
        int salary, dependent;
        String status;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah gaji setahun: ");
        salary = input.nextInt();

        System.out.print("Masukkan jumlah tanggungan: ");
        dependent = input.nextInt();
        input.nextLine();

        System.out.print("Masukkan status perkawinan: ");
        status = input.nextLine();

        System.out.println("Gaji: " + salary);
        System.out.println("Tanggungan: " + status);
        System.out.println("Status Perkawinan: " + dependent);

        int curTax = calculateTax(salary, status, dependent);
        System.out.println("Pajak: " + curTax);
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
        int PKP = 0; //Pendapatan kena pajak
        
        //Memastikan jumlah tanggungan dalam rentang 0-3
        dependentNum = dependentNum > 3 ? 3 : dependentNum;
        dependentNum = dependentNum < 0 ? 0 : dependentNum;
            
        //Menghitung PKP/Pendapatan Kena pajak
        if(marriageStatus.equals("TK")){ //penghitungan pajak bagi yang belum kawin
           
            //Menghitung PTKP (Pendapatan Tidak Kena Pajak)
            int ptkp = PTKP_NOTMARRIED + (dependentNum * ADDITION_PER_DEPENDENT);
            PKP = annualSalary - ptkp;
            
        }else if(marriageStatus.equals("K")){ //penghitungan pajak bagi yang sudah kawin
            
            //Menghitung PTKP (Pendapatan Tidak Kena Pajak)
            int ptkp = PTKP_MARRIED + (dependentNum * ADDITION_PER_DEPENDENT);
            PKP = annualSalary - ptkp;
        }
        
        //Perhitungan pajak berdasarkan tarif pajak
        if(PKP <= 50000000 && PKP > 0){
            tax = 5 * PKP / 100;
        }else if (PKP > 50000000 && PKP <= 250000000){
            tax = 15 * PKP / 100;
        }else if (PKP > 250000000 && PKP <= 500000000){
            tax = 25 * PKP / 100;
        }else if (PKP > 500000000){
            tax = 35 * PKP / 100;
        }
        return tax;
    }
}
