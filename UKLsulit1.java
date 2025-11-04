import java.util.Scanner;

/**
 *
 * @author LOQ
 */
public class UKLsulit1 {

   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlah = input.nextInt();

        double total = 0;
        for (int i = 1; i <= jumlah; i++) {
            System.out.print("Masukkan nilai siswa ke-" + i + ": ");
            double nilai = input.nextDouble();
            total += nilai;
        }

        double rata = total / jumlah;
        System.out.println("Rata-rata nilai siswa adalah: " + rata);
    }
}