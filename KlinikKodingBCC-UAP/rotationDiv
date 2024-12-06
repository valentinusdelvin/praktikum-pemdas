import java.util.*;

public class rotationDiv {
    public static void main(String[] args) {
        Scanner braws = new Scanner(System.in);
        String size = braws.nextLine();
        String [] strSize = size.split(" ");
        int [] intSize = new int[strSize.length];
        for (int i = 0 ; i<strSize.length ; i++){
            intSize [i] = Integer.parseInt(strSize[i]);
        }

        String [][] str_matrix = new String[intSize[0]][intSize[1]];

        for (int i = 0; i< str_matrix.length; i++){
            String input = braws.nextLine();
            String [] in_input = input.split(" ");
                for (int j = 0 ; j < str_matrix [i].length; j++){
                    str_matrix [i][j] = in_input [j];
                }
        }

        int [][] int_matrix = new int[intSize[0]][intSize[1]];

        for (int i = 0; i< int_matrix.length; i++){
            for (int j = 0 ; j < int_matrix [i].length; j++){
                int_matrix [i][j] = Integer.parseInt(str_matrix[i][j]);
            }
        }

        int [][]rotate = new int[intSize[1]][intSize[0]];
        for (int i = 0 ; i<rotate.length ; i++){
            for (int j = rotate[i].length-1 ; j>=0 ; j--){
                rotate [i][j] = int_matrix[j][i];
                System.out.print(rotate [i][j] + " ");
            }
            System.out.println();
        }
        braws.close();
    }
}
