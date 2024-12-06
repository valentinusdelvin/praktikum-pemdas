import java.util.Scanner;

public class faktorialgede {
    public static void main(String[] args) {
        Scanner braws = new Scanner(System.in);
        final int max_n = 2000000;
        final int moduler = 1000000007;

        long [] factorial = new long[max_n + 1];
        factorial [0] = 1;
        for (int i = 1 ; i <= max_n ; i++){
            factorial [i] = (factorial[i-1]*i)%moduler;
        }

        int index = braws.nextInt();
        int [] matrIndex = new int[index];
        for (int i = 0 ; i < index ; i++){
            matrIndex [i] = braws.nextInt();
        }

        StringBuilder output = new StringBuilder();
        for (int n : matrIndex){
            output.append(factorial[n]).append("\n");
        }
        System.out.println(output);

        braws.close();
    }

}
