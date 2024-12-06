import java.util.Scanner;

public class UBMager {
    public static void main(String[] args) {
        double totalKM = 0;
        Scanner braws = new Scanner(System.in);
        System.out.println("----------------------------------------------------");
        System.out.println("UB MAGER");
        System.out.println("----------------------------------------------------");
        System.out.println("Masukkan total hari yang ingin direkap :");
        double jumlahHari = braws.nextDouble();
        for (int i = 1; i <= jumlahHari; i++){
            System.out.printf("Hari ke %d\n", i);
            System.out.println("Jumlah order :");
            double jumlahOrder = braws.nextDouble();
            for (int j = 1; j <= jumlahOrder; j++){
                System.out.printf("Order ke - %d :\n", j);
                double jumlahKM = braws.nextDouble();
                totalKM += jumlahKM;
            }
        }
        System.out.println("----------------------------------------------------");
        rekap(totalKM);
        braws.close();
    }
    public static void rekap (double totalKM){
        System.out.printf("Total Km     = %.0f\n", totalKM);
        System.out.printf("Biaya Total  = Rp%.0f\n", totalKM*2000);
        System.out.printf("Pendapatan   = Rp%.0f\n", (totalKM*2000)*0.8);
        System.out.printf("Potongan     = Rp%.0f\n", (totalKM*2000)*0.2);
    }
}
