import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah kehadiran: ");
        int kehadiran = input.nextInt();
        System.out.print("Masukkan nilai akhir: ");
        int nilaiAkhir = input.nextInt();

        int p = 21 * 75/100;

        if (kehadiran >= p) {
            System.out.println("Anda memenuhi syarat kehadiran.");
            System.out.println("Nilai anda adalah: " + nilaiAkhir);
            
            if (nilaiAkhir >= 80) {
                System.out.println("Grade: A.");
            } else if (nilaiAkhir >= 70) {
                System.out.println("Grade: B.");
            } else if (nilaiAkhir >= 60) {
                System.out.println("Grade: C.");
            } else if (nilaiAkhir >= 55) {
                System.out.println("Grade: D.");
            }else if (nilaiAkhir < 55) {
                System.out.println("Grade: E.");
            } else {
                input.close();
            }
        }
    }
}