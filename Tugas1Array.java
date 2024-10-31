import java.util.Scanner;
public class Tugas1Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rata2;

        System.out.print("Masukkan jumlah mahasiswa:");
        int jumlahMhs = sc.nextInt();
        
        int[] nilai = new int[jumlahMhs];

        System.out.println("Masukkan nilai setiap mahasiswa: ");
        for (int i = 0; i < jumlahMhs; i++) {
            System.out.print("Mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }
        System.out.println("Nilai-nilai mahasiswa:");
        for (int i = 0; i < jumlahMhs; i++) {
            System.out.print(nilai[i] + " ");
        }
        int totalNilai = 0;
        for (int nilaiMahasiswa : nilai) {
            totalNilai += nilaiMahasiswa;
        }
        rata2 = totalNilai / jumlahMhs;
        System.out.println("\nNilai rata-rata: " + rata2);

        int nilaiTertinggi = nilai[0];
        int nilaiTerendah = nilai[0];
        for (int i = 1; i < jumlahMhs; i++) {
            if (nilai[i] > nilaiTertinggi) {
                nilaiTertinggi = nilai[i];
            }
            if (nilai[i] < nilaiTerendah) {
                nilaiTerendah = nilai[i];
            }
        }
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah); 
    }   
}
