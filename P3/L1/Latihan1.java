package P3.L1;

import java.util.Scanner;

public class Latihan1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String nama;
        int umur;
        double tinggi;
        char Jeniskelamin;
        boolean statusMahasiswa;

        System.out.print("Masukkan nama: ");
        nama = input.nextLine();

        System.out.print("Masukkan umur: ");
        umur = input.nextInt();

        System.out.print("Masukkan tinggi badan (cm): ");
        tinggi = input.nextDouble();

        System.out.print("Masukkan jenis kelamin (L/P): ");
        Jeniskelamin = input.next().charAt(0);

        System.out.print("Apakah Anda Mahasiswa? (true/false): ");
        statusMahasiswa = input.nextBoolean();

        System.out.println("\n--- Data Diri --- ");
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Tinggi Badan: " + tinggi + " cm ");
        System.out.println("Jenis Kelamin: " + Jeniskelamin);
        System.out.println("Status Mahasiswa: " + statusMahasiswa);
        input.close();
    }
}

