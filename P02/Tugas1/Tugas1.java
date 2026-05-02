import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        String NamaLengkap, Universitas;
        int Umur;
        
        System.out.print("Masukkan Nama Lengkap Anda: ");
        NamaLengkap = inputScanner.nextLine();

        System.out.print("Masukkan Umur Anda: ");
        Umur = inputScanner.nextInt();
        inputScanner.nextLine(); 

        System.out.print("Masukkan Universitas Anda: ");
        Universitas = inputScanner.nextLine();

        System.out.println("===============================");
        System.out.println("Data Diri Mahasiswa ");
        System.out.println("===============================");
        System.out.println("Nama Lengkap: " + NamaLengkap);
        System.out.println("Umur: " + Umur);
        System.out.println("Universitas: " + Universitas);
        inputScanner.close();
    }
}