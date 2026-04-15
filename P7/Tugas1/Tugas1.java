package P7.Tugas1;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Pilih menu (1. pengeluaran 7 hari | 2. Cek Kelulusan): ");
        int pilihan = in.nextInt();

        if (pilihan == 1) {
            String[] nama = {"Makanan", "Transport", "Belanja"};
            double[] biaya = new double[3];

            for (int i = 1; i <= 7; i++) {
                System.out.println("Hari ke-" + i + "---");
                double total = 0;

                for (int j = 0; j < 3; j++) {
                    System.out.print("Biaya " + nama[j] + ": ");
                    biaya[j] = in.nextDouble();
                    total += biaya[j];
                }

                if (total > 0) {
                    System.out.printf("Persentase -> Makanan: %.1f%% | Transport: %.1f%% | Belanja: %.1f%%\n",(biaya [0]/total)*100, (biaya[1]/total)*100, (biaya[2]/total)*100);
                }
            }
        } else if (pilihan == 2) {
            System.out.print("\nMasukkan jumlah kehadiran & nilai akhir (pisahkan dengan spasi): ");
            int hadir = in.nextInt(), nilai = in.nextInt();

            if (hadir >= (21 * 75 / 100)) {
                char grade = nilai >= 80 ? 'A' : nilai >= 70 ? 'B' : nilai >= 60 ? 'C' : nilai >= 55 ? 'D' : 'E';
                System.out.println(" Syarat kehadiran terpenuhi. Nilai: " + nilai + " (Grade" + grade + ")");
            } else {
                System.out.println("Maaf, tidak memenuhi syarat kehadiran. ");
            }

            in.close();
        }
    }
}