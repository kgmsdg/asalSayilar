import java.util.Scanner;

public class Main {

    static boolean asal(int num, int initial){
        if (num <= 2) return false;
        if (num % initial == 0) return false;
        if (initial * initial > num) return true;
        return asal(num,initial + 1);
    }

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int num = scan.nextInt();
        boolean isAsal = asal(num,2);
        System.out.printf((isAsal) ? "%s sayısı ASALDIR !\n" : "%s sayısı ASAL değildir !\n", num);
    }
}

