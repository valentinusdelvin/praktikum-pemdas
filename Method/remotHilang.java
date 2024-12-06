import java.util.Scanner;

public class remotHilang {
    static boolean kondisiTV = false;
    static boolean kondisiMute = false;
    static int channel = 1;
    static int volume = 50;
    static int prevChannel = 0;
    public static void main(String[] args) {
        Scanner braws = new Scanner(System.in);
        kondisiTV = false;

        while(true){
            String command = braws.nextLine().toUpperCase();
            if (command.equals("POWER")) {
                if (kondisiTV) { // Menggunakan perbandingan `==` atau langsung `if (kondisiTV)`
                    powerOff();
                    break; // Keluar dari loop saat TV dimatikan
                } else {
                    powerOn();
                }
            } else if (kondisiTV == true) { // Mengecek apakah TV dalam kondisi menyala
                execute(command);
            }
        }
        braws.close();
    }

    public static void powerOff(){
        kondisiTV = false;
        System.out.println("TV OFF");
    }
    public static void powerOn(){
        kondisiTV = true;
        System.out.println("TV ON");
    }
    public static void execute (String command){
        //FUNGSI CHANNEL UP
        if (command.equals("CHANNEL UP")){
            prevChannel = channel;
            channel++;
            if (channel>30){
                channel = 30;
                System.out.println("Channel tidak valid");
            } else {
                printChannel(channel);
            }
        } 
        //FUNGSI CHANNEL DOWN
        else if (command.equals("CHANNEL DOWN")){
            prevChannel = channel;
            channel--;
            if (channel<1){
                channel = 1;
                System.out.println("Channel tidak valid");
            } else {
                printChannel(channel);
            }
        } 
        //FUNGSI CHANNEL + ANGKA
        else if (command.startsWith("CHANNEL")){
            int newChannel = Integer.parseInt(command.substring(8));
            prevChannel = channel;
            if (newChannel >= 1 && newChannel <= 30){
                channel = newChannel;
                printChannel(channel);
            }
            else {
                System.out.println("Channel yang dimasukkan tidak valid");
            }
        } 
        //FUNGSI PREVCHANNEL
        else if (command.equals("PREV CHANNEL")){
            channel = prevChannel;
            printChannel(channel);
        } 
        //FUNGSI VOLUME UP
        else if (command.equals("VOLUME UP")){
            if (kondisiMute = true){
                kondisiMute = false;
            }
            volume +=5;
            if (volume <= 100){
                printVolume(volume);;
            } else {
                volume = 100;
                System.out.println("Volume tidak valid");
            }
        } 
        //FUNGSI VOLUME DOWN
        else if (command.equals("VOLUME DOWN")){
            if (kondisiMute = true){
                kondisiMute = false;
            }
            volume -= 5;
            if (volume >=0){
                printVolume(volume);
            } else {
                volume = 0;
                System.out.println("Volume tidak valid");
            }
        }
        //FUNGSI MUTE
        else if (command.equals("MUTE")){
            kondisiMute = true;
            System.out.println("Volume mute");
        }
        //FUNGSI UNMUTE
        else if (command.equals("UNMUTE")){
            kondisiMute = false;
            printVolume(volume);
        }
    }
    public static void printChannel (int channel){
        System.out.printf("Channel sekarang: %d\n", channel);
    }
    public static void printVolume (int volume){
        System.out.printf("Volume sekarang: %d\n", volume);
    }
}
