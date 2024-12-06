import java.util.Scanner;

public class primeApps {
    public static void main(String[] args) {
        Scanner braws = new Scanner(System.in);
        int batas = braws.nextInt();
        int done = 0;
        int start = 2;

        while (done<batas){
            if (cekPrima(start)){
                System.out.print(start + " ");
                done++;
            }
            start++;
        }
        braws.close();
    }

    public static boolean cekPrima(int number){
        if (number < 2){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}
