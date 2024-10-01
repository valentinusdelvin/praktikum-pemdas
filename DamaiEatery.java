import java.util.*;

public class DamaiEatery {
    public static void main(String[] args) {
        //Saldo awal & Scanner
        int Total = 0;
        int HargaMakan = 0;
        int HargaMinum = 0;
        int order = 0;
        int jumlah = 0;
        int uangBayar=0;
        Scanner damai = new Scanner(System.in);

        //Stage Makan
        System.out.println("SELAMAT DATANG DI DAMAI'S EATERY");
        System.out.println("LIST MAKANAN: ");
        System.out.println("1. Nasi Lalapan 13.000");
        System.out.println("2. Mi ayam 9.000");
        System.out.println("3. Nasi Campur 10.000");
        System.out.println("4. Nasi Pecel 10.000");
        System.out.println("0. Keluar");

        while (true) {
            System.out.println("Pilih order dan masukkan jumlah:");
            order = damai.nextInt();
            if (order==0){
                break;
            }

            switch (order) {
                case 1:
                    HargaMakan = 13000;
                    break;
                case 2:
                    HargaMakan = 9000;
                    break;
                case 3:
                    HargaMakan = 10000;
                    break;
                case 4:
                    HargaMakan = 10000;
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
                    continue;
            }

            jumlah = damai.nextInt();
            Total += (HargaMakan*jumlah);
        } 

        //Stage Minum
        System.out.println("LIST MINUMAN: ");
        System.out.println("1. Teh 5.000");
        System.out.println("2. Jeruk 6.000");
        System.out.println("3. Susu 8.000");
        System.out.println("0. Keluar");

        while (true) {
            System.out.println("Pilih order dan masukkan jumlah:");
            order = damai.nextInt();
            if (order==0){
                break;
            }

            switch (order) {
                case 1:
                    HargaMinum = 5000;
                    break;
                case 2:
                    HargaMinum = 6000;
                    break;
                case 3:
                    HargaMinum = 8000;
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
                    continue;
            }
        
            jumlah = damai.nextInt();
            Total += HargaMinum*jumlah;
        } 

        //Stage Bayar
        System.out.println("Total belanja: " + Total);
        System.out.println("Masukkan uang untuk membayar:");

        //Stage Bayar - Uang Kurang
        while (uangBayar<Total) {
            uangBayar += damai.nextInt();
            if (uangBayar<Total){
                int kurang = Total-uangBayar;
                System.out.println("Uang yang dimasukkan kurang " + kurang + ". Masukkan uang lagi:");
            }
        }
        //Stage Bayar - Kembalian
            int kembalian = uangBayar-Total;
            if (kembalian>0){
            System.out.println("Kembalian: "+ kembalian);
            }
        
        //Stage Terima Kasih
        System.out.println("TERIMA KASIH TELAH BERBELANJA DI DAMAI'S EATERY");
        damai.close();
    }
}
