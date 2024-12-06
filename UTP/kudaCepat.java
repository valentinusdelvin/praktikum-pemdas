import java.util.*;

public class kudaCepat {
    public static void main(String[] args) {
        Scanner braws = new Scanner (System.in);
        String kuda1 = braws.nextLine();
        int time1 = braws.nextInt();
        braws.nextLine();
        String kuda2 = braws.nextLine();
        int time2 = braws.nextInt();
        braws.nextLine();
        String kuda3 = braws.nextLine();
        int time3 = braws.nextInt();
        String kudacepat1;
        String kudacepat2;
        String kudacepat3;
        braws.close();
        
        double lapangan = 2.4; 
        double speed1 = (lapangan/time1)*3600;
        double speed2 = (lapangan/time2)*3600;
        double speed3 = (lapangan/time3)*3600;

        if (speed1>speed2 && speed1 > speed3){
            if (speed2>speed3){
                kudacepat1 = kuda1;
                kudacepat2 = kuda2;
                kudacepat3 = kuda3;
                System.out.printf("Kuda tercepat pertama adalah %s dengan kecepatan %.2f km/jam%n", kudacepat1, speed1);
                System.out.printf("Kuda tercepat kedua adalah %s dengan kecepatan %.2f km/jam%n", kudacepat2, speed2);
                System.out.printf("Kuda tercepat ketiga adalah %s dengan kecepatan %.2f km/jam%n", kudacepat3, speed3);
            } else{
                kudacepat1 = kuda1;
                kudacepat2 = kuda3;
                kudacepat3 = kuda2;
                System.out.printf("Kuda tercepat pertama adalah %s dengan kecepatan %.2f km/jam%n", kudacepat1, speed1);
                System.out.printf("Kuda tercepat kedua adalah %s dengan kecepatan %.2f km/jam%n", kudacepat2, speed3);
                System.out.printf("Kuda tercepat ketiga adalah %s dengan kecepatan %.2f km/jam%n", kudacepat3, speed2);
            }
        } else if (speed2>speed1 && speed2>speed3){
            if (speed1>speed3){
                kudacepat1 = kuda2;
                kudacepat2 = kuda1;
                kudacepat3 = kuda3;
                System.out.printf("Kuda tercepat pertama adalah %s dengan kecepatan %.2f km/jam%n", kudacepat1, speed2);
                System.out.printf("Kuda tercepat kedua adalah %s dengan kecepatan %.2f km/jam%n", kudacepat2, speed1);
                System.out.printf("Kuda tercepat ketiga adalah %s dengan kecepatan %.2f km/jam%n", kudacepat3, speed3);
            } else {
                kudacepat1 = kuda2;
                kudacepat2 = kuda3;
                kudacepat3 = kuda1;
                System.out.printf("Kuda tercepat pertama adalah %s dengan kecepatan %.2f km/jam%n", kudacepat1, speed2);
                System.out.printf("Kuda tercepat kedua adalah %s dengan kecepatan %.2f km/jam%n", kudacepat2, speed3);
                System.out.printf("Kuda tercepat ketiga adalah %s dengan kecepatan %.2f km/jam%n", kudacepat3, speed1);
            }
        } else if(speed3>speed1 && speed3>speed2){
            if (speed1>speed2){
                kudacepat1 = kuda3;
                kudacepat2 = kuda1;
                kudacepat3 = kuda2;
                System.out.printf("Kuda tercepat pertama adalah %s dengan kecepatan %.2f km/jam%n", kudacepat1, speed3);
                System.out.printf("Kuda tercepat kedua adalah %s dengan kecepatan %.2f km/jam%n", kudacepat2, speed1);
                System.out.printf("Kuda tercepat ketiga adalah %s dengan kecepatan %.2f km/jam%n", kudacepat3, speed2);
            } else{
                kudacepat1 = kuda3;
                kudacepat2 = kuda2;
                kudacepat3 = kuda1;
                System.out.printf("Kuda tercepat pertama adalah %s dengan kecepatan %.2f km/jam%n", kudacepat1, speed3);
                System.out.printf("Kuda tercepat kedua adalah %s dengan kecepatan %.2f km/jam%n", kudacepat2, speed2);
                System.out.printf("Kuda tercepat ketiga adalah %s dengan kecepatan %.2f km/jam%n", kudacepat3, speed1);
            }
        } 
    }
}
