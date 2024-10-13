import java.util.*;
public class KalkulatorLegend {
    public static void main(String[] args) {
    Scanner damai = new Scanner (System.in);
    double akhir = 0.0;
        
        while (true){
            String ops = damai.next();
            double angka = damai.nextDouble();

            if (angka == 0){
                break;
            }

            switch (ops) {
                case "TAMBAH":
                    akhir += angka;
                    break;
                case "KURANG":
                    akhir -= angka;
                    break;
                case "KALI":
                    akhir *= angka;
                    break;
                case "BAGI":
                    akhir /= angka;
                    break;
            } 
            
        }
        if (akhir <0){
            akhir += 10;
        } else if (akhir == 0){
            akhir +=20;
        } else if (akhir > 0){
            akhir*=akhir;
        }

        System.out.printf("%.1f\n",akhir);
    }
}
