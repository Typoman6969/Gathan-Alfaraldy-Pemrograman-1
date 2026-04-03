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

        System.out.println("Hari Kedua (2):");
        double makanan2, transport2, belanja2;
        System.out.println("Total Biaya Makanan:");
        makanan2 = input.nextDouble();
        System.out.println("Total Biaya Transport:");
        transport2 =  input.nextDouble();
        System.out.println("Total Biaya Belanja:");
        belanja2 = input.nextDouble();

        double total2 = makanan2 + transport2 + belanja2;
        double presentaseMakanan2 = (makanan2 / total2) * 100;
        double presentaseTransport2 = (transport2 / total2) * 100;
        double presentaseBelanja2 = (belanja2 / total2) * 100;

        System.out.println("Hasil Presentase makanan 2:" + presentaseMakanan2 + "%");
        System.out.println("Hasil Presentase transport 2:" + presentaseTransport2 + "%");
        System.out.println("Hasil Presentase belanja 2:" + presentaseBelanja2 + "%");
        input.close();
    }
}