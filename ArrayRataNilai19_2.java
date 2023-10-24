import java.util.Scanner;

public class ArrayRataNilai19_2 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int countLulus = 0;
        int countTdkLulus = 0;
        double totalLulus = 0;
        double totalTdkLulus = 0;
        double rataLulus;
        double rataTdkLulus;
        int size;
        System.out.print("Masukkan jumlah mahasiswa: ");
        size = sc.nextInt();
        int[] nilaiMhs = new int[size];

        for(int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
        }
        
        for(int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                countLulus++;
            } else {
                totalTdkLulus += nilaiMhs[i];
                countTdkLulus++;
            }
        }

        rataLulus = totalLulus/countLulus;
        System.out.println("Rata-rata nilai lulus = "+rataLulus);
        rataTdkLulus = totalTdkLulus/countTdkLulus;
        System.out.println("Rata-rata nilai tidak lulus =" + rataTdkLulus);
    }
}
    