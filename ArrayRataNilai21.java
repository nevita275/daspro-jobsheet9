import java.util.Scanner;
public class ArrayRataNilai21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = sc.nextInt();

        int[] nilaiMhs = new int[jumlahMhs];
        double rata2Lulus,rata2TidakLulus;
        double nilaiLulus = 0, nilaiTidakLulus = 0;
    
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Mahasiswa nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();    
        }

        double jumlahLulus = 0, jumlahTidakLulus = 0;
        for (int i = 0; i < nilaiMhs.length; i++) { 
                if (nilaiMhs[i] > 70) {
                    nilaiLulus += nilaiMhs[i];
                    jumlahLulus++;
                } else {
                    nilaiTidakLulus += nilaiMhs[i];
                    jumlahTidakLulus++;   
                }
        }
        rata2Lulus = nilaiLulus/jumlahLulus;
        rata2TidakLulus = nilaiTidakLulus/jumlahTidakLulus;
        System.out.println("Rata-rata nilai lulus = " + rata2Lulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rata2TidakLulus);
       
    }
    
}
