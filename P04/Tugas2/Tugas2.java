package Tugas2;
import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Program Menghitung Luas dan Keliling Persegi Panjang");

        System.out.println("Masukkan Panjang: ");
        double panjang = input.nextDouble();

        System.out.println("Masukkan Lebar: ");
        double lebar = input.nextDouble();

        double luas = panjang * lebar;
        double keliling = 2 * (panjang + lebar);

        System.out.println("\nHasil Perhitungan: ");
        System.out.println("Luas = "+ luas);
        System.out.println("Keliling = "+ keliling);
        
        input.close();

    }
}
