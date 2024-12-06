import java.util.Scanner;

public class tugasArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ukuran = input.nextInt();

        switch (ukuran) {
            case 1:
                int [] matrix1 = new int [1];
                matrix1 [0] = input.nextInt();
                int [] transpose = new int [1];
                transpose [0] = matrix1 [0];
                System.out.println(transpose[0]);
            break;
            case 2:
                int baris = 2;
                int kolom = 2;
                int [][]matrix = new int [baris][kolom];
                for (int i = 0; i<baris ; i++){
                    for (int j = 0; j<kolom ; j++){
                        matrix [i][j] = input.nextInt();
                    }
                }
                int [][]transposed = new int [baris][kolom];
                for (int i = 0; i<baris ; i++){
                    for (int j = 0; j<kolom ; j++){
                        transposed [i][j] = matrix[j][i];
                    }
                }
                for (int i = 0; i<baris ; i++){
                    for (int j = 0; j<kolom ; j++){
                        System.out.print(transposed[i][j]+" ");
                    }
                    System.out.println();
                }
            break;

            case 3:
                baris = 3;
                kolom = 3;
                matrix = new int [baris][kolom];
                for (int i = 0; i<baris ; i++){
                    for (int j = 0; j<kolom ; j++){
                        matrix [i][j] = input.nextInt();
                    }
                }
                transposed = new int [baris][kolom];
                for (int i = 0; i<baris ; i++){
                    for (int j = 0; j<kolom ; j++){
                        transposed [i][j] = matrix[j][i];
                    }
                }
                for (int i = 0; i<baris ; i++){
                    for (int j = 0; j<kolom ; j++){
                        System.out.print(transposed[i][j]+" ");
                    }
                    System.out.println();
                }
            break;
            
            default:
                System.out.println("Matriks diluar nalar");
        }
    input.close();
    }
}
