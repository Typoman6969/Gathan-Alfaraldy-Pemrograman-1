import java.util.Scanner;

public class L1 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        String nama, jenisKelamin, alamat;
        int usia;

        System.out.print("Input nama: ");
        nama = input.nextLine();

        System.out.print("Input usia: ");
        usia = input.nextInt();
        input.nextLine(); 

        System.out.print("Input jenis kelamin: ");
        jenisKelamin = input.nextLine();

        System.out.print("Input alamat: ");
        alamat = input.nextLine();

        String kategori;
        if (usia < 18) {
            kategori = "Remaja";
        } else {
            kategori = "Dewasa";
        }

        System.out.println("\n=== DATA DIRI MAHASISWA UNPAM ===");
        System.out.println("Nama Mahasiswa          : " + nama);
        System.out.println("Usia Mahasiswa          : " + usia);
        System.out.println("Kategori Mahasiswa      : " + kategori);
        System.out.println("Kelamin Mahasiswa       : " + jenisKelamin);
        System.out.println("Alamat Mahasiswa        : " + alamat);

        input.close();
    }
}