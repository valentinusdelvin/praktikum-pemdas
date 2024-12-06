import java.util.*;

public class dominows {
    public static void main(String[] args) {
        Scanner braws = new Scanner(System.in);
        String board = braws.nextLine();
        String [] strBoard = board.split(" ");
        int [] intBoard = new int[strBoard.length];

        for (int i = 0 ; i < intBoard.length; i++){
            intBoard [i] = Integer.parseInt(strBoard[i]);
        }
        int area = intBoard[0]*intBoard[1];
        int jumlah = area/2;
        System.out.println(jumlah);
        braws.close();
    }
}
