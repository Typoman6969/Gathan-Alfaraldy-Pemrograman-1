package P08.Tugas3;

import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulang;
        double total = 0;
        int jumlahData = 0;

        do {
            System.out.print("Masukkan Nilai Mahasiswa: ");
            double nilai = input.nextDouble();
            input.nextLine();

            total += nilai;
            jumlahData++;

            System.out.println("Nilai yang diinput: " + nilai);

            System.out.print("Tambah nilai lagi? (y/t): ");
            ulang = input.next().charAt(0);
            input.nextLine();

        } while (ulang == 'y' || ulang == 'Y');

        double rataRata = total / jumlahData;

        System.out.println("=========================================");
        System.out.println("Jumlah Data : " + jumlahData);
        System.out.println("Total Nilai : " + total);
        System.out.println("Rata-rata: " + rataRata);
        System.out.println("==========================================");
        System.out.println("Program selesai. Terima kasihh!");
        input.close();
    }
}
