package L2;
import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Jumlah Data: ");
        int jumlahData = sc.nextInt();

        if (jumlahData <= 0) {
            System.out.println("Data tidak boleh kosong!");
        }

        int[] DataArray = new int[jumlahData];

        for(int i = 0; i < jumlahData; i++) {
            System.out.print("DataArray[" + i + "] = ");
            DataArray[i] = sc.nextInt();
        }

        System.out.println("....Data Array....");
        for  (int i = 0; i < jumlahData; i++) {
            System.out.println("DataArray[" + i + "] = " + DataArray[i]);
        }

        int maks = DataArray[0];
        for (int i = 1; i < jumlahData; i++) {
            if (DataArray[i] > maks) {
                maks = DataArray[i];
            }
        }

        int min = DataArray[0];
        for(int i = 1; i < jumlahData; i++) {
            if (DataArray[i] < min) {
                min = DataArray[i];
            }
        }

        for(int i = 0; i < jumlahData; i++) {
            for (int j = 0; j < jumlahData - i - 1; j++) {
                if (DataArray[j] > DataArray[j + 1]) {
                    int temp = DataArray[j];
                    DataArray[j] = DataArray[j + 1];
                    DataArray[j + 1] = temp;
                }
            }
        }

        System.out.println("....Hasil Data Array....");
        System.out.println("Nilai Maks: "+ maks);
        System.out.println("Nilai Min: "+ min);

        System.out.println("Dta Terurut: ");
        for (int i = 0; i < jumlahData; i++) {
            System.out.print(DataArray[i]);
            if (i < jumlahData - 1) System.out.print(" , ");
        }
        System.out.println();
        sc.close();
    }
}