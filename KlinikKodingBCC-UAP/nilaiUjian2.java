import java.util.*;

public class nilaiUjian2 {
    public static void main(String[] args) {
        Scanner braws = new Scanner(System.in);
        String name = braws.nextLine();
        String result = braws.nextLine();
        int [] numResult = new int[5];
        String [] StrResult = result.split(" ");

        for (int i = 0; i<numResult.length; i++){
            numResult [i] = Integer.parseInt(StrResult[i]);
        }

        double nilaiAkhir = ((0.1)*numResult[0]) + ((0.2)*numResult[1]) + ((0.3)*numResult[2]) + ((0.3)*numResult[3]) + ((0.1)*numResult[4]);

        System.out.printf("Nilai akhir %s adalah %.2f", name, nilaiAkhir);

    }
}
