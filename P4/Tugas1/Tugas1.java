import java.util.Scanner;

public class Tugas1 {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Hari Pertama (1):");
        double makanan1, transport1, belanja1;
        System.out.println("Total Biaya Makanan:");
        makanan1 = input.nextDouble();
        System.out.println("Total Biaya Transport:");
        transport1 =  input.nextDouble();
        System.out.println("Total Biaya Belanja:");
        belanja1 = input.nextDouble();
        double total1 = makanan1 + transport1 + belanja1;
        double presentaseMakanan1 = (makanan1 / total1) * 100;
        double presentaseTransport1 = (transport1 / total1) * 100;
        double presentaseBelanja1 = (belanja1 / total1) * 100;

        System.out.println("Hasil Presentase makanan 1:" + presentaseMakanan1 + "%");
        System.out.println("Hasil Presentase transport 1:" + presentaseTransport1 + "%");
        System.out.println("Hasil Presentase belanja 1:" + presentaseBelanja1 + "%");
        input.close();
    }
}