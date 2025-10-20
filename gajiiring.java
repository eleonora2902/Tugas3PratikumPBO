
import java.util.Scanner;
public class gajiiring {
    public static void main(String[] args) {
        
    
    Scanner input = new Scanner(System.in);

        System.out.print("Nomor Induk Karyawan: ");
        String nik = input.nextLine();

        System.out.print("Nama Karyawan: ");
        String nama = input.nextLine();

        System.out.print("Alamat: ");
        String alamat = input.nextLine();

        System.out.print("Jabatan: ");
        String jabatan = input.nextLine();

        System.out.print("Gaji Pokok: ");
        double p1 = input.nextDouble();

        System.out.print("Tunjangan Jabatan: ");
        double p2 = input.nextDouble();

        System.out.print("Tunjangan Istri: ");
        double p3 = input.nextDouble();

        System.out.print("Tunjangan Anak: ");
        double p4 = input.nextDouble();

        double totalGaji = p1 + p2 + p3 + p4;
        double pajak = 0.1 * totalGaji;
        double gajiBersih = totalGaji - pajak;

        System.out.println("\n=== RINCIAN GAJI ===");
        System.out.println("Total Gaji     : " + totalGaji);
        System.out.println("Pajak (10%)    : " + pajak);
        System.out.println("Gaji Bersih    : " + gajiBersih);
    }
}
