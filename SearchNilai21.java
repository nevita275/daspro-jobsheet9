import java.util.Scanner;
public class SearchNilai21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai yang akan diinput: ");
        int nilai = sc.nextInt();

        int[] nilaiMhs = new int [nilai];
       
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            nilaiMhs[i] = sc.nextInt();
        }
        System.out.print("Masukkan nilai yang ingin dicari: ");
        int nilaiDicari = sc.nextInt();

        int indeks = -1;
        for (int i = 1; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] == nilaiDicari) {
                indeks = i;
                break;
            }
        }
        if (indeks != -1) {
            System.out.println("Nilai " + nilaiDicari + " ketemu, merupakan nilai mahasiswa ke-" + (indeks+1));
        }else {
            System.out.println("Nilai yang dicari tidak ditemukan");
        }
    }
    
}
