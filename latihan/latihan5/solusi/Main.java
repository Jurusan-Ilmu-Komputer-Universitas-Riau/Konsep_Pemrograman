import java.util.Scanner;  

public class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  //Buat scanner
    System.out.println("Masukkan nama anda!");

    String name = myObj.nextLine();  //Baca input
    System.out.println("Username is: " + name);  
  }
}