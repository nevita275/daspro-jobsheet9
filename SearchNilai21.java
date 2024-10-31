import java.util.Scanner;
public class SearchNilai21 {
    public static void main(String[] args) {
        int[] arrNilai = {80, 85, 78, 96, 90, 82, 86};
        int key = 90;
        int indeks = -1;

        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                indeks = i;
                break;
            }
        }
        if (indeks != -1) {
            System.out.println("Nilai " + key + " ketemu di indeks ke-" + indeks);
        }else {
            System.out.println("Nilai " + key + " tidak ditemukan" );
        }
    }
    
}
