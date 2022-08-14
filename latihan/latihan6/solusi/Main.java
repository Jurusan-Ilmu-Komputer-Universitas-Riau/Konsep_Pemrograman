import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    System.out.println("Masukkan nama dan umur:");

    // String input
    String name = myObj.nextLine();

    // Numerical input
    int age = myObj.nextInt();

    //Print user input
    System.out.println("Nama: " + name);
    System.out.println("Umur: " + age);
  }
}