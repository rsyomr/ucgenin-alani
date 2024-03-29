import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Değişkenleri tanımlayalım
        double alan, a, b, c, u ;
        //Kullanıcıdan verileri alaım
        Scanner input = new Scanner(System.in);
        System.out.print("1. Kenarı Giriniz : ");
        a = input.nextDouble();
        System.out.print("2. Kenarı Giriniz : ");
        b = input.nextDouble();
        System.out.print("3. Kenarı Giriniz : ");
        c = input.nextDouble();
        u = (a + b + c) / 2;
        alan = Math.sqrt (u * (u-a) * (u-b) * (u-c));
        System.out.print("Üçgenin Alanı : " + alan);


    }
}
