package P08.Tugas1;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulang;

        do {
            System.out.print("Masukkan Nilai Mahasiswa: ");
            double nilai = input.nextDouble();
            input.nextLine();

            System.out.println("Nilai yang diinput: " + nilai);

            System.out.print("Ulangi? (y/t): ");
            ulang = input.next().charAt(0);
            input.nextLine();

        } while (ulang == 'y' || ulang == 'Y' );

        System.out.println("Program selesai. Terima Kasih!");
        input.close();
    }
}
