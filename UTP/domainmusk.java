import java.util.*;

public class domainmusk {
    public static void main(String[] args) {
        Scanner braws = new Scanner(System.in);
        String oldEmail = braws.next();
        String newName = braws.next();
        String company = braws.next();
        int price = braws.nextInt();
        String domain = "";
        int startIndex = 0;
        double finalPrice = 0;

        for (int i = oldEmail.length()-1 ; i >=0 ; i--){
            if (oldEmail.charAt(i) == '.'){
                startIndex = i;
                break;
            }
        }
        domain = oldEmail.substring(startIndex);
        switch (domain) {
            case ".id":
                finalPrice = 1.75 * price;
                break;
            case ".com":
                finalPrice = 1.5 * price;
                break;
            case ".net":
                finalPrice = 1.25 * price;
                break;
            default:
                finalPrice = price;
                break;
        }
        System.out.printf("Nama email baru: %s@%s%s\n", newName, company, domain);
        System.out.printf("Nama domain untuk Elon: %s%s\n", company, domain);
        System.out.printf("Total harga pembelian: %.2f$", finalPrice);
        braws.close();
    }
}
