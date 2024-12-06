import java.util.*;

public class sumArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int baris = 2;
        int kolom = 2;
        int [][]matrix1 = new int [baris][kolom];
        int [][]matrix2 = new int [baris][kolom];
        int [][]matrixKali = new int [baris][kolom];

        for (int i = 0; i<baris; i++){
            for (int j = 0; j<kolom; j++){
                matrix1 [i][j]=input.nextInt();
            }
        }

        for (int i = 0; i<baris; i++){
            for (int j = 0; j<kolom; j++){
                matrix2 [i][j]=input.nextInt();
            }
        }


        for (int i = 0 ; i < baris ; i++){
            for (int j = 0 ; j < kolom ; j++){
                for (int k = 0 ; k < kolom ; k++){
                    matrixKali [i][j] += matrix1[i][k]*matrix2[k][j];
                }
            }
        }
        for (int i = 0; i<baris; i++){
            for (int j = 0; j<kolom; j++){
                System.out.print(matrixKali[i][j]+" ");
            }
            System.out.println();
        }
    input.close();
    }
}
