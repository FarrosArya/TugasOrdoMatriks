import java.util.Scanner;

public class OrdoMatriks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Jumlah Baris : ");
        int baris = input.nextInt();
        System.out.println("Masukkan Jumlah Kolom : ");
        int kolom = input.nextInt();
        int matrix[][] = new int [baris][kolom];

        for(int index = 0; index < matrix.length; index++){
            for(int i = 0; i < matrix[index].length; i++){
                System.out.println("Masukkan Nilai Baris : "+index+" kolom "+i+" : ");
                matrix[index][i] = input.nextInt();
            }
            System.out.println();
        }
        System.out.println("Matriks : ");
        for(int i = 0; i < matrix.length; i++){
            for(int j =0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + ",");

            }
            System.out.println();
        }
 }
}
